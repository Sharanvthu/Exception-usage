package exception;

import javax.print.DocFlavor.STRING;

public class login {

	public login() {
	}

	public static void main(String[] args) {
		int password=123;
		String userId="admin";
		if (userId.equals("admin")&&password==123)
		{
			System.out.println("Login successful");
		}
		else
		{
			try
			{
				throw new invalidloginException("Invalid login");
			}
			catch( Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
