package com.rays.oop;
import java.util.Stack;

public class PushStack {
	public static void main(String[] args) {
		Stack s =new Stack();
		for(char i='a';i<='z';i++) {
			s.push(i);
		}
		System.out.println("1st Stack List is :- " +s);
		Stack s1= new Stack();
		char value;
		for(char i='a';i<='z';i++) {
			value =(char)s.peek();
			s1.push(value);
			s.pop();
		}
		System.out.println("2nd Stack List is :- " +s1);
		Stack s2 =new Stack();
		for(char i='a';i<='z';i++) {
			value =(char)s1.peek();
			s2.push(value);
			s1.pop();
	}
		System.out.println("3rd Stack List is :- " +s2);
}
}