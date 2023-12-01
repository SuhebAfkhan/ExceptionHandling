//**********Try with Multiple catch blocks*************

package Exception_handling;

public class TryWithMulCatch {

	public static void main(String[] args) {

int[] num= {1,2,3,4,5};

try {
	
num[10]=31;
}
catch(ArithmeticException a1)
{
System.out.println("Error : "+a1);
}
catch(ArrayIndexOutOfBoundsException a2)
{
System.out.println("Error : "+a2);
}
catch(NullPointerException a3)
{
System.out.println("Error : "+a3);
}




	}

}
