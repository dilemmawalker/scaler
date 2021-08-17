 class prob7{
    static int a=5;
    void check(){
        System.out.println(a);
        a++;
        System.out.println(a);
    }
     void main(){
        System.out.println(a);
    }
}
  class prob5{
public  static void main(String[]args){
    // prob7 t=new prob7();
    // t.check();
    // System.out.println(t.a);
    // prob7 tt=new prob7();
    // tt.check();
    prob7 ttt=new prob7();
    System.out.println(ttt.a);
    ttt.a=7;
    prob7 t=new prob7();
    System.out.println(t.a);
}
}