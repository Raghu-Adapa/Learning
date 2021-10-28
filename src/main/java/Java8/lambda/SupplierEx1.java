package Java8.lambda;

import Java8.lambda.model.User;

import java.util.function.Supplier;

public class SupplierEx1 {

    public static void main(String[] args) {

        // Supplier - Ex1
        Supplier<String> supplier = () -> "Hello" ;
        String str = supplier.get();
        System.out.println(str);

        // Supplier - Ex2
        // for one line implementation, return keyword and {} braces are not required
        Supplier<Integer> supplier2 = () -> 100 ;
        int num = supplier2.get();
        System.out.println(num);

        // Supplier - Ex3
        Supplier<User> supplier3 = () -> {
            System.out.println("Returning in Supplier !");
            return new User(1, "Raghu");
        } ;
        User u = supplier3.get();
        System.out.println(u.getName());

    }
}
