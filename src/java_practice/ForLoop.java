package java_practice;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		/*for(int i=0;i<=100;i++) {
			System.out.println(i);
			if(i==60)
			{ System.out.println("we got 60 now");
			break;
			}
				
			
		}*/
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter GDP=" );
		int gdp= input.nextInt();
		
		if(gdp>=10) {
			System.out.println("Country is developed");
			
		} else {
			System.out.println("country is developing");
		}
		

	}

}
