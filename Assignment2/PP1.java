 class PP1 
{    
   public static void main(String args[])   
   {    
  
       int i, j, row = 9;   
	   int z=1;

       for (i=1; i<row; i++)   
       {  

         for (j=row; j>=i; j--)   
           {  

            System.out.print(" ");   
            }   

        for (j=1; j<=i; j++ )   
           {   

           System.out.print(z+" ");   
            }  
                z++;			

           System.out.println();   
}   
}   
}  
			 