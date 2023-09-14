import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s=new Socket("localhost",2021);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Type Message for server : ");
			String str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			String str1=din.readUTF();
			System.out.println("Server : "+str1);
			
		}
		
		
	}

}
