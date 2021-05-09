class Q24
{
public static void main(String args[])
{
int n=10101;
int rem=0;
int i=1;
int oct=0;
while(n!=0)
{
 rem=n%10;

oct+=rem*i;
 n/=10;
i*=2;
}
System.out.println(oct);


}
}