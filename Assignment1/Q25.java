class Q25
{
public static void main(String args[])
{
int n=116;
int rem=0;
int i=1;
int oct=0;
int dec=0;
while(n!=0)
{
 rem=n%10;    
dec+=(rem*i);                
n/=10;            
i*=8;                      
}
System.out.println(dec);


}
}