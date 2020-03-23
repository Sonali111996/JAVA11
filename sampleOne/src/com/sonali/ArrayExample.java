package com.sonali;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {

        Integer[] i1=new Integer[12];// while creating a array using new keyword ,
        // all the elements are initialized to default value as "null" for object and 0 for primitive types

        int[] i2=new int[1]; // takes as 0 except int everything has been taken as null;
        String[] i3=new String[1];
        Double[] i4 = new Double[1];
        Short[] i5=new Short[11];
        Byte[] i6=new Byte[1];
        char[] i7=new char['c'];
        System.out.println(i1[0]+" "+i2[0]+" "+i3[0]+" "+i4[0]+" "+i5[0]+" "+i6[0]+" "+i7[0]);


        List orginal=new ArrayList<>();
        orginal.add(null);
        System.out.println(orginal);// can be added
        List l=List.copyOf(orginal);//can't add null value as copyof (unmodifiable).
        System.out.println(l);



        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
       // String name = reader.readLine();

        int sum=0;
        for(String arg :args){
            sum +=Integer.valueOf(arg);
        }
        System.out.println(sum);

        List<String> list=new ArrayList<>(List.of("A","B"));
        System.out.println(list);//A,B
        String[] array1={"C"};//array1=C
        System.out.println(array1[0]); //array1={0}
        String[] array2=list.toArray(array1);// The toArray method with an array parameter allocates an a new array
        //if the argument isn't large enough. This length of this new array is equal to that of the original list
        // array2=A,B
        System.out.println(array2[0]);
        array1[0]="D";
        System.out.println(Arrays.toString(array2));


/*
       int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr1, 5);
        int[] arr3 = {1,2,5,3};
        int[] arr4={1,2,5,3,2};
        System.out.println(Arrays.mismatch(arr1,arr3));// return the index where it has mismatched
        System.out.println(Arrays.mismatch(arr1,arr4));
        System.out.println(Arrays.mismatch(arr1,arr1));// return -1 if no mismatch has found.
        System.out.println(arr2.length);
        System.out.println(Arrays.compare(arr1,arr2));
        System.out.println(Arrays.compare(arr1,arr4));// compare lexicographically .return 1 if arr1>arr2 else -1 or
                                                       //  arr1=arr2 then 0
        System.out.println(Arrays.binarySearch(arr1,2));//return index position
        System.out.println(Arrays.binarySearch(arr2,0,5,4));
        */

    }
}
