/*5. Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
Programul va determina dacă numărul aparține șirului lui Fobonacci.*/

package Lab1_Pb5;

import java.util.Random;

public class Pb5 {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(21), isFib = 0;

        System.out.println("NR: " + num);

        if (num == 1) {
            isFib = 1;
        } else {
            int t1 = 1, t2 = 1, t3 = 0;

            do {
                t3 = t1 + t2;
                t1 = t2;
                t2 = t3;
                if (num == t3) {
                    isFib = 1;
                    break;
                }
            } while (t3 <= num);
        }

        if (isFib == 1)
            System.out.println("APARTINE sirului lui Fibonacci");
        else
            System.out.println("NU apartine sirului lui Fibonacci");
    }
}
