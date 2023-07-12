public class Reverse
{
public static void main(String[] args)
{
	int remainder,reverse=0,sum=0,n=123;
	
	while(n>0)
	{
		remainder=n%10;
		reverse=sum*10+remainder;
		n=n/10;
		System.out.print(reverse);
	}
	
}
}
