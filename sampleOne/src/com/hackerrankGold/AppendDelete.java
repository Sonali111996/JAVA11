package com.hackerrankGold;

public class AppendDelete {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("y","yu",2));
    }
    static String appendAndDelete(String s, String t, int k) {
        int operations=0;
        for(int i=0;i<s.length();i++){
            if(s.regionMatches(i,t,0,t.length())){
                System.out.println(i);
            }
        }
        return "No";
    }
}
