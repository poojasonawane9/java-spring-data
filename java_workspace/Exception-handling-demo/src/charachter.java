import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class charachter {
	
	public static void main(String[] args) {
		 
//	      Pattern pattern = Pattern.compile("[a-zA-Z]*");
//	 
//	      String str = "abc5";
//	      Matcher matcher = pattern.matcher(str);
//	 
//	      if (!matcher.matches()) {
//	           System.out.println("string '"+str + "' contains special character");
//	      } else {
//	           System.out.println("string '"+str + "' doesn't contains special character");
//	      }
		int number =5;
		int fact =1;
		for(int i = 1;i <= number;i++) {
			fact = fact * i;	
		}
		System.out.println(fact);
	  }
}
