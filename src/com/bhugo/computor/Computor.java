package com.bhugo.computor;

public class Computor {
    static double[] coefficient;
    static double determinant;
    static int maxDegree;

    public static void main(String[] args) {
        if (args.length > 0) {
            String equation = String.join(" ", args);
            equation = manageFreeFormEntrie(equation);
            defineDegree(equation);
            coefficient = new double[maxDegree + 1];
            equation = equation.replaceAll("\\s","");
            defineCoefficients(equation);
            correctDegree();
            printReducedFormAndDegree();
            calculateRoots();
        } else {
            System.err.println("Please, write a polynomial second or lower degree equation.");
        }
    }

    private static String manageFreeFormEntrie(String equation){
        if (equation.startsWith("X"))
            equation = "1 * " + equation;
        if (equation.endsWith("X"))
            equation += "^1";
        equation = equation.replaceAll("= X", "= 1 * X");
        equation = equation.replaceAll("\\+ X", "+ 1 * X");
        equation = equation.replaceAll("- X", "- 1 * X");
        equation = equation.replaceAll("-X", "- 1 * X");
        equation = equation.replaceAll("X \\+", "X^1 +");
        equation = equation.replaceAll("X -", "X^1 -");
        equation = equation.replaceAll("X-", "X^1 -");
        equation = equation.replaceAll("X =", "X^1 =");
        return checkConstantTerm(equation);
    }

    private static String checkConstantTerm(String equation){
        int i;
        int min;
        String member;
        String rest = "";

        while (!equation.isEmpty()) {
            min = 2147483647;
            i = equation.indexOf('-');
            if (i != -1) {
                min = i;
            }
            i = equation.indexOf('+');
            if (i != -1 && i < min)
                min = i;
            i = equation.indexOf('=');
            if (i != -1 && i < min)
                min = i;
            if (min != 2147483647) {
                member = equation.substring(0, min);
            } else {
                member = equation;
                equation = "";
            }
            if (!member.contains("X") && !member.isEmpty() && !member.equals(" "))
                member += "* X^0 ";
            rest += member;
            if (min != 2147483647) {
                equation = equation.substring(min);
                rest += equation.substring(0, 1);
                equation = equation.substring(1);
            }
        }
        return rest;
    }

    private static void defineDegree(String s){
        int t;

        while (!s.isEmpty()) {
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
            if (t != -1)
                s = s.substring(t + 1);
            else
                break;
        }
    }

    private static void defineCoefficients(String equation){
        int t;
        double coef;
        int degree;
        int sing = 1;

        while (!equation.isEmpty()) {
            t = equation.indexOf("*");
            if (equation.indexOf("=") == 0) {
                sing = -1;
                equation = equation.substring(1);
                t--;
            }
            coef = sing * Double.parseDouble(equation.substring(0, t));
            equation = equation.substring(t + 3);
            t = 0;
            while(t != equation.length() && (equation.charAt(t) != '+') && (equation.charAt(t) != '=') && (equation.charAt(t) != '-')) {
                t++;
            }
            degree = Integer.parseInt(equation.substring(0, t));
            equation = equation.substring(t);
            coefficient[degree] += coef;
        }
    }

    private static void correctDegree() {
        while (maxDegree != 0 && coefficient[maxDegree] == 0) {
                maxDegree--;
        }
    }

    private static void printReducedFormAndDegree(){
        int i = 0;
        System.out.print("Reduced form: ");
        while (maxDegree >= i) {
            if (coefficient[i] < 0)
                System.out.print("- ");
            else if (coefficient[i] > 0 && i > 0 && sum(i))
                System.out.print("+ ");
            if (coefficient[i] < 0 && coefficient[i] != (int) coefficient[i])
                    System.out.print(-coefficient[i] + " ");
            else if ((coefficient[i] > 0 && coefficient[i] != (int) coefficient[i]))
                    System.out.print(coefficient[i] + " ");
            else if ((coefficient[i] < 0 && coefficient[i] == (int) coefficient[i]))
                    System.out.print((int) -coefficient[i] + " ");
            else if ((coefficient[i] > 0 && coefficient[i] == (int) coefficient[i]))
                    System.out.print((int) coefficient[i] + " ");
            if (maxDegree == 0 && coefficient[maxDegree] != 0)
                System.out.print("* X^0 ");
            if (coefficient[i] != 0 && i == 1 )
                System.out.print("* X ");
            if (coefficient[i] != 0 && i > 1)
                System.out.print("* X^" + i + " ");
            i++;
        }
        if (maxDegree == 0 && coefficient[maxDegree] == 0) {
            System.out.print((int)coefficient[maxDegree]  + " * X^" + maxDegree + " ");
        }
        System.out.println("= 0");
        System.out.println("Polynomial degree: " + maxDegree);
    }

    private static boolean sum(int i){
        int k = 0;
        int sum = 0;
        while(k < i){
                sum += coefficient[k];
            k++;
        }
        return sum != 0;
    }

    private static void calculateRoots() {
        switch (maxDegree) {
            case 0:
                if ((coefficient[maxDegree] == 0)) {
                    System.out.println("Each real number is a solution ...");
                } else {
                    System.out.println("No solution");
                }
                break;
            case 1:
                System.out.format("The solution is: %.2f\n", (-coefficient[0]/coefficient[1]));
                break;
            case 2:
                solveEquation();
                break;
            default:
                System.out.println("The polynomial degree is strictly greater than 2, I can't solve.");
        }
    }

    private static void solveEquation(){
        determinant = coefficient[1] * coefficient[1] - 4 * coefficient[2] * coefficient[0];

        if (determinant > 0) {
            System.out.println("Discriminant is strictly positive, the two solutions are:");
            System.out.format("%.2f\n", ((-coefficient[1]) + sqrt(determinant)) / (2 * coefficient[2]));
            System.out.format("%.2f\n", ((-coefficient[1]) - sqrt(determinant)) / (2 * coefficient[2]));
        } else if (determinant == 0) {
            System.out.println("Discriminant is equal to zero, the solution is:");
            System.out.format("%.2f\n", (-coefficient[1]) / (2 * coefficient[2]));
        }
        else {
            System.out.println("Determinant is less than zero, the solution are complex number and distinct:");
            double real = (-coefficient[1])/ (2 * coefficient[2]);
            double imaginary = sqrt(-determinant) / (2 * coefficient[2]);
            System.out.format("%.2f+%.2fi\n", real, imaginary);
            System.out.format("%.2f-%.2fi\n", real, imaginary);
        }
    }

    private static double sqrt(double determinant){
        if (determinant == 1)
            return determinant;

        double i = 0.01, result = 1;
        while (result <= determinant) {
            i += 0.01;
            result = i * i;
        }
        return i;
    }
}
