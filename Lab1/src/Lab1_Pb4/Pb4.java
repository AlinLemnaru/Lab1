/*4. Să se determine cmmdc a două numere naturale, a căror valoare maximă este 30. Numerele
vor fi generate aleatoriu cu ajutorul unui obiect de tip Random și metodei nextInt(); */


package Lab1_Pb4;

import java.util.Random;

public class Pb4 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(31), num2 = random.nextInt(31);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        while (num2 != 0){
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }

        System.out.println("CMMDC: " + num1);
    }
}
