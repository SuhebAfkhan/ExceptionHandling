//************Throw Keyword***********

package Exception_handling;

public class TestThrow {
	 public static void print(int a)
     {
    	 if(a<18)
    	 {
    		 throw new ArithmeticException("You are not eligible!!");
    		
    	 }
    	 else 
    	 {
    		 System.out.println("!!!!!!!!!!You are eligible!!!!!!!!!!!");
    	 }
     }
	public static void main(String[] args) {
    
		
     print(15);
     System.out.println("rest of code");
	}

}
