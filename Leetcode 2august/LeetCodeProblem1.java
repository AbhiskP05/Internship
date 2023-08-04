package com.InternshipFlipRobo;

// Java program to add two numbers
// represented by linked list

import java.util.*;

// Node Class
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

// Public class
public class LeetCodeProblem1 {

    // convertList method to
    // convert Integer to List
    public static Node convertList(int num){
        Node l = null;
        while(num != 0){
            l = new Node(num%10, l);
            num = num/10;
        }
        return l;
    }

    // toInteger method to
    // convert List to Integer
    public static int toInteger(Node l){
        Node curr = l;
        int ans = 0;
        while(curr != null){
            ans = ans*10 + curr.data;
            curr = curr.next;
        }
        return ans;
    }

    // reverse method to reverse
    // the Linked List
    public static Node reverse(Node head){
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        return head;
    }

    // addList to add the content
    // of the Linked List
    public static Node addList(Node l1, Node l2){
        l1 = reverse(l1);
        l2 = reverse(l2);
        int num1 = toInteger(l1);
        int num2 = toInteger(l2);
        int sum = num1 + num2;
        Node l3 = convertList(sum);
        l3 = reverse(l3);
        return l3;
    }

    // printList to print the content
    // of the Linked List
    public static void printList(Node ans){
        Node curr = ans;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    // main method
    public static void main(String[] args){
        int x = 243;
        int y = 564;
        Node l1 = convertList(x);
        Node l2 = convertList(y);
        Node ans = addList(l1, l2);
        printList(ans);
    }
}


