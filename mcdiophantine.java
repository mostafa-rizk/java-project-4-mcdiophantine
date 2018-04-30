import java.io.*;
import java.util.*;
public class mcdiophantine {
   public static final String BRIGHT_RED = "\u001b[31;1m";
   public static final String BRIGHT_BLUE = "\u001b[34;1m";
   public static final String BRIGHT_GREEN = "\u001b[32;1m";
   public static final String BRIGHT_YELLOW = "\u001b[33;1m";
   public static final String RESET = "\u001b[0m";
   public static void main(String args[]) {
      int[][] parts = new int[100][3];
      parts[0][0] = 1; parts[0][1] = 0; parts[0][2] = 0;
      parts[1][0] = 0; parts[1][1] = 1; parts[1][2] = 0;
      parts[2][0] = 0; parts[2][1] = 0; parts[2][2] = 1;
      int[] nuggets = new int[100];
      nuggets[0] = 6; nuggets[1] = 9; nuggets[2] = 20;
      int pos1, pos2, quotient, sum, marker = 3, n = 6;
      boolean inList;
      do { //Runs until last array element is != 0
         pos1 = 0;
         pos2 = 1;
         inList = false;
         do { //Runs until nuggets index pos1 is 0 (CHECKING MULTIPLES)
            System.out.println("pos1 is " + pos1 + ", marker is " + marker + ", n is " + n);
            if (n % nuggets[pos1] == 0) { //Checks if number is divisible by a number in array
               quotient = n / nuggets[pos1];
               if (quotient > 1) { //Checks if number is already in list (only applies to 6, 9, and 20)
                  nuggets[marker] = n;
                  parts[marker][0] = parts[pos1][0] * quotient;
                  parts[marker][1] = parts[pos1][1] * quotient;
                  parts[marker][2] = parts[pos1][2] * quotient;
                  System.out.println(BRIGHT_YELLOW + n + BRIGHT_RED + " is a diophantine made up of " +
                  BRIGHT_GREEN + parts[pos1][0] + ", " + parts[pos1][1] + ", " + parts[pos1][2] + RESET);
               }
               else {
                  System.out.println(BRIGHT_YELLOW + n + BRIGHT_RED + " is a diophantine made up of " +
                  BRIGHT_GREEN + parts[pos1][0] + ", " + parts[pos1][1] + ", " + parts[pos1][2] + RESET);
                  marker--;
               }
               inList = true;
               break ;
            }
            pos1++;
         }
         while (nuggets[pos1] != 0);
         pos1 = 0;
         do { // Runs until list is exhausted -> pos1 & pos2 == marker - 1 (CHECKING SUMS)
            if (inList) {
               break ;
            }
            if (pos1 < n) { //Makes sure that number isn't already bigger than leading sum part
               sum = nuggets[pos1] + nuggets[pos2];
               if (sum == n) { //Checks if number matches sum
                  parts[marker][0] = parts[pos1][0] + parts[pos2][0];
                  parts[marker][1] = parts[pos1][1] + parts[pos2][1];
                  parts[marker][2] = parts[pos1][2] + parts[pos2][2];
                  System.out.println(BRIGHT_YELLOW + n + BRIGHT_RED + " is a diophantine made up of " +
                  BRIGHT_GREEN + parts[pos1][0] + ", " + parts[pos1][1] + ", " + parts[pos1][2] + RESET);
                  inList = true;
               }
               pos2++;
               if (pos2 == marker - 1) { //Checks that pos2 is at last number in array
                  if (pos1 != marker - 1) { //Checks that pos1 isn't at last number in array
                     pos1++;
                     pos2 = 0;
                  }
               }
            }
         }
         while (pos2 != marker - 1);
         if (!inList) { //Checks if number is in list
            System.out.println(BRIGHT_YELLOW + n + BRIGHT_BLUE + " is not a diophantine" + RESET);
            n++;
            continue ;
         }
         n++;
         marker++;
         //System.out.println(Arrays.toString(nuggets));
      }
      while (nuggets[nuggets.length - 1] == 0);
      //System.out.println(Arrays.toString(nuggets));
   }
}
