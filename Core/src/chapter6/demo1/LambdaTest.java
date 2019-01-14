package chapter6.demo1;

import javax.swing.*;
import javax.swing.Timer;
import java.util.*;


public class LambdaTest {


    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury","Venus","Earth","Mars",
        "Jupiter","Saturn","Uranus","Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets,(first,second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event ->
                System.out.println("The time is "+new Date()));
        t.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);


        GreetingService greetService1 = message ->
                    System.out.println("Hello! " + message);
        greetService1.sayMessage("Runoob");

        MyLambda myLambda = (message, myLambda1) ->
                System.out.println("Hello! " + message + "," + myLambda1);
        myLambda.sayMessage("message", "myLambda");
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    interface MyLambda {
        void sayMessage(String message, String myLambda);
//


    }

}
