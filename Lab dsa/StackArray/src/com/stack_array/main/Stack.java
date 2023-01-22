package com.stack_array.main;
import java.util.Scanner;

public class Stack {
	int top;   
    int maxsize = 10;  
    int[] arr = new int[maxsize];  
    
    boolean isEmpty()  
    {  
        return (top < 0);  
    }
    
    Stack()  
    {  
        top = -1;  
    } 
    
    boolean push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("Overflow !!");  
            System.out.println();
            return false;  
        }  
        else   
        {  
            System.out.println("Enter Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed"); 
            System.out.println();
            return true;  
        }  
    }
    
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow !!"); 
            System.out.println();
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
            System.out.println();
            return true;  
        }
    }
    
    void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }
        System.out.println();
    }  
 
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);  
    Stack s = new Stack();   
    while(choice != 4)  
    {  
        System.out.println("1- Push\n2- Pop\n3- Show\n4- Exit");  
        System.out.println("Enter your choice");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                s.push(sc);  
                break;  
            }  
            case 2:  
            {  
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                s.display();  
                break;  
            }  
            case 4:   
            {  
                System.out.println("Exiting....");  
                System.exit(0);  
                break;   
            }  
            default:  
            {  
                System.out.println("Please Enter valid choice ");  
            }   
        }  
    }  
}
}