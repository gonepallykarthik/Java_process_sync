import OOP_LLD.Practice.Animal;
import OOP_LLD.Practice.Cat;
import OOP_LLD.Practice.Dog;

import java.util.*;

public class Main {

    public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int [] ans = new int[healths.length];
        HashMap<Integer, Integer> mp = new HashMap<>();
        char[] direc = directions.toCharArray();

        for(int i=0; i<positions.length; i++){
            mp.put(positions[i], i);
        }
        Arrays.sort(positions);
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<positions.length; i++){
            int idx = mp.get(positions[i]);

            // if direction is right simply append to stack
            if(direc[idx] == 'R') {
                st.push(idx);
            }
            // if direction is left
            else {
                while(!st.empty() && direc[st.peek()] == 'R' && healths[idx] > 0 ) {
                    int idx2 = st.pop();

                    if(healths[idx] > healths[idx2]) {
                        healths[idx2] = 0;
                        healths[idx] -= 1;
                    }
                    else if (healths[idx] < healths[idx2]) {
                        healths[idx2] -= 1;
                        healths[idx] = 0;
                        st.push(idx2);
                    }
                    else {
                        healths[idx] = 0;
                        healths[idx2] = 0;
                    }
                }
                if(healths[idx] > 0) {
                    st.push(idx);
                }
            }
        }

        while(!st.empty()) {
            int idx = st.peek();
            ans[idx] = healths[idx];
            st.pop();
        }

        List<Integer> ans1 = new ArrayList<>();
        for(int num : ans) {
            ans1.add(num);
        }
        return ans1;
    }

    public static void PlayWithAnimals(Animal a ){
        a.play();
    }

    public static void PlayWithAnimals(Animal [] animals) {
        for(int i=0; i<animals.length; i++){
            animals[i].play();
        }
    }

    public static int numUniqueEmails(String[] emails) {
        if(emails.length == 0) {
            return 0;
        }
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<emails.length; i++){
            String email = emails[i];
            String[] words = email.split("@");
            String name = words[0];
            String domain_name = words[1];
            int plusIdx = name.indexOf('+');
            if(plusIdx != -1) {
                 name = name.substring(0, plusIdx);
            }
            name = name.replaceAll("\\.", "");
            String proccessed = name + "@" + domain_name;
            set.add(proccessed);
            System.out.println("p is " + proccessed);
        }

        return set.size();
    }

    public static int lengthOfLastWord(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int cnt = 0;
        int len_last_word = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') {
                len_last_word = cnt;
                cnt = 0;
            }
            else {
                cnt += 1;
                System.out.println("c is " + cnt);
            }
        }
        len_last_word= cnt;
        System.out.println(len_last_word);
        return len_last_word;
    }

    public static void main(String[] args) {
        String[] emails = new String[] {"a.............@b.com", "a++++++@b.com"};
        int res = numUniqueEmails(emails);
        System.out.println(res);
        lengthOfLastWord("   fly me   to   the moon  ");
    }

}