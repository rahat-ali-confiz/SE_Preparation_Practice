package Problems.Stack;

import java.util.Stack;

class StackDriver {
    Stack<Integer> s = new Stack<>();
    int minEle;

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

    public int getMin(){

        if(s.isEmpty())
            return -1;
        Stack<Integer> s1 = new Stack<>();
        minEle = s.peek();
        while(!s.isEmpty()){


            if(s.peek()<minEle)
                minEle = s.peek();
            else
                s1.push(s.pop());
        }
        while(!s1.isEmpty())
            s.push(s1.pop());

        return minEle;
    }

    public int pop(){
        if(s.isEmpty())
            return -1;
        return s.pop();
    }
    public void push(int x) {
        s.push(x);
    }

}

