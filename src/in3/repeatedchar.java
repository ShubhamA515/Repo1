package in3;

import java.util.HashMap;
import java.util.Set;

public class repeatedchar 
{
public static void main(String[] args) 

{

	String s="GeekforGeeks";
	
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	
	for(int i=0;i<=s.length()-1;i++)
	{
		char org = s.charAt(i);
		
		if(hm.containsKey(org))
		{
		hm.put(org, hm.get(org)+1);	
		}
		
		else
		{
			hm.put(org, 1);
		}
		
	}
	
	Set<Character> all = hm.keySet();
	
	for(Character ch:all)
	{
		//if(>2) {
		System.out.println(ch+":"+hm.get(ch));
		}
	}
	
	

}
