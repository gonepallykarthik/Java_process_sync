package MasterSlaveArchitecture;

import java.util.ArrayList;
import java.util.List;

public class Master {
    private List<String> dataList;

    public Master(){
        this.dataList = new ArrayList<>();
    }

    public synchronized void add(String data){
        System.out.println("adding data!! " + data);
        this.dataList.add(data);
    }

    public synchronized List<String> syncToSlave(int offset){
        List<String> data = this.dataList.subList(offset, dataList.size());
        return data;
    }

}
