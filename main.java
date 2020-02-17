package secure;
import java.io.*;
import java.util.Scanner;

public class main{
	
	public static void main(String args[]) throws IOException {
	  FileReader in = null;
   	  BufferedReader buff = null;
      FileOutputStream out = null;
      Scanner reader = new Scanner(System.in);  // Reading from System.in
	  System.out.println("Enter a .txt file: ");
	  String input = reader.next(); 

	  try{
	  	in = new FileReader(input+".txt");
	  	//System.out.println(in.toString());
	  	buff = new BufferedReader(in);

	  	String currentLine;

	  	buff = new BufferedReader(new FileReader(input+".txt"));
	  	while((currentLine = buff.readLine()) != null){
	  		System.out.println(currentLine.substring(0,1));
	  	}


	  }finally{
	  	if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
	  }
	}

	}
}