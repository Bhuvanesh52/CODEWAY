package codeway;

import java.util.Scanner;

public class studentgradecalculation {//Task - 2

	static void DisplayResult(int SumUp,int NoSubj)
	{
		int Percentage=(SumUp*100)/(NoSubj*100);
		System.out.println("\n*******************************************");
		System.out.println("Total Mark : "+SumUp+" out of "+(NoSubj*100));
		System.out.println("Average Mark: "+(SumUp/NoSubj));
		System.out.println("Percentage : "+Percentage+" % ");
		if(Percentage<40)
		{
			System.out.println("Grade : F");
		}else if(Percentage>=40 && Percentage<60)
		{
			System.out.println("Grade : E");
		}
		else if(Percentage>=60 && Percentage<70)
		{
			System.out.println("Grade : D");
		}else if(Percentage>=70 && Percentage<80)
		{
			System.out.println("Grade : C");
		}else if(Percentage>=80 && Percentage<90)
		{
			System.out.println("Grade : B");
		}else if(Percentage>=90 && Percentage<=100)
		{
			System.out.println("Grade : A");
		}
		System.out.println("*******************************************");

	}
	public static void main(String[] args) {
		int NoSubj=0;
		int SumUp=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("*********************Student Grade Calculator************************\n");
		System.out.print("Enter the Total No of Subject : ");
		NoSubj=sc.nextInt();
		int MarkField[]=new int[NoSubj];
		
		for(int iter=0;iter<NoSubj;iter++)
		{
			System.out.print("Enter Mark "+(iter+1)+" : ");
			MarkField[iter]=sc.nextInt();
			if(!(MarkField[iter]>=0 && MarkField[iter]<=100))
			{	iter--;
				System.out.println("Marks should between 0 to 100");
			}else {
				SumUp+=MarkField[iter];//Here we get the sum of all subject
			}
		}
		
		DisplayResult(SumUp,NoSubj);
		

	}

}
