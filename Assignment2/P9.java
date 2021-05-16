class P9
  {
     public static void main(String args[]) {

        int n = 5;
        int i, j;
		int a=65;

         for (i = 0; i<=n; i++)
		 {  

              for (j = 5; j>=i; j--) 
			  { 

               System.out.print(" "); 

              }
			  for (j = 0; j<=i; j++) 
			  { 

                System.out.print((char)(a+j)+" "); 

              }
			  System.out.println();
		 }

            
          }

}

 
		             
		

