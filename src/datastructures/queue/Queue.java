/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.queue;

/**
 *
 * @author DELL
 */

// using concept of circular array

public class Queue {
    int arr[] = new int[5];
    int size = 0;
    int front = 0;
    int rear = 0;
    
    // insertting element into queue
    public void enqueue(int data){
        if(!isFull()){
            arr[rear] = data;
            rear = (rear+1)%5;
            size++;
        }else{
            System.out.println("Queue is Full!");
        }
    }
    
    // removing element from queue
    public int dequeue(){
        int data;
        if(!isEmpty()){
            front = (front+1)%5;
            size--;
            data = arr[front];
            return data;
        }else{
            System.out.println("Queue is empty!");
            return -1;
        }
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)%5]+" ");
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public boolean isFull(){
        return getSize() == 5;
    }
    
}
