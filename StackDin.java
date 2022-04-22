/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicstack02;

/**
 *
 * @author mpeht
 */
public class StackDin {

    protected Node letter;
    protected Node top;
    protected Node topInverse;
    protected int size;

    public StackDin() {
        this.letter = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(char elem) {
        Node newNode = new Node(elem);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        } else {
            Node temp = top;
            top = top.getNext();
            return top.getLetter();
        }
    }

    public char consultTop() {
        if (isEmpty()) {
            return '\0';
        } else {
            return top.getLetter();
        }
    }

    public void Display() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
        } else {

            Node actual = this.top;
            while (actual != null) {
                actual.displayNode();
                actual = actual.getNext();
            }
            System.out.print(" " + actual + " ");
            System.out.println("");

        }
    }

    public void reversePrint() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
        } else {
            Node actual = this.top;
            Node prev;
            char ch;
            String phrase = " ";
            while (actual != null) {
                ch = actual.getLetter();
                phrase += ch;
                actual = actual.getNext();
            }
            System.out.println(new StringBuilder(phrase).reverse().toString());

        }
    }

    public void isPalindrome() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
        } else {
            Node actual = this.top;
            Node prev;
            char ch;
            String phrase = " ";
            while (actual != null) {
                ch = actual.getLetter();
                phrase += ch;
                actual = actual.getNext();
                phrase = phrase.trim();
            }
            String str;
            StringBuilder strb = new StringBuilder(phrase);
            str = strb.reverse().toString();

            if (phrase.equalsIgnoreCase(str)) {
                System.out.println(str + " is Palindrome of " + phrase);
            } else {
                System.out.println(str + " Is not Palindrome of " + phrase);
            }
        }

    }
}
