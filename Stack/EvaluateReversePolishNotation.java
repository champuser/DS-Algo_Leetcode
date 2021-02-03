/**  Ques-150
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

    Division between two integers should truncate toward zero.
    The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.

Example 1:

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9



**/

class Solution {
    public int evalRPN(String[] tokens) {
        // reverse polish parenthesis means postfix notation
        // here in this question given input is a postfix... we have to evaluate
        Stack<Integer> stack = new Stack<> ();
        int value1,value2;
        
        for(int i=0;i<tokens.length;i++){
            switch(tokens[i]){
                case "+":
                    // simply add two popped element  & pushed it on stack
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    // this case the order matters i.e substract the last popped element from after that popped element
                    value1 = stack.pop();
                    value2 = stack.pop();
                    stack.push(value2-value1);
                    
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    value1 = stack.pop();
                    value2 = stack.pop();
                    stack.push(value2/value1);
                    break;
                default:
                    // it will take string & convert it into Integer
                    stack.push(Integer.parseInt(tokens[i]));
                    
            }
        }
        // return the element from the stack as it dont know it reaches to token length 
        return stack.pop();
        
    }
}
