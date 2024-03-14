package codeway.atmInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ATM_Service {
	List<ATM_Entity> Atm_db=new ArrayList<ATM_Entity>();
	Scanner sc=new Scanner(System.in);
	//UserName Validation
	public boolean checkUserName(String Username)
	{
		if(Atm_db.isEmpty())
		{
			return true;
		}else {
			for(ATM_Entity db:Atm_db)
			{
				if(db.getUserName().equals(Username))
				{
					return false;
				}
			}
		}
		return true;
	}
	//PassWord Validation
	public ATM_Entity PassCodeCheck(String Username,String PassCode)
	{
		if(Atm_db.isEmpty())
		{
			return null;
		}else {
			for(ATM_Entity db:Atm_db)
			{
				if(db.getUserName().equals(Username) && db.getPassWord().equals(PassCode))
				{
					return db;
				}
			}
		}
		return null;
	}
	private static void disp(ATM_Entity db)
	{
		System.out.println("Account User : "+db.getUserName());
		System.out.println("Account balance : "+db.getBalance_Amount());
	}
	public void ATM_Control(ATM_Entity db)
	{
		int Option=0,amountWD=0,amountDP=0;
		disp(db);
		while(true)
		{
		System.out.println(" Press 1 for withdraw \n Press 2 for deposit \n press 3 to checkBalance \n");
		Option=sc.nextInt();
		switch(Option)
		{
		case 1://Withdraw
			System.out.println("Enter Amount Here");
			amountWD=sc.nextInt();
			if(db.getBalance_Amount()>=amountWD)
			{
				db.WDBalance_Amount(amountWD);
				System.out.println("Balance Amount : "+db.getBalance_Amount());
				System.out.println("Transaction Success");
			}else {
				System.out.println("No Sufficent amount in your bank account");
				System.out.println("Transaction Failed");
			}
			break;
		case 2://Deposit
			System.out.println("Enter Amount Here");
			amountDP=sc.nextInt();
			db.setBalance_Amount(amountDP);
			System.out.println("Balance Amount : "+db.getBalance_Amount());
			System.out.println("Transaction Success");
			break;
		case 3://Account Balance Check
			System.out.println("Balance Amount : "+db.getBalance_Amount());
			break;
		}
		if(!(Option>=1 && Option<=3))break;
		
		}
		
	}
	public void CreateAccount(String Username,String Passcode)
	{
		Atm_db.add(new ATM_Entity(Username,Passcode));
		System.out.println("Account activated");
	}
}
