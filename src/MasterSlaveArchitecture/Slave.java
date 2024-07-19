package MasterSlaveArchitecture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Slave {
    private List<String> Updates;
    private int lastReadIdx;
    private Master master;
    private ScheduledExecutorService scheduledService;

    public Slave(Master master){
        this.Updates = new ArrayList<>();
        this.lastReadIdx = 0;
        this.master = master;
        this.scheduledService = Executors.newScheduledThreadPool(1);
    }

    public void startSync(){
        System.out.println("started syncing from master!! ");
        scheduledService.scheduleAtFixedRate(this::syncWithMaster, 3, 5, TimeUnit.SECONDS);
    }
    private void syncWithMaster(){
       List<String> updates = this.master.syncToSlave(lastReadIdx);
       for(String s : updates) {
           this.Updates.add(s);
       }
       System.out.println("sync completed from master!! ");
       lastReadIdx = lastReadIdx + updates.size();
       if(updates.size() == 0) {
           // stop syncing from master
           this.stopSync();
           System.out.println("stopped syncing! ");
       }
    }

    public void stopSync(){
        this.scheduledService.shutdown();
    }

    public void showData(){
        for(String s : this.Updates) {
            System.out.println("strings are " + s);
        }
    }
}
