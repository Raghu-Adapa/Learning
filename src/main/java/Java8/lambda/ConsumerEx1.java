package Java8.lambda;

import Java8.lambda.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {

    public static void main(String[] args) {

        // Consumer Example 1
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Say Hello ");

        // Consumer Example 2
        Consumer<String> consumer1 = (String s) -> {
            System.out.println("From Consumer 2");
            System.out.println(s);
        };
        consumer1.accept("Say Hello1 ");

        // Consumer Example 3
        Consumer<User> consumer3 = (User u) -> {
            //write implementation here
            System.out.println("User Name is "+u.getName());
        };
        consumer3.accept(new User(1,"Adapa"));


        // Ex 4:

        System.out.println("--- Example 4 output :---");
        List<User> arr = Arrays.asList( new User(1,"Adapa"),
                new User(2,"Raghu"),
                new User(3,"Anitha"),
                new User(4,"Swetha"));

        arr.forEach(u-> System.out.println(u.getName()));
    }
}
