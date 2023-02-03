package Metotlar;

import java.util.Scanner;

public class RecursiveUsAlma {
    static int power() {
        int a, b, result = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        a = inp.nextInt();

        System.out.print("Üs değerini giriniz : ");
        b = inp.nextInt();

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç : " + result);
        return power();
    }

    public static void main(String[] args) {
        power();
    }
}
