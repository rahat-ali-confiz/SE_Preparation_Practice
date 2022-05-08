package Problems.Stack;

import java.util.Stack;

public class ReverseStringUsingStack {

    public String reverseStringUsingStack(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty())
            str.append(stack.pop());

        return str.toString();
    }


    public boolean isPair(String str) {
        Stack<Character> bracket = new Stack<>();

        char[] c1 = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(c1[i]=='(' || c1[i]=='{' || c1[i]=='[')
                bracket.push(str.charAt(i));
            if(c1[i]==')'){
                if(bracket.isEmpty() || bracket.peek()!='(')
                    return false;
                else
                    bracket.pop();
            }
            if( c1[i]=='}'){
                if(bracket.isEmpty() || bracket.peek()!='{')
                    return false;
                else
                    bracket.pop();
            }
            if( c1[i]==']'){
                if(bracket.isEmpty() || bracket.peek()!='[')
                    return false;
                else
                    bracket.pop();
            }
        }

        return bracket.isEmpty();
    }
}
