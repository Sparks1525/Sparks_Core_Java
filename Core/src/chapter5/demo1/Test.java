package chapter5.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5,6,4,2,7);
        Set<Integer> set =  new TreeSet<>(list);

        System.out.println(set);
    }
}
