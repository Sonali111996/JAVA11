package com.sonali;

public class StringBuilderDelete {
    private static Object Integer;

    public static void main(String[] args) {
        Integer[] i={1,2,6,7};
        String s = "jfjf nkjk khgjud";
         String p="\t \n";
        System.out.println(p.isEmpty()+" "+p.isBlank());

        String str = "g";
        char[] c={'a','b','e','g','g'};
        char[] b={'w','p','l','v'};
        float f=1.2f;
        StringBuilder sb = new StringBuilder("ABCD");
        sb.replace(1,3,"C").insert(4,"Q");
        System.out.println(sb);//capacity 16

        sb.append(c,0,4);
        int s1=sb.codePointAt(0);
        sb.delete(0,1);
        sb.replace(0,1,"o");
       // sb.insert(0,i);
        sb.insert(1,b,0,3);
        sb.insert(0,f);
        sb.insert(0,str);
        sb.insert(0,str);
        System.out.println(sb.capacity());
        System.out.println(sb.lastIndexOf(str,2));
        StringBuilder sb1 = new StringBuilder(2); //capacity 16+2=18
        Integer CharSequence = 12;
        StringBuilder sb2 = new StringBuilder((Integer) CharSequence);
       sb2.append(Integer);
        System.out.println(sb+" "+s1);
    }
}
