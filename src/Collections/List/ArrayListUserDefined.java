/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.List;

import java.util.*;
/**
 *
 * @author DELL
 */
class Student{
    String Name;
    int Regno;
    String Dept;

    public Student(String Name, int Regno, String Dept) {
        this.Name = Name;
        this.Regno = Regno;
        this.Dept = Dept;
    }

    @Override
    public String toString() {
        return  "Name=" + Name + ", Regno=" + Regno + ", Dept=" + Dept +"\n" ;
    }
    
}

public class ArrayListUserDefined {
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<>();
        
        // Creatin student objects
        Student s1 = new Student("Sai Pratap",122005067,"EEE");
        Student s2 = new Student("Elon Musk",122004168,"CSE");
        Student s3 = new Student("Tesla",122005111,"EEE");
        
        // adding items to the list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        // 
        System.out.print(list);
    }
}
