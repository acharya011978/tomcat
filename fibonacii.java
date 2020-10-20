class Fibonacci { 
	public static void main(String[] args) { 
		int n = 10, t1 = 0, t2 = 1;
//	       	System.out.print("First " +  n + " terms: \n ");		        
		System.out.println(" t1 " + " t2 " + " sum " + "\n" );
	       	System.out.println(" --------------------------- " +  "\n" );
	      	for (int i = 1; i <= n; ++i) { 
			
			int sum = t1 + t2; 
			t1 = t2; 
			t2 = sum; 
	//		if (t1 == 0)
		 		System.out.println( t1 + " " + t2 + " " + sum + "\n " ); 
	//		else 
	//			System.out.println( t1 + " " + t2 + " " + 

						
//			sum + "\n " );

		
        }
    }
}

