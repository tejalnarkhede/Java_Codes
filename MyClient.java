import java.io.*;
import java.net.*;

public class MyClient  {

	public MyClient() throws Exception
	{
		Socket s=new Socket("localhost",1234);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Message for server : ");
		String str=br.readLine();
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println(str);
		System.out.println(pw.checkError());
	}
	
	public static void main(String[] args) throws Exception
	{
		new MyClient();
	}
}
