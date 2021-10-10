package org.ruahman.collectons.generics;

// Collection(Interface) -> List(Interface) -> ArrayList(Class)

// List, Set, Map

import java.util.*;

public class Demo {
    public static void run(){

        ArrayList<String> listItems = new ArrayList<String>();

        listItems.add("dog");
        listItems.add("bird");
        listItems.add("cat");

        for(String item: listItems){
            System.out.println(item);
        }

        // ArrayList is a type of list,
        // List is just the interface but you don't
        // initiat it
        List<Integer> grades = new ArrayList<Integer>();
//        List<Integer> grades = Arrays.asList(1,2,3,4,5);
//
        grades.add(5);
        grades.add(10);

        System.out.println(grades.get(0));
//        Collection values = new ArrayList();
        // can index list
        List values = new ArrayList();

        values.add(1);
        values.add("one");
        values.add('a');

        System.out.println(values);

        for(Object item : values){
            System.out.println(item);
        }

        List<Integer> iValue = new ArrayList<Integer>();
        iValue.add(1);
        iValue.add(2);
        iValue.add(3);
        iValue.add(4);
        iValue.add(5);

        for(Integer x : iValue){
            System.out.println(x);
        }

        Collections.reverse(iValue);
        for(Integer x : iValue){
            System.out.println(x);
        }

        Collections.shuffle(iValue);
        for(Integer x : iValue){
            System.out.println(x);
        }

        Collections.sort(iValue);
        for(Integer x : iValue){
            System.out.println(x);
        }

        Comparator<Integer> c = (Integer a, Integer b) -> {
            return a < b ? 1 : -1;
        };

        Collections.sort(iValue, c);
        for(Integer x : iValue){
            System.out.println(x);
        }


        Set<Integer> set = new HashSet<Integer>();
        set.add(7);
        set.add(7);
        set.add(7);
        set.add(7);
        set.add(7);
        set.add(7);
        set.add(3);

        System.out.println(set);

        Map map = new HashMap();
        map.put("foo","bar");
        map.put(312,773);
        map.put(3.14,2.17);

        for(Object key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
