package org.ruahman.variables;

import java.time.LocalDate;
import java.util.Date;

public class Demo {
    public static void Run(){
        char A = 'a';
        int number = 100;
        double floatNum = 4.55;
        System.out.println(floatNum);
        Date data = new Date();
        String name = "diego";
        System.out.println(name.toUpperCase());
        System.out.println("hello java");
        LocalDate now = LocalDate.now();
        System.out.println(now);

        final int myNum = 15;
        //myNum = 20;  // will generate an error: cannot assign a value to a final variable

        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
    }
}
