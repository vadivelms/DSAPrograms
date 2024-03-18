package demo.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProblem {
    public static void main(String[] args) {
       Set<Integer> testSet=new HashSet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        testSet.add(4);
        testSet.add(5);
        Iterator it=testSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
