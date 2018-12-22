import java.util.Scanner;

public class numberpal {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("----------------------------------");
System.out.println("Please Enter the Cheking Number :");
int userNumber=input.nextInt();
		// TODO Auto-generated method stub
int reminder;// reminder % 10 will be reminder number 
int reversOrder=0;
int testNumber=userNumber; // assigning unserNumber into testNumber to validate later on.
while(userNumber> 0)// if userNumber input number is grater than 0 then  enter the while loop
{
	reminder=userNumber%10;
	userNumber=userNumber/10;
	reversOrder=reversOrder*10+reminder;
	}
if(testNumber==reversOrder)
{
	System.out.println(" It is a palindrome ");
	}
else
{
	System.out.println("Not a palindrome ");
	}
	}
}



	