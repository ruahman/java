package org.ruahman;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world");

        Scanner scanner = new Scanner(System.in);
        String hello = scanner.nextLine();
        System.out.println(hello);

        org.ruahman.variables.Demo.Run();
        org.ruahman.classes.Demo.Run();



        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"dog","cat","bird"};
        Character[] charArray = {'H','E','L','L','O'};

        genericMethod(charArray);
        genericMethod(stringArray);
        genericMethod(intArray);

        System.out.println(genericGetFirst(intArray));
        System.out.println(genericGetFirst(stringArray));
        System.out.println(genericGetFirst(charArray));

        MyGenericClass<Integer> mgClass1 = new MyGenericClass<Integer>(333);
        System.out.println(mgClass1.getValue());

        MyGenericClass<Character> mgClass2 = new MyGenericClass<Character>('H');
        System.out.println(mgClass2.getValue());

        MyGenericClass<String> mgClass3 = new MyGenericClass<String>("Hello World");
        System.out.println(mgClass3.getValue());

        int ix = 3;
        Integer intX = new Integer(ix);

        int ri = intX.intValue();

        // auto box int
        Integer autoInt = 7;

        // auto unbox
        int unboxi = autoInt;

        org.ruahman.threads.ThreadDemo.demo();
        org.ruahman.collectons.generics.Demo.run();
    }// end main(...)

    static public <T> void genericMethod(T[] array){
        for(T item: array){
            System.out.println(item);
        }
    }

    static public <T> T genericGetFirst(T[] array){
        return array[0];
    }


}

class MyGenericClass <T> {
    T x;

    MyGenericClass(T x){
        this.x = x;
    }

    T getValue(){
        return x;
    }
}



interface Talk {
    void talking();
}

abstract class Person {
    String name;
    Person(String name){
        this.name = name;
    }

    // can not override this
    public final void sayHello(){
        System.out.println("hi there");
    }

    public abstract void sayHi();
}

// prevents this class from being extended
final class Student extends Person implements Talk{

    Student(String name) {
        super(name);
    }

//    @Override
//    public void sayHello(){
//        System.out.println("this is final");
//    }

    @Override
    public void sayHi(){
        System.out.println("sayHi");
    }

    @Override
    public void talking() {
        System.out.println("i'm talking here");
    }
}

class Emp {
    int eid;
    int salary;
    static String ceo;

    static {
        // this is where you initialize static members.
        ceo = "static ceo";
    }
}
