package com.stack_array.entity;

import java.util.Scanner;

public class Stack {
	int top;   
    int maxsize = 10;  
    int[] arr = new int[maxsize];  
    
    boolean isEmpty()  
    {  
        return (top < 0);  
    }
    
    public Stack()  
    {  
        top = -1;  
    }
    
    public boolean push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("Overflow !!");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
            return true;  
        }  
    }
    
    public boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow !!");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
            return true;  
        }  
    }
    
    public void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }
    
}
