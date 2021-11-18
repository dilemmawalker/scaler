import java.util.Scanner;
class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        for(int i=2001;i<=2021;i++){
            String n=""+i+"";
            String rev=(new StringBuilder(n)).reverse().toString();
            String day=rev.substring(0,2);
            String month=rev.substring(2);
            int d=Integer.parseInt(day);
            int m=Integer.parseInt(month);
            String ans=day+"-"+month+"-"+i+"";
            if(m>=1 && m<=12 && d>=1){
                if((m==2 && d<=28) || (m==2 && leap(i) && d<=29)){
                    System.out.println(ans);
                }
                else if((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) && d<=31){
                    System.out.println(ans);
                }
                else if((m==2 || m==4 || m==6 || m==9 || m==11) && d<=30){
                    System.out.println(ans);
                }
            }
        }
    }
    public static boolean leap(int year){
        if(year%4==0 && year%400==0)
        return true;
        return false;
    }
}   
//
