package org.ruahman;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args){
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
//        Person person = new Person("Diego");
//        System.out.println(person.name);

//        Scanner scanner = new Scanner(System.in);
//        String nameInput = scanner.nextLine();
//        System.out.println(nameInput);

        // const
        final int Y = 777;

        // ArrayList is a type of list,
        // List is just the interface but you don't
        // initiat it
        List<Integer> grades = new ArrayList<Integer>();
//        List<Integer> grades = Arrays.asList(1,2,3,4,5);
//
        grades.add(5);
        grades.add(10);

        System.out.println(grades.get(0));

        User user = new User();
        user.setFirstname("Diego");
        System.out.println(user.getFirstname());
        user.setLastname("Vila");
        System.out.println(user.getLastname());

        System.out.println(user);

        List<User> users = new ArrayList<User>();
        users.add(user);

        ArrayList<String> listItems = new ArrayList<String>();

        listItems.add("dog");
        listItems.add("bird");
        listItems.add("cat");

        for(String item: listItems){
            System.out.println(item);
        }

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
    }

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

class User {
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String value){
        firstname = value;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String value){
        lastname = value;
    }

    @Override
    public String toString() {
        return "my string override";
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

