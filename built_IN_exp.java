import java.util.*;
class  myexception extends Exception {
	void show_exception()
	{
	System.out.println("you reached to five can' proceed further");
	}

	}	
class built_IN_exp{
		public static void main(String args[])
		{
			try
			{
			for(int i=1;i<=10;i++)
				{
				System.out.println(i);
				if(i==5)
				throw new myexception();
				}
			}
			catch(myexception e)
			{
			e.show_exception();
			}

		}
}
