package com.hackerrank;

public class PageCount {
    public static void main(String[] args) {
        System.out.println(pageCount(6,5));
    }
    static int pageCount(int n, int p) { //if odd.. same page
        int count=0;
        int mid=n/2;
        if(p>mid){
            if(n%2==0){
                count=(n-p+1)/2;
                return count;
            }
            count=(n-p)/2;
        }
        else {
            count=p/2;
        }
        return count;

    }
}
