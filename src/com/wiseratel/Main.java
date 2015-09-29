package com.wiseratel;

@FunctionalInterface
interface Greeting {

    void sayHello(String name);

}

public class Main {

    public static void main(String[] args) {

        String tituloNobiliario = " Marqués de España!";

        Greeting greetingInstance = (name) -> {

            System.out.println("\nHello " + name + tituloNobiliario);

        };

        Messages.greet(greetingInstance, "David");

        Messages.greet((name) -> System.out.println("\nHello " + name), "Hansel");

/*
        Greeting greetingInstance = new Greeting() {
            @Override
            public void sayHello(String name) {

                System.out.println("\nHello " + name);

            }
        };

        Messages.greet(greetingInstance, "David");
*/

    } // main

} // Main
