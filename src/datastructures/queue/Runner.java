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
public class Runner {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(17);
        q.enqueue(9);
        q.show();
        q.dequeue();
        q.show();
        q.enqueue(1);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(78);

        q.show();
        
    }
}
