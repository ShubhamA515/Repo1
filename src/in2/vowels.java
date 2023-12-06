package in2;

public class vowels 
{
public static void main(String[] args) {
	String s="HELLO WORLD";
	

	String abc= s.toLowerCase();
	
	int count=0;
	
	for(int i=abc.length()-1; i>=0; i--)
	{
		char vowel=abc.charAt(i);
		
		
		if((vowel=='a')|| (vowel=='e')||(vowel=='i')||(vowel=='o')||(vowel=='u'))
		{
			count++;
		}
		
		
		}
	System.out.println(count);
}
}





//1. Write a program to print the following based on a given number:
//Divisible by 2 - "Hello"
//Divisible by 3 - "World"
//Divisible by 2 and 3 - "Hello World"
//
// 
//
//Example: 9
//output: World
//
// 
//
//Example: 12
//output: Hello World
//
// 
//
//(OR)
//
// 
//
//2. Write a program to output the number of vowels in a given string.
//
// 
//
//Example: Hello World
//output: 3
//
// 
//
//(OR)
//
// 
//
//3. Write a program to output the characters in a given string occuring more than once.
//
// 
//
//Example: Hello World
//output: l o