package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public String arrangeWords(String text) {
        String[] str = text.split(" ");
        PriorityQueue<Integer> pq = new PriorityQueue<>((s1, s2)-> str[s1].length() - str[s2].length()==0?s1-s2:str[s1].length()-str[s2].length());
        for(int i = 0;i< str.length;i++){
            pq.add(i);
        }
        StringBuilder ans = new StringBuilder(text.length());
        int i = 0;
        while(!pq.isEmpty()){
            int temp = pq.poll();
            if(i==0){
                ans.append(str[temp].substring(0, 1).toUpperCase()+str[temp].substring(1));
            }
            else{
                ans.append(" ");
                ans.append(str[temp].toLowerCase());
            }
            i++;
        }

        return ans.toString();




    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
