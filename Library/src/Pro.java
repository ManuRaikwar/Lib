import java.util.Scanner;



public class Pro
{
	static Scanner sc=new Scanner(System.in);
	private static void acceptRecord(User user) 
	{
		System.out.println("enter email :");
		sc.nextLine();
		user.setEmail(sc.nextInt());
		System.out.println("enter password :");
		sc.nextLine();
		user.setPassword(sc.nextInt());
	}
	private static void changePassword(User user) 
	{
		System.out.println("new email :");
		sc.nextLine();
		user.setPassword(sc.nextInt());
		
	}
	private static void editProfile(User user) 
	{
		System.out.println("new email :");
		sc.nextLine();
		user.setEmail(sc.nextInt());
		System.out.println("new mobile :");
		sc.nextInt();
		user.setMobile(sc.nextInt());
	}
   public static int menu()
   {
	   System.out.println("0.exit");
	   System.out.println("1.sign in");
	   System.out.println("2.sign out");
	   return sc.nextInt();
   }
  public static int menu1() 
   {
	  System.out.println("0.sign out");
	  System.out.println("1.edit profile");
	  System.out.println("2.change password");
	  System.out.println("3.subjectwise copies report");
	  System.out.println("4.bookwise copoies report");
	  System.out.println("5.fees/fine report");
	  return sc.nextInt();
		
	}
	public static void main(String[] args)
	{
		int choice;
		User user=new User();
		while((choice=menu())!=0)
				{
			switch(choice)
			{
			case 1:
				acceptRecord(user);
			while((choice=menu1())!=0)
	     	{
	 		    switch(choice)
		     	{
			case 1:
				editProfile(user);
				break;
			case 2:changePassword(user);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			
			}
				
				}

				break;
			case 2:
				break;
			
			}
				
				}

	}
	

}
