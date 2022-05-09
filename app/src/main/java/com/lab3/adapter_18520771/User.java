package com.lab3.adapter_18520771;

import java.util.ArrayList;

public class User {
    public String name;
    public String hometown;

    public User(String name, String hometown){
        this.name = name;
        this.hometown = hometown;
    }

    public String getName(){
        return name;
    }

    public String getHometown(){
        return hometown;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("My Hoan", "Viet Nam"));
        users.add(new User("Taylor", "American"));
        users.add(new User("Justin", "France"));
        return users;
    }
}
