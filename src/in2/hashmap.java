package in2;

import java.util.HashMap;
import java.util.Set;

public class hashmap 
{
public static void main(String[] args) {
	String org="India is my country";

	org=org.toLowerCase();
	
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	
	for(int i=0;i<=org.length()-1; i++)
	{
		char s1 = org.charAt(i);
		
		
		if(hm.containsKey(s1))
		{
			hm.put(s1, hm.get(s1)+1);
		}
		else
		{
			hm.put(s1, 1);
		}
	}
	
	Set<Character> allkeys = hm.keySet();
	
	for(Character key:allkeys)
	{

		if(hm.get(key)>1)
		{
		System.out.println(key+":"+hm.get(key));	
		}	
	}
}
}
