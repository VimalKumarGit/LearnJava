package Base.foundation;
import java.util.Scanner;
public class ScanInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your Name: ");	
		String Name = ip.nextLine();
		System.out.println("Your name is: "+ Name);
		//System.out.println("your name is: "+ Name);
		
		System.out.println("Enter your Mobile no: ");
		long Mobile = ip.nextLong();
		System.out.println("Your Mobile no is: "+Mobile);	
		
		
				

	}

}
