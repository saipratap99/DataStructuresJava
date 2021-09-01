/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Programs;

/**
 *
 * @author DELL
 */
public class SastraCourse {
    protected int sem;
    protected int year;
    protected String code;
    protected String name;
    protected int credits;
    protected String grade;
    protected int points;

    public SastraCourse(int sem, int year, String code, String name, int credits , String grade) {
        this.sem = sem;
        this.year = year;
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
        if(grade.equals("S"))
            this.points = 10;
        else if(grade.equals("A+"))
            this.points = 9;
        else if(grade.equals("A"))
            this.points = 8;
        else if(grade.equals("B"))
            this.points = 7;
        else if(grade.equals("C"))
            this.points = 6;
        else if(grade.equals("D"))
            this.points = 5;
        else if(grade.equals("E"))
            this.points = 0;
        else if(grade.equals("F"))
            this.points = 0;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getCredPoints(){
        return credits*points;
    }
    
    @Override
    public String toString() {
        return "COURSE - " + "sem: " + sem + ", year: " + year + ", code: " + code + ", name: " + String.format("%-50s", name) + ", grade: " + String.format("%-3s", grade) + ", credits: " + credits + ", points: " + points;
    }

    
}
