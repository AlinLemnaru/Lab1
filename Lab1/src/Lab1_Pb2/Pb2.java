/*2. Să se scrie un program care citește un set de numerele din fișierul de intrare in.txt, care
conține câte un număr pe un rând, având valorile din figura 18. Programul va determină suma
lor, media aritmetică, valoarea minimă, valoarea maximă, va afișa aceste valori pe ecran și le
va scrie în fișierul de ieșire out.txt. Media aritmetică va fi afișată ca un număr real. */

package Lab1_Pb2;

import java.util.Scanner;
import java.io.*;


public class Pb2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);

        String nume_fis= "in.txt";

        BufferedReader flux_in;
        PrintStream flux_out = new PrintStream ("out.txt");

        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));

        int x = 0, suma = 0, valMin = Integer.MAX_VALUE, valMax = Integer.MIN_VALUE, k = 1;
        float mediaA = 0.0f;

        String linie = null;
        do {
            linie = flux_in.readLine();

            if (linie == null){
                break;
            }

            System.out.println(linie + "\n");

            x = Integer.parseInt(linie);

            if(x < valMin) {
                valMin = x;
            }
            if(x > valMax) {
                valMax = x;
            }

            suma = suma + x;

            k++;
        } while (true);

        mediaA = (float)suma/k;

        System.out.println("Suma: " + suma);
        flux_out.println(suma);
        System.out.println("Min: " + valMin);
        flux_out.println(valMin);
        System.out.println("Max: " + valMax);
        flux_out.println(valMax);
        System.out.println("Medie: " + mediaA);
        flux_out.println(mediaA);
    }
}