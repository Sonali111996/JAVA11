package com.Udemy;

public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        double area=0;
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
        else{
            area=width*height;
            float required= (float) (( area/areaPerBucket)-extraBuckets);
            int x= (int) Math.abs(required);
           if(required>x){return ++x;}
           else{ return x;}

        }
    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        double area=0;
        if(width<=0 || height<=0 || areaPerBucket<=0 ){
            return -1;
        }
        else { area=width*height;
            int required= (int) Math.round(area/areaPerBucket);

            return required;
        }
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){return -1;}
        else {int required= (int) Math.round(area/areaPerBucket);

            return required;

        }

    }


    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75,0.75,0.5,0));
    }
}
