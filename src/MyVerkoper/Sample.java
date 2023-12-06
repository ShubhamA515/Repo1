package MyVerkoper;

import java.util.ArrayList;

import org.apache.commons.collections4.Get;

public class Sample 
{
public static void main(String[] args) 
{
//	nums_list = [2, 4, 6, 8, 10, 12]
//			target_value = 14
//			# Output: [(4, 10), (6, 8), (2,12)]	
	
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(2);
	al.add(4);
	al.add(6);
	al.add(8);
	al.add(10);
	al.add(12);
	
	for(int i=3; i<=al.size()-1;i++)
	{
		int num = 14-al.get(i);
		
		if(al.contains(num))
		{
			
			System.out.println(al.get(i)+","+num);
			//System.out.println(num);
			System.out.println("==");
			
		}
	}
	
	
	
	
	
}
}
