/**
Ques. --> 20
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    1.Open brackets must be closed by the same type of brackets.
    2.Open brackets must be closed in the correct order.

 

Example 1:

Input: s = "()"
Output: true



**/

public class Solution {
	public boolean isValid(String s) {
        // Approach1
		// char[] stack = new char[s.length()];
		// int head = 0;
		// for(char c : s.toCharArray()) {
		// 	switch(c) {
		// 		case '{':
		// 		case '[':
		// 		case '(':
		// 			stack[head++] = c;
		// 			break;
		// 		case '}':
		// 			if(head == 0 || stack[--head] != '{') return false;
		// 			break;
		// 		case ')':
		// 			if(head == 0 || stack[--head] != '(') return false;
		// 			break;
		// 		case ']':
		// 			if(head == 0 || stack[--head] != '[') return false;
		// 			break;
		// 	}
		// }
		// return head == 0;

        
        
       // Approach 2 
        
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){   // converts string to character array
            if(c=='(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                // stack.peek give the top element of the stack & check with closing parenthesis corresponding opening parenthesis
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else
               return false;
        }
        
        // if stack is not empty then the paranthesis is not valid
        return stack.isEmpty();
	}
}
