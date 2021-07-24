package Collections.Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.ListIterator;

// sorting ArrayList using Comparator and comparable 
public class SortArrayListCC {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(122, "Virat", 36));
        list.add(new Student(123, "HC verma", 45));
        list.add(new Student(145, "VCS", 25));
        
        // Sort by accending order by Student age using Comparable
        Collections.sort(list);
        System.out.println("Sorted by age using comparable: ");
        ListIterator<Student> it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        // Sort by descending order by Student name using Comparator
        Collections.sort(list,(Student o1,Student o2)->{
            return o2.getStudentname().compareTo(o1.getStudentname());
        });
        
        System.out.println("Sorted by name in desc: ");
        for(Student s:list){
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student>{

    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    
    @Override
    public int compareTo(Student comparestu) {
        int compareage=((Student)comparestu).getStudentage();
        /* For Ascending order*/
        return this.studentage-compareage;
    }
    
    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }
    
    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}
