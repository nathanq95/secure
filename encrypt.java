package secure;
public class encrypt{

	String cipher(String txt, int shift){
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
}