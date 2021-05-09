import java.util.*;
class Swap15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1 No");
int i=sc.nextInt();
System.out.println("2No");
int j=sc.nextInt();

System.out.println("Before Swapping");
System.out.println(+i);
System.out.println(+j);
int temp=i;
i=j;
j=temp;
System.out.println("After Swapping");
System.out.println(+i);
System.out.println(+j);
}
}


