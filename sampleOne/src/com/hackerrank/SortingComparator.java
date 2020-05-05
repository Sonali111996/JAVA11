package com.hackerrank;

import java.util.Arrays;
import java.util.Comparator;

public class SortingComparator implements Comparator<Player> {




    @Override
    public int compare(Player a, Player b) {
        int x= b.score-a.score;
        if(b.score==a.score){
            x=a.name.compareTo(b.name);
        }
        return x;
    }

}
class Player{
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        Player player1=new Player("amy",100);
        Player player2=new Player("david ",100);
        Player player3=new Player("heraldo ",50);
        Player player4=new Player("aakansha ",50);
        Player[] players={player1,player2,player3,player4};
        SortingComparator sc=new SortingComparator();
        Arrays.sort(players,sc);
        Arrays.sort(players,sc);
        for (int i=0;i<players.length;i++){
            System.out.println("name : "+players[i].name+" score : "+players[i].score);
        }



    }
}
