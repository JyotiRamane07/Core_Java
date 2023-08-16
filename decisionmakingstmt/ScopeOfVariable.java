package com.jsp.decisionmakingstmt;
public class ScopeOfVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;//global
		int choice=1;
		switch(choice)
		{
		case 0:
		   {
			int b=20;//local variable
			System.out.println(b);
		   }
		case 1:
		   {
			   System.out.println(a);
			   /*System.out.println(b);//Compile Time Error :variable cannot be resolved */
		   }
			
		}
		
		

	}

}
;