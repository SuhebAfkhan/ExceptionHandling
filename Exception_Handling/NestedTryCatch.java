//*************Nested Try*************

package Exception_handling;

public class NestedTryCatch {

	public static void main(String[] args) {
		try
		{
			String a=null;
			try
			{
				int[] arr= {10,20};
				arr[20]=100;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Error is : "+e);
			}
		}
		finally
		{
			System.out.println("Finally block executed.");
		}
		

	}

}
