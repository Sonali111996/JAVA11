package com.sonali;
public class Inheritance {
    //Protected method can be overridden by subclasses and inner classes. No restriction. We should keep in mind that the
    //return type and signature must be same.


    public static void main(String[] args) {
        Inheritance i=new Test5();
        i.Test(2);
    }
    protected Number Test(Number num) {
        System.out.println("1" + num);
        return num;
    }

    protected static class Test1 extends Inheritance {
        protected Number Test(Number num1) {
            System.out.println("2" + num1);
            return num1;
        }
    }

    protected static class Test2 extends Inheritance {
        protected Number Test(Number num1) {
            System.out.println("3" + num1);
            return num1;
        }
    }
    public static class Test3 extends Inheritance {
        public Number Test(Number num) {
            System.out.println("s4" + num);
            return num;
        }
    }
    public static class Test4 extends Inheritance {
        protected Number Test(Number num) {
            System.out.println("5" + num);
            return num;
        }
    }
}

class Test5 extends Inheritance{
    protected Number Test(Number num){
        System.out.println("6"+num);
        return num;
    }
}


