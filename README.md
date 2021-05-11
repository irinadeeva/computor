# ComputorV1
*This project is the first in math series*

This project aims to code a simple equation solving program. The program will have to display its solution(s).

## Description

The project is reqiered to write a program that solves a polynomial second or lower degree equation and show at least:

- The equation in its reduced form.
- The degree of the equation.
- It’s solution(s) and the polarity of the discriminant if it makes sens.

The program expects the entry to have the right format, ie. every term respect the
form a * x^p and exponents are organized and present. 

### Basic input
```
	C * X^0 + B * X^1 + A * X^2 = D * X^0 + E * X^1 + F * X^2 / A,B,C,D,E,F ∈ ℝ
```

Yet, the program is able to handle an input in natural form:
 - A single coefficient ("4") is considered to be in factor of X^0.
 - A single X is considered to be of coefficient 1 and power 1.
 - An absent power ("4 * X") is considered to be 1.
 - An absent coefficient ("X^6") is considered to be 1.
 - The powers can be in an arbitrary order, possibly repeated.
 
### Natural input
```
	C + B * X + A * X^2 = D + E * X + F * X^2 / A,B,C,D,E,F ∈ ℝ
```

**Detailed description of the task: [computerV1.en.pdf](https://github.com/irinadeeva/computor/blob/master/docs/en.subject.pdf)**

## Usage
Compile and run the program with the script **[run.sh](https://github.com/irinadeeva/computor/blob/master/src/run.sh)**

For example
```
$ java com.bhugo.computor.Computor "5 * X^0 + 6 * X^1 - 9.3 * X^2 = 1 * X^0 + 2 * X^1" 
Reduced form: 4 + 4 * X - 9.3 * X^2 = 0
Polynomial degree: 2
Discriminant is strictly positive, the two solutions are:
-0.48
0.91

& java com.bhugo.computor.Computor "4 * X^0 = 8 * X^0"
Reduced form: - 4 * X^0 = 0
Polynomial degree: 0
No solution

& java com.bhugo.computor.Computor"8 * X^0 - 6 * X^1 + 0 * X^2  - 5.6 * X^3 = 3 * X^0" 
Reduced form: 5 - 6 * X - 5.6 * X^3 = 0
Polynomial degree: 3
The polynomial degree is strictly greater than 2, I can't solve.
```

