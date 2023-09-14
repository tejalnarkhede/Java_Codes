import java.net.*;
import java.io.*;

public class MyServer  {
	public MyServer() throws Exception
	{
	ServerSocket ss=new ServerSocket(1234);
	Socket s=null;
	while(true)
		{
		s=ss.accept();
		System.out.println("Got client : "+s.getInetAddress());
		System.out.println("Got Client Port : "+s.getPort());
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();
		System.out.println("Client : "+str);		
		}
	}
	
	public static void main(String args[]) throws Exception
	{
		new MyServer();
	}
	

	
}
