import java.util.Scanner;
class LoginPage 
{
     public static boolean SpecialChar(char ch)
	 {
       
        return !(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z') &&  !(ch >= '0' && ch <= '9');
           
    }
	public static void main(String[] args) 
	{

		 final int Upper_letter=1;
		 final int Lower_latter=3;
		 final int Digit=1;
		 final int specialcharacter=1;
		   	int upperCount=0;
			int lowerCount=0;
			int digitCount=0;
			int letterCount=0;
			int special=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password");
		String input=sc.nextLine();
		
			if (input.length()<=8)
			{
			
			for (int i=0;i<input.length() ;i++ )
	      {
			char ch=input.charAt(i);
			if (Character.isUpperCase(ch))
			
					upperCount++;
			
			else if (Character.isLowerCase(ch))
			
					lowerCount++;
			
			else if (Character.isDigit(ch))
			
						digitCount++;
			else if(SpecialChar(ch))
						special++;	
	      }
			}
			else
			{
				System.out.println("Enter your password at list 8 character");
			}

			if (upperCount>=Upper_letter && lowerCount>=Lower_latter && digitCount>=Digit && special>=specialcharacter)
			{
				 System.out.println(" valid  password");
			}
			else
			{
				
				if (upperCount  < Upper_letter)
					{
						System.out.println("Enter  at list one character is Upper case ");
					}
				if (lowerCount < Lower_latter)
					{
						System.out.println("Enter  at list three character is lower case ");
					}
				if (digitCount < Digit)
					{
						System.out.println("Enter  at list one digit ");
					}
				if (special < specialcharacter)
				   {
						System.out.println("Enter  at list one special  Character ");
				   }
			}
			
		}
}