import java.util.Scanner;
public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner userInput = new Scanner(System.in);
		int decVal= 26; 
		//correct
		System.out.println(decVal);
		float pi = 3.14_15F;
		System.out.println(pi);
		//incorrect underscores have to be located within digits
		//float pi1 = 3_.1415F;
		//correct
		long socialSecurityNumber = 999_99_9999L;
		System.out.println(socialSecurityNumber);
		//incorrect
		//long socialSecurityNumber1 = 999_99_9999_L;
		//incorrect 
		//int x8 = 0x52_;
	}
	
}

