package rahul;

import java.rmi.AlreadyBoundException;

public class ExceptionDemo {
	
	//one try can be followed by multiple catch
  
	public static void main(String[] args) {
		
		int a =7;
		int b =0;
		
		
	try{	int c =7/0;
	//	int x[]= new int[5];
	//	System.out.println(x[7]);
		System.out.println(c);
	}
	
	catch(IndexOutOfBoundsException ar){
		System.out.println("bound exception");
	}
		
		
			catch(ArithmeticException ar){
				System.out.println("I catch arithematic exception");
			}
			
		catch(Exception e){
			System.out.println("I catch the exception");
			
		
		  }	
	finally{
		System.out.println("Delete the cookies");
	}

	}

}
