// Valid parentheses
import java.util.*;
public class string3 {
    public static void main(String args[]) 
    {
        String str = "{()[]}";
        Stack<Character> s = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') 
            {
                s.push(ch);
            } 
            else 
            {
                if (s.isEmpty()) 
                {
                    flag = false;
                    break;
                }
                if ((s.peek() == '{' && ch == '}') || 
                    (s.peek() == '(' && ch == ')') || 
                    (s.peek() == '[' && ch == ']')) 
                    {
                    s.pop();
                } 
                else 
                {
                    flag = false;
                    break;
                }
            }
        }

        if (!s.isEmpty()) 
        {
            flag = false;
        }

        if (flag) 
        {
            System.out.println("Valid parentheses");
        } else {
            System.out.println("Invalid parentheses");
        }
    }
}