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
public class Node {
    
    public char letter;
    public Node next;

    public Node(char data) {
        this.letter = data;
        this.next = null;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public void displayNode()   {
        System.out.print(" " + letter + " ");
    }

   
    
}
