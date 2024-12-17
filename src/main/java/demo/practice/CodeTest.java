package demo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CodeTest {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(4,"Name1"));
        al.add(new Student(7,"Name7"));
        al.add(new Student(10,"Name10"));
        al.add(new Student(43,"Name43"));
        al.add(new Student(11,"Name11"));
        al.add(new Student(14,"Name14"));
        al.add(new Student(2,"Name2"));

//      List<Student> al2= al.stream().filter(e->e.getRoll()<10).collect(Collectors.toList());
//        System.out.println(al2.toString());
        System.out.println(al);
        Collections.sort(al,new Student.SortStudentByRoll());
        System.out.println(al);
    }

    public static String solution(String S) {

        char sary[]=S.toCharArray();
      int qCount=0;
      for(Character ch:sary){
          if(ch=='?')
              qCount++;
      }
      if(qCount%2!=0)
          return "NO";
      
      return "NO";
    }

}
class Student{
   private int roll;
   private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    static class SortStudentByRoll implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.roll-o2.getRoll();
        }
    }
}