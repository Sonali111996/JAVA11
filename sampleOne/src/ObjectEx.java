public class ObjectEx {
    int a,b,c;
    void  MethodA(int a) {
        a = setA(a);
        System.out.println(a);
        System.out.println(setBC(a,a));

    }
    void MethodB(int a, int b){
        b=setBC(a,b);
        System.out.println(b);
    }
    private int setA(int a){
      a=a;
        System.out.println("1"+a);
       return a;
    }
    private int setBC(int a,int b){
        c=b=a;
        System.out.println(c);
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        ObjectEx o=new ObjectEx();
        o.MethodA(2);
        o.MethodB(1,1);
        o.setA(1);
        o.setBC(1,1);
    }
}
