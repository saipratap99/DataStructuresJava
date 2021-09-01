/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class SastraTest {
    public static void main(String[] args) {
        List<SastraCourse> courses = getCourses("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DataStructures\\src\\Collections\\Programs\\sush.txt");
        Map<Integer,List<SastraCourse>> semWise;
        semWise = courses.stream().collect(Collectors.groupingBy(SastraCourse::getSem));
        
        for(Map.Entry<Integer,List<SastraCourse>> m:semWise.entrySet()){
            
            int credits = m.getValue().stream().collect(Collectors.summingInt(SastraCourse::getCredits));
            double sgpa = m.getValue().stream().collect(Collectors.summingInt(SastraCourse::getCredPoints));
            sgpa /= credits;
            System.out.println("\n\nSEM: " + m.getKey() + " | Total Credits: " + credits +" | SGPA: " + String.format("%.4f", sgpa) + "\n");
            m.getValue().forEach(System.out::println);
        }
    }
    
    public static List<SastraCourse> getCourses(String fileName){
        List<SastraCourse> li = new LinkedList<>();
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            boolean l = true;
            while((line = br.readLine()) != null){
                
                String[] data = line.split("\\s+");
                StringBuilder sb = new StringBuilder();
                for(int i=5;i<data.length-2;i++)
                    sb.append(data[i] + " ");
                SastraCourse s = new SastraCourse(Integer.parseInt(data[0]), Integer.parseInt(data[3]), data[4], sb.toString().trim(),Integer.parseInt(data[data.length - 2]),data[data.length-1]);
                //System.out.println(s);
                li.add(s);
            }            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return li;
    }
}
