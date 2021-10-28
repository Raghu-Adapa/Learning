package Java8.lambda;

import Java8.lambda.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEx1 {

    public static void main(String[] args) {

        // Ex1 - takes User obj and returns string
        System.out.println("\n--- Example 1 output : ");

        Function<User, String> fun = (u) -> u.getName();
        User user = new User(1,"Raghu");
        String s = fun.apply(user);

        System.out.println(s);


        // Ex2 - take list and return names of users
        System.out.println("\n--- Example 2 output : ");

        List<User> usersList = new ArrayList<>(List.of( new User(1,"Adapa"),
                new User(2,"Raghu"),
                new User(3,"Anitha"),
                new User(4,"Swetha")
        ));
        List<String> names = new ArrayList<>();

        Function<User, String> fun1 = (u) -> u.getName();

        usersList.forEach(u->{
            // applying function on each user
            // taking the name of user and adding to new list called names
            names.add( fun1.apply(u) );
        });
        System.out.println("Added names to new list and size of names is "+ names.size());



        // Ex3
        System.out.println("----Ex3 Printing UsersList and namesList---");
        usersList.forEach(u -> System.out.println(u));
        names.forEach(u -> System.out.println(u));

        System.out.println(" Print names again");
        names.forEach(name -> System.out.println(name));
    }
}
