package com.Udemy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAdventureGameMain {
    private static Map<Integer, MapAdventureGame> locations = new HashMap<Integer, MapAdventureGame>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        locations.put(0,new MapAdventureGame(0,"Not going anywhere"))
        locations.put(1,new MapAdventureGame(1,"Home"));
        locations.put(2,new MapAdventureGame(2,"SSVM Gajspati Nagar"));
        locations.put(3,new MapAdventureGame(3,"Den Hotel"));
        locations.get(1).addHashMap("EAST",2);
        locations.get(1).addHashMap("NORTH",3);
        locations.get(2).addHashMap("WEST",1);
        locations.get(3).addHashMap("SOUTH",1);


        int locId=1;
        while(true) {
            if(locId==0)break;
            System.out.println("Available Exits");
            System.out.println(locations.get(1).getDescription());
            String x=sc.nextLine();

        }





//        locations.put(0, new MapAdventureGame(0, "You are sitting in front of computer learning Java"));
//        locations.put(1, new MapAdventureGame(1, "You are standing at the end of a road before a small brick building"));
//        locations.put(2, new MapAdventureGame(2, "You are at the top of the hill"));
//        locations.put(3, new MapAdventureGame(3, "You are inside a building,a well house for a small spring"));
//        locations.put(4, new MapAdventureGame(4, "You are in a valley beside a stream"));
//        locations.put(5, new MapAdventureGame(5, "You are in the forest"));
//
//        locations.get(1).addHashMap("W", 1);
//        locations.get(1).addHashMap("N", 5);
//        locations.get(1).addHashMap("S", 4);
//        locations.get(1).addHashMap("E", 3);
//
//        locations.get(2).addHashMap("N", 5);
//
//
//        locations.get(3).addHashMap("W", 1);
//
//
//        locations.get(4).addHashMap("N", 1);
//        locations.get(4).addHashMap("W", 2);
//
//        locations.get(5).addHashMap("S", 1);
//        locations.get(5).addHashMap("W", 2);
//
//        Map<String, String> vocabulary = new HashMap<String, String>();
//        vocabulary.put("QUIT", "Q");
//        vocabulary.put("NORTH", "N");
//        vocabulary.put("SOUTH", "S");
//        vocabulary.put("WEST", "W");
//        vocabulary.put("EAST", "E");
//
//        int loc = 1;
//        while (true) {
//            System.out.println(locations.get(loc).getDescription());
//            if (loc == 0) {
//                break;
//            }
//
//            Map<String, Integer> exits = locations.get(loc).getHm();
//            System.out.print("Available exits are ");
//            for (String exit : exits.keySet()) {
//                System.out.print(exit + ", ");
//            }
//            System.out.println();
//
//            String direction = sc.nextLine().toUpperCase();
//            if (direction.length() > 1) {
//                String[] words = direction.split(" ");
//                for (String word : words) {
//                    if (vocabulary.containsKey(word)) {
//                        direction = vocabulary.get(word);
//                        break;
//                    }
//                }
//            }
//
//            if (exits.containsKey(direction)) {
//                loc = exits.get(direction);
//
//            } else {
//                System.out.println("You cannot go in that direction");
//            }
//
//
//        }
//    }
    }
}
