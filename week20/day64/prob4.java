import java.util.*;
import java.util.Scanner;
class prob4{
public static Scanner scn=new Scanner(System.in);
	public static void main (String[] args)
	{
		// your code goes here
		// abcd xyz=>Abcd Xyz
		String str=scn.nextLine();
        // str="xyz abc MNQ";
        str+=" ";
		int n=str.length();
		String temp="";
		String ans="";
		
		for(int i=0;i<n;i++){
			char ch=str.charAt(i);
			if(ch==' '){
				ans=ans+""+temp.substring(0,1).toUpperCase() +"" + temp.substring(1).toLowerCase()+" ";
				temp="";
			}
			else{
				temp=temp+""+ch;
			}
		}

		System.out.println(ans);
}
}