package org.example;

public class Greeting {
    public String greetings(String name){
        if (name == null){
            return "Hello, my friend";
        } else if (name.equals(name.toUpperCase())) {
            return "HELLO, " + name + "!";
        }

        return "Hello, " + name;
    }
    public String greetings(String[] names){
        if (names == null || names.length == 0){
            return "Hello, my friend";
        }
        if (names.length == 2){
            return "Hello, " + names[0] + " and " + names[1];
        } else if (names.length > 2) {
            StringBuilder greeting = new StringBuilder("Hello, "); //StringBuilder is good when wanting to append multiple strings as it avoids creating new string objects.
            for (int i = 0; i < names.length; i++) {
                if (i == names.length - 1){ //Checking if the current index is the last index in the array. We do this to make sure the last name in the array gets an "and" before it's printed.
                    greeting.append("and ").append(names[i]).append("."); //Appends "and" before the last name in the array is printed out, and appends "." after the last name is printed out.
                }else {
                    greeting.append(names[i]).append(", ");
                }
            }

            return greeting.toString();
        }
        return "Hello, my friend";
    }
}
