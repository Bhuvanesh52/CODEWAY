package codeway;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {//Task - 1

	static boolean display(int RoundWon,int UserScore)//To display the Scores
	{
		System.out.println("----------------------------------------------------\n");
		System.out.println("RoundWon : "+RoundWon);
		System.out.println("FinalScore : "+UserScore+"\n");//The Score depends upon the number of attempts.
		System.out.println("----------------------------------------------------");
		System.out.println("PlayAgain Press 1");
		int FieldValue=sc.nextInt();
		if(FieldValue==1)
		{
			System.out.println("Enter no: ");
			return true;
		}
		return false;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Random random=new Random();
		int GeneratedRandomNumber=random.nextInt(1,99);
		int Attemps=0,MaxAttempts=10,UserScore=0,RoundWon=0,FieldValue=0;
		System.out.println("******NUMBER GAME******");
		System.out.println("\t\t\t\tRange in between 1 to 99");
		while(true)
		{
			if(MaxAttempts<=Attemps)
			{
				System.out.println("******Game Over******");
				if(display(RoundWon,UserScore))
				{
					Attemps=0;
					UserScore=0;
					GeneratedRandomNumber=random.nextInt(1,99);
					//System.out.println(GeneratedRandomNumber);
					continue;
				}else {
					break;
				}
			}
			System.out.print("Enter no: ");
			FieldValue=sc.nextInt();
			if(GeneratedRandomNumber>FieldValue || GeneratedRandomNumber<FieldValue)
			{
				System.out.println((GeneratedRandomNumber-FieldValue) > 0?"too low!":"too high!");
				Attemps++;
			}else {
				UserScore+=100-(Attemps*10);
				RoundWon++;
				System.out.println("******Congratulations******");
				if(display(RoundWon,UserScore))//Reset
				{
					Attemps=0;
					UserScore=0;
					GeneratedRandomNumber=random.nextInt(1,99);//Generate new target
					//System.out.println(GeneratedRandomNumber);
					continue;
				}else {
					break;
				}
			}
		}
		System.out.println("Bye See you again....");

	}

}
