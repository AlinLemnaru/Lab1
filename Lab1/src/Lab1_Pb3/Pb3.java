/*3. Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător.*/

package Lab1_Pb3;

import java.util.Scanner;

public class Pb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0, divCnt = 1;

        System.out.print("\nn = ");
        n = scanner.nextInt();

        System.out.println("\nDIVIZORII LUI " + n + ":");
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) {
                System.out.print(i + " ");
                divCnt++;
            }
        System.out.print(n);

        if(n <= 1 || divCnt > 2)
            System.out.println("\n\nNU E PRIM");
        else
            System.out.println("\n\nPRIM");
    }
}
