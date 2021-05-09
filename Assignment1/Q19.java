class Q19
{
public static void main(String args[])
{
int n=10;
int rem=0;
int i=1;
int Bin=0;
while(n!=0)
{
 rem=n%2;
n/=2;
Bin+=rem*i;
i*=10;
}
System.out.println(Bin);


}
}