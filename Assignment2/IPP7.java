 class IPP7
{  
   public static void main(String[] args)  
     {  
      int rows=9;
        int p=9	;  
       for (int i= 0; i<= rows; i++)  
         {  
          for (int j=0; j<=i; j++)  
             {  
              System.out.print(" ");  
             }  
                for (int k=0; k<rows-i; k++)  
              {  
               System.out.print(p + " ");  
              } 
                p--;			  
            System.out.println();  
       }  
}  
}  