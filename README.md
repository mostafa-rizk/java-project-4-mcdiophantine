# java-project-4-mcdiophantine

In mathematics, a Diophantine equation (named for Diophantus of Alexandria, a third century Greek mathematician) is a polynomial equation where the variables can only take on integer values. Although you may not realize it, you have seen Diophantine equations before. One of the most famous Diophantine equations is whem n=2:

x^n + y^n = z^n

For n=2, there are infinitely many solutions (values for x, y and z) called the Pythagorean triples, e.g. 32 + 42 = 52. For larger values of n, Fermat’s famous “last theorem” states that there do not exist any positive integer solutions for x, y and z that satisfy this equation. For centuries, mathematicians have studied different Diophantine equations; besides Fermat’s last theorem, some famous ones include Pell’s equation, and the Erdos-Strauss conjecture. For more information on this intriguing branch of mathematics, you may find the [Wikipedia(https://en.wikipedia.org/wiki/Diophantine_equation) article] of interest.

We are not certain that McDonald’s knows about Diophantine equations (actually we doubt that they do), but they use them! McDonald’s sells Chicken McNuggets in packages of 6, 9 or 20 McNuggets. Thus, it is possible, for example, to buy exactly 15 McNuggets (with one package of 6 and a second package of 9), but it is not possible to buy exactly 16 nuggets, since no nonnegative integer combination of 6’s, 9’s and 20’s adds up to 16. To determine if it is possible to buy exactly n McNuggets, one has to solve a Diophantine equation: find non-negative integer values of a, b, and c, such that 6a + 9b + 20c = n.

In this assignment you will develop a program that will list the combinations of 6, 9 and 20 packs of McNuggets you need to buy in order to get each of the exact amounts. Your program should start the listing at the minimum number of McNuggets one can purchase (think carefully about what this number is and what combination of packs one would need to buy). The listing should then continue by incrementing the total McNuggets by one while clearly indicating the required combinations of packs (or, if it is not possible to purchase the amount this should be stated). It is left to your discretion to decide for how long the program should run.

