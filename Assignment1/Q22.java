class Q22
{
public static void main(String args[])
{
     int i=1010;
    int j=1;
    int dec=0;

    while(i!=0)
     {
           int r=i%10;
          dec=dec+(r*j);
          j*=2;
          i/=10;
     }
    System.out.print(dec);
}
}
