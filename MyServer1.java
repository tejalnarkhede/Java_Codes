import java.io.*;
import java.net.*;

public class MyServer1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServerSocket ss=new ServerSocket(2021);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			String str=din.readUTF();
			System.out.println("Client : "+str);
			System.out.println("Type Your Reply to client : ");
			String str1=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			
		}
		
		
	}

}
