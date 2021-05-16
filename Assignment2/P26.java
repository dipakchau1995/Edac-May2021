  class P26
{  
    public static void main(String[] args)  
      {  
        int rows=8;  
         for (int i= 0; i<= 8; i++)  
          {  
             for (int j=0; j<=i; j++)  
            {  
           System.out.print(" ");  
            }  
          for (int k=0; k<=8-i; k++)  
         {  
          System.out.print("*" + " ");  
           }  
          System.out.println();  
}  
}  
}  