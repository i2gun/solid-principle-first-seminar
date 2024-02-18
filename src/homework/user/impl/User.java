package homework.user.impl;

import homework.persister.Saveable;
import homework.persister.impl.Persister;
import homework.user.Reportable;
import homework.user.UserInterface;

public class User implements UserInterface, Reportable {

    private final String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void run(){
        report();
        Saveable persister = new Persister(this);
        persister.save();
    }

    @Override
    public void report(){
        System.out.println("Report for user: " + name);
    }
}
