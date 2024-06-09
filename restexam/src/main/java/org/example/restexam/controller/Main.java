package org.example.restexam.controller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()==0){
                answer+=" ";
            }else{
                arr[i]= arr[i].toLowerCase();
                char ch = Character.toUpperCase(arr[i].charAt(0));
                answer+= ch+arr[i].substring(1);
                if(i<arr.length-1){
                    answer+=" ";
                }

            }
        }
        int idx=0;
        int idx1=1;
        while(s.substring(s.length()-idx1,s.length()-idx).equals(" ")){
            answer+=" ";
            idx++;
            idx1++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "  for the what 1what  ";
        String sa[] = s.split(" ",-1);
//        for(String str : sa){
//            System.out.println(str);
//        }
        System.out.println(solution(s));

    }
}
