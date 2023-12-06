package in1;

public class s1 
{
public static void main(String[] args) {
	
	int s=24;
	
	int count=0;
	
	for(int i=2;i<s;i++)
	{
		if(s%i==0)
		{
			count++;
			break;
		}
	
	}
	if(count>=1)
	{
		System.out.println("Given number is not a prime number");
	}
	
	else
	{
		System.out.println("Given number is prime number");
	}
	
	
	}
}

