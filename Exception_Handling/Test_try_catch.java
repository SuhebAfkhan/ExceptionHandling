
//  ***********Normal Try Catch*****************

package Exception_handling;

public class Test_try_catch {

	public static void main(String[] args) {


int[] num= {1,2,3};

try {
num[8]=3/0;
}
catch(ArithmeticException a1)
{
System.out.println("Error : "+a1);
}


	}

}





