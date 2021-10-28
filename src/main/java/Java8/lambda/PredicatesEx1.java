package Java8.lambda;

import Java8.lambda.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesEx1 {

    public static void main(String[] args) {

        // Ex 1
        Predicate<String> predicate = (s) -> true;
        boolean b = predicate.test("anyString");
        System.out.println("This predicate returns always "+ b);

        // Ex 2 -  Returns true if string starts with 'A'
        Predicate<String> predicate1 = (s) -> s.startsWith("A");
        boolean b1 = predicate1.test("Adapa");
        boolean b2 = predicate1.test("Raghu");
        System.out.println("for Adapa "+ b1);
        System.out.println("for Raghu "+ b2);


        // Ex 3 -  Returns true if string starts with 'A'
        Predicate<User> predicate3 = (u) -> {
            System.out.println("in Predicate Ex3");
          return u.getName().startsWith("A");
        };


        // Ex 4 -  Print users whose names not starting with 'R'
        System.out.println("--- Example 4 output : ---");
        List<User> usersList = new ArrayList<>(List.of( new User(1,"Adapa"),
                                        new User(2,"Raghu"),
                                        new User(3,"Anitha"),
                                        new User(4,"Swetha")
        ));

        Predicate<User> filter = (u) -> u.getName().startsWith("R");
        // this default removeIf method presend in Collection class - it expects predicates
        usersList.removeIf( filter );

        // printing the list with foreach - it takes Consumer obj
        usersList.forEach(u-> System.out.println(u.getName()));



        // Ex5 : shortcut writing for ex4
        System.out.println("\n--- Example 5 output : Print whose names start with 'A' ---");
        List<User> anotherUsersList = new ArrayList<>(List.of( new User(1,"Adapa"),
                new User(2,"Raghu"),
                new User(3,"Anitha"),
                new User(4,"Swetha")
        ));

        anotherUsersList.removeIf(u-> !u.getName().startsWith("A"));
        anotherUsersList.forEach(user -> System.out.println(user));

    }
}
