package in1;

import java.util.Stack;

public class StringDecoder 
{
	public static String decodeString(String s) 
	{
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int i = 0;

        while (i < s.length()) 
        {
            char c = s.charAt(i);

            if (Character.isDigit(c)) 
            {
                int count = 0;
                
                while (Character.isDigit(s.charAt(i))) 
                {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                
                countStack.push(count);
            } 
            
            else if (c == '(') 
            {
                stringStack.push(currentString.toString());
                currentString = new StringBuilder();
                i++;
            } 
            
            else if (c == ')') 
            {
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                int repeatCount = countStack.pop();
                for (int j = 0; j < repeatCount; j++) 
                {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
                i++;
            } 
            
            else 
            {
                currentString.append(c);
                i++;
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String input = "4(DO)3(POD)2(RID)";
        String output = decodeString(input);
        System.out.println(output); // Output: DODODODOPODPODPODRIDRID
    }
}
