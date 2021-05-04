package com.bhugo.computor;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            String equation = String.join(" ", args).replaceAll("\\s","");
            System.out.println(equation);
            for (int i = 0; i < equation.length(); i++) {
                while (Character.isDigit(equation.charAt(i)));
            }

            check(equation);
        } else {
            System.err.println("Please, write a polynomial second or lower degree equation.");
        }
    }

    private static void check(String equation){
        System.out.println(equation);
        if (!equation.contains("="))
            System.err.printf("Wrong equation %s, add \"=\". Exmaple: 5 + 2 * X^2 = 0", equation);
       // if (!equation.)
    }
}
