
package codeway;

import java.util.Scanner;

import codeway.atmInterface.*;

public class ATMMAIN {//Task - 3

	public static void main(String[] args) {
		int OptionHandler=0;
		String Username="",Passcode = "";
		Scanner sc=new Scanner(System.in);
		Scanner string=new Scanner(System.in);
		System.out.println("*********CodeWay Bank*********");
		ATM_Service atmService=new ATM_Service();
		while(true)
		{
		System.out.println("Login In With Existing Account \"Press 1\"\n"
							+ "Create New Account \"Press 2\"");
		OptionHandler=sc.nextInt();
		switch(OptionHandler)
		{
			case 1://Login
				while(true)
				{
				System.out.println("Enter UserName");
				Username=string.nextLine();
				System.out.println("Enter PinNumber(eg:XXXX - 4dig) : ");
				Passcode=string.nextLine();
				ATM_Entity db=atmService.PassCodeCheck(Username,Passcode);
				if(db!=null)
				{
					System.out.println("Please wait....");
					atmService.ATM_Control(db);
					break;
				}else {
					System.out.println("Check username And password...");
					continue;
				}
				}
				break;
			case 2://Signup
				while(true)
				{
				System.out.println("Enter UserName");
				Username=string.nextLine();
				System.out.println(Username);
				if(atmService.checkUserName(Username)) {
					break;
				}else {
					System.out.println("UserName already Exist...!");
				}
				}
				int i=0;
				while(i<4)
				{
					System.out.println("Enter PinNumber(eg:XXXX - 4dig) : ");
					Passcode=string.nextLine();
					if(Passcode.length()!=4)
					{
						System.out.println("Check PinNumber...");
						continue;
					}
					for(i=0;i<Passcode.length();i++)
					{
						if(!Character.isDigit(Passcode.charAt(i)))
						{
							System.out.println("Check PinNumber...");
							break;
						}
					}
				}
				atmService.CreateAccount(Username,Passcode);
				break;
			default:
				System.out.println("Thank You For Using Me");
				break;
				
		}
		}
		

	}

}
