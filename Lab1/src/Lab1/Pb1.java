/*1. Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria unui
dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura. Sa se adauge un break
point pe prima linie care citește valoarea unei laturi si din acel punct să se ruleze programul
linie cu linie urmărind valorile variabilelor în memorie.*/

package Lab1;

import java.util.Scanner;

public class Pb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lungime = 0, latime = 0, perimetru = 0, aria = 0;

        System.out.print("lungime = ");
        lungime = scanner.nextInt();

        System.out.print("latime = ");
        latime = scanner.nextInt();

        perimetru = 2 * (lungime + latime);
        aria = lungime * latime;

        System.out.println("\nPERIMETRU: " + perimetru);
        System.out.println("\nARIA: " + aria);
    }
}
