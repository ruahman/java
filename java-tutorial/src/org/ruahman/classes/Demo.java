package org.ruahman.classes;

import java.util.ArrayList;
import java.util.List;

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

public class Demo {
    public static void Run(){
        User user = new User();
        user.setFirstname("Diego");
        System.out.println(user.getFirstname());
        user.setLastname("Vila");
        System.out.println(user.getLastname());

        System.out.println(user);

        List<User> users = new ArrayList<User>();
        users.add(user);
        System.out.println(users);
    }
}
