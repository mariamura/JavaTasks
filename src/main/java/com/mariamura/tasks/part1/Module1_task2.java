package com.mariamura.tasks.part1;

/* Program check if input text contains all closed brackets.
* "[({})]" - true
* "[(){}" - false
* "}[]{(}" - false
* "][[]{}}{(324}[(at).]sfg{}/[({})])(" - false
* "([{[[]{]}324[(at).]sfg{}/[({})]}])" - true
*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Module1_task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        System.out.println(areBracketsBalanced(a));

    }
    //my solution
    public static boolean checkOpenBrackets(String c) {
        String b = c.replaceAll("[^\\[\\]{}()]", "");
        int c1 = 0; //for [
        int c2 = 0; //for (
        int c3 = 0; //for {
        int d1 = 0; //for }
        int d2 = 0; //for )
        int d3 = 0; //for ]

        for (int i = 0; i<b.length(); i++) {
            if (b.charAt(i) =='[') {
                c1++;
                if (d1>c1) return false;
            }
            else if (b.charAt(i) =='(') {
                c2++;
                if (d2>c2) return false;
            }
            else if (b.charAt(i) =='{') {
                c3++;
                if (d3>c3) return false;
            }
            else if (b.charAt(i) =='}') {
                d1++;
                if (d1>c3) return false;
            }
            else if (b.charAt(i) ==')') {
                d2++;
                if (d2>c2) return false;
            }
            else if (b.charAt(i) ==']') {
                d3++;
                if (d3>c1) return false;
            }
        }
        return true;
    }

    //this method was taken from https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
    static boolean areBracketsBalanced(String expr) {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{'){
                // Push the element in the stack
                stack.push(x);
                continue;
            }
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.

            if (stack.isEmpty()) return false;

            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
}
