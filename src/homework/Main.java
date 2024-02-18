package homework;

import homework.user.UserInterface;
import homework.user.impl.User;

public class Main{
    public static void main(String[] args){
        UserInterface user = new User("Bob");
        user.run();
    }
}