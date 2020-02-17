//package secure;
import java.io.*;
import java.util.Scanner;

public class adt{
	
	public static void main(String args[]) throws IOException {
	  FileReader in = null;
   	  BufferedReader buff = null;
      FileOutputStream out = null;
      PrintWriter fil = new PrintWriter( "out.txt" );
      Scanner reader = new Scanner(System.in);  // Reading from System.in
	  Scanner reader2 = new Scanner(System.in);
	  System.out.println("Enter a .txt file: ");
	  String input = reader.next(); 
	  String input2;

	  try{
	  	in = new FileReader(input+".txt");
	  	//System.out.println(in.toString());
	  	buff = new BufferedReader(in);

	  	String currentLine;
	  	String ciText = new String();

	  	buff = new BufferedReader(new FileReader(input+".txt"));



	  	System.out.println("Enter Option:");
	  	input2 = reader2.next();

	  	if(input2.compareTo("cipher") == 0){
	  	while ((currentLine = buff.readLine()) != null){
	  		ciText = cipher(currentLine.substring(0), 1);
	  		fil.println(ciText);
	  		//fil.println(deCipher(ciText, 1));
	  	}
	  }
	  else if(input2.compareTo("decipher") == 0){
	  	while ((currentLine = buff.readLine()) != null){
	  		ciText = deCipher(currentLine.substring(0), 1);
	  		fil.println(ciText);
	  		//fil.println(deCipher(ciText, 1));
	  	}
	  }
	  else{
	  	System.out.println("command not found");
	  }
	  	fil.close();



	  }finally{
	  	if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
	  }
	}

	}
	public static String cipher(String txt, int shift){
		String s = "";
    	int len = txt.length();

    	for(int x = 0; x < len; x++){
       	 char c = (char)(txt.charAt(x) + shift);
        	if (c > 'z')
            	s += (char)(txt.charAt(x) - (26-shift));
        	else
            	s += (char)(txt.charAt(x) + shift);
    	}
    	return s;
	}
	public static String deCipher(String txt, int shift){
		String s = "";
    	int len = txt.length();

    	for(int x = 0; x < len; x++){
       	 char c = (char)(txt.charAt(x) - shift);
        	if (c > 'z')
            	s += (char)(txt.charAt(x) + (26+shift));
        	else
            	s += (char)(txt.charAt(x) - shift);
    	}
    	return s;
	}
}