package com.bhugo.computor;

import java.util.Arrays;

public class Computor {
    static double[] coefficient;
    double root1, root2;
    double determinant;

    public static void main(String[] args) {
        if (args.length > 0) {
            String equation = String.join(" ", args);
            check(equation);
            int t;
            String s = equation;
            int maxDegree = 0;
            while (!s.isEmpty() && s.length() > 2) {
                t = s.indexOf("^");
                s = s.substring(t + 1);
                t = s.indexOf(" ");
                int i;
                if (t == -1) {
                    i = Integer.parseInt(s);
                } else {
                    i = Integer.parseInt(s.substring(0, t));
                }
                if (i > maxDegree) {
                    maxDegree = i;
                }
                s = s.substring(t + 1);
            }
            coefficient = new double[maxDegree + 1];
            equation = equation.replaceAll("\\s","");
            while (!equation.isEmpty()) {
                t = equation.indexOf("*");
                double coef;
                if (equation.indexOf("=") != 0) {
                    coef = Double.parseDouble(equation.substring(0, t));
                } else {
                    coef = -(Double.parseDouble(equation.substring(1, t)));
                }
                equation = equation.substring(t + 3);
                int degree = Integer.parseInt(equation.substring(0, 1));
                equation = equation.substring(1);
                coefficient[degree] += coef;
            }
            int i = 0;
            System.out.print("Reduced form: ");
            while (maxDegree >= i) {
                System.out.printf("%.0f * X^%d ", coefficient[i], i);
                i++;
            }
            System.out.println("= 0");
            System.out.println("Polynomial degree: " + maxDegree);
        } else {
            System.err.println("Please, write a polynomial second or lower degree equation.");
        }
    }

    private static void check(String equation){
        if (!equation.contains("="))
            System.err.printf("Wrong equation %s, add \"=\". Exmaple: 5 + 2 * X^2 = 0", equation);
       // if (!equation.)
    }
}
