package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        System.out.println(greeting.greetings("Bob"));

        System.out.println(greeting.greetings((String)null));

        System.out.println(greeting.greetings("JERRY"));

        String[] twoNames = {"Jill","Jane"};
        String[] threeNames = {"Jill","Jane","James"};
        String[] tenNames = {"Jill","Jane","James","Oliver","Kasper","Valdemar","Thomas","Benjamin","Philip","Mikkel"};

        System.out.println(greeting.greetings(twoNames));
        System.out.println(greeting.greetings(threeNames));
        System.out.println(greeting.greetings(tenNames));


        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

    }
}