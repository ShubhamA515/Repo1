package in2;

import java.util.HashMap;
import java.util.Set;

public class print_repeating_chars 
{
public static void main(String[] args) 
{

	String s="hello world";
	
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	
	for(int i=0; i<=s.length()-1;i++)
	{
		char org=s.charAt(i);
		
		if(hm.containsKey(org))
		{
			hm.put(org, hm.get(org)+1);

		}else 
		{
			hm.put(org, 1);
		}
		
		
	}
	
Set<Character> allkeys = hm.keySet();
	
	//for printing all the chars
	for(Character key:allkeys)
	{
	if(hm.get(key)>1)
	{
		System.out.println(key+":"+hm.get(key));	
	}
		
	}
	
	
}
}
