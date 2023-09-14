package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyfile 
{
   public static void main(String[] args) throws IOException 
   {
      File fsrc=new File("input.txt");         //File Descriptor for source file
      File fdes=new File("output.txt");        //File Descriptor for destination file
      FileReader fr=new FileReader(fsrc);          //Creation of file reader object 
      BufferedReader br=new BufferedReader(fr);  //Creation of buffer reader object
      FileWriter fw= new FileWriter(fdes);      //Creation of file writer object 
      String s=null;
      while((s=br.readLine())!=null)             //Copying Content to the new file
      {
         fw.write(s);
         fw.write("\n");
         fw.flush();
      }
         fw.close();
   }

}