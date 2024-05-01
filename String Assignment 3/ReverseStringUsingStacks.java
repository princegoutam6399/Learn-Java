// ques - 16 Java String Program to Reverse a String Using Stacks

import java.util.Stack;

class ReverseStringUsingStacks{
	public static void main(String[] args){
		String str ="NAMAB";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
			st.push(str.charAt(i));
		while(!st.isEmpty()){
			System.out.print(st.pop());
		}
	}
}