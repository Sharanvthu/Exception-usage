package exception;

public class invalidloginException extends Exception
{
	private String msg;

	public invalidloginException(String msg) 
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
		
	}

}
