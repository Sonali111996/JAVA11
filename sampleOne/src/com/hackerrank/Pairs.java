package com.hackerrank;

import java.util.Arrays;

public class Pairs {
    public static void main(String[] args) {
        // 9828801 71437443 4878328 48879905 29900328 45561267 88492738 2948132 47252914 99670674
        // 31483080 60950504 87843396 70196769 29278335 92142011 10308684 60155882 79455743 80097614
        // 41465040 25452848 16900574 46816748 26246407 97176604 44941977 48160224 3683322 27445326 47038710
        // 94826188 96813720 10963610 80164685 59836745 86147619 77356360 46765339 29099296 59225218 8702797 36597293
        // 86509422 56026411 51876924 42347771 82466788 78053294 24502915 91092129 19883399 84956452 25958021 42854602
        // 33714364 45089085 41340067 76979172 83680442 60908370 74452151 84212088 38025832 44850588 92092141 48271193
        // 32905591 12298123 44000453 97151304 48814087 57587806 47479933 5606611 75522933 69222830 33544412 67909253
        // 79723470 74410915 42771522 65296361 18799445 28101522 74586504 44043283 25506533 2843436 68685331 84714184
        // 52540939 18971508 99410881 87635454 42590460 51857074 93454961 72012884 69867340 17080241
        // 42140870 75240708 25274144 59972413 10082223 22722788 52756515 59363055 45486596 89324658 42278427 26079790
        int[] arr={1,3,5,8,6,4,2};int k=2;
        System.out.println(pairs1(2,arr));
    }
    static int pairs(int k, int[] arr) {
     int count =0;
     for (int i=1;i<arr.length;i++){
         for(int j=1;j<i+1;j++) {
             if (arr[i] - arr[i - j] == k || arr[i] - arr[i - j] == (-k)) {
                 count++;
             }

         }
     }
     return count;
    }
    static int pairs1(int k, int[] arr) {
        int count=0;
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++) {
            if (Arrays.binarySearch(arr, arr[i] + k)>=0) {
                count++;
                System.out.print(arr[i]+" : ");
                System.out.println(arr[i]+k);

            }
        }

        return count;
    }
}
