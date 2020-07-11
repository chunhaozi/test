import java.util.Scanner;
import java.util.*;
public class Main{

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		int[]sum=new int[10000];
		String[]n=new String[10000];
		int i=0,f=0;;
		while(cin.hasNext()) {
			String s=cin.next();
			n[i]=s;
			int a=cin.nextInt();
			int b=cin.nextInt();
			int c=cin.nextInt();
			sum[i]=a+b+c;
			i++;
		}
		cin.close();
		int max=sum[0];
		for(int j=0;j<i;j++) {
			if(max<sum[j]) {
				f=j;
			}
		}
		System.out.println(n[f]);
	}
}