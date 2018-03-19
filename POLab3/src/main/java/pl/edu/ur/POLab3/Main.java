/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Asia
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4

         //ZAD 1.4

        /*
        int a = -45;
        int b = 3;

        System.out.println(a + " << "+ b + " = " + (a << b)); // -45 * 2^3 = -45 * 8 = -360
        System.out.println(a + " >> "+ b + " = " + (a >> b)); // -45 / 2^3 = -45 / 8 = -6   <- dzielenie bez reszty
        System.out.println(a + " >>> "+ b + " = " + (a >>> b)); // W tym przypadku jest to ( a >> b) + (2 << ~s) <- gdzie ~ oznacza bitowe uzupełnienie do 1
        */


        // ZAD 1.7

        // ! - NOT
        /*
        boolean a = true;
        boolean b = false;

        System.out.println("!(a && b) = " + !(a && b));
        */

        //XOR - ^ < - logiczne
        /*
        boolean[] all = { false, true };
        System.out.println("Tablica prawdy dla bramki XOR");
        for (boolean a : all) {
            for (boolean b: all) {
                boolean c = a ^ b;
                System.out.println(a + "\t^\t" + b + "\t=\t" + c);
            }
        }
        */

        // XOR - ^ <- bitowo
        /*
        int a = 60;	// 60 = 0011 1100
        int b = 13;	// 13 = 0000 1101
        int c = 0;
        c = a ^ b;        // 49 = 0011 0001
        System.out.println("Bitowe XOR");
        System.out.println(a+" ^ "+b+" = " + c );
        */


        // ZAD 2.2
        /*
        System.out.println("Metoda toCharArray zmienia typ danych ze String na lancuch Char: \n");
        String wyraz = "kondominium rosyjsko-niemieckie pod żydowskim zarządem powierniczym";
        char[] lancuch = new char[wyraz.length()];
        lancuch = wyraz.toCharArray();
        System.out.println(lancuch);

        // Metoda getBytes zwraca wartosc bitowa Stringa
        System.out.println(wyraz.getBytes());
        // Metoda equals porownuje ze soba dwa Stringi. W tym przypadku sa rozne
        if (wyraz.equals("zadlab3-PO")) {
            System.out.println("Wyrazy sa takie same");
        } else {
            System.out.println("Wyrazy nie sa takie same");
        }
        // Metoda equalsIgnoreCase porownuje ze soba dwa Stringi i nie zwraca uwagi na wielkoscliter. W tym przypadku zwraca wartosc false
        if (wyraz.equalsIgnoreCase("zAdLaB3-pO")) {
            System.out.println("Wyrazy sa takie same");
        } else {
            System.out.println("Wyrazy nie sa takie same");
        }
        // Metoda compareTo porownuje dwa Stringi leksykograficznie
        System.out.println(wyraz.compareTo("zadlab3-PO"));
        // Metoda compareToIgnoreCase porownuje dwa Stringi leksykograficznie i ignoruje wielkość liter
        System.out.println(wyraz.compareToIgnoreCase("zadlab3-PO"));
        // Metoda indexOf zwraca index pierwszego wystepującego podanego znaku w Stringu. W tym przypadku zwraca index pierwszego w
        System.out.println(wyraz.indexOf("w"));
        // Metoda lastIndexOf zwraca index ostatniego wystepującego podanego znaku w Stringu. W tym przypadku zwraca index ostatniego w
        System.out.println(wyraz.lastIndexOf("w"));
        // Metoda substring zwraca podaną przez nas część Stringa. W tym przypadku znaki o indeksie od 0 do 2
        System.out.println(wyraz.substring(0, 2));
        // Metoda replace zastepuje określone przez nas znaki podanymi przez nas znakami. W tym przypadku zamienia każde k na l
        System.out.println(wyraz.replace('k', 'l'));
        // Metoda trim usuwa puste indexy na początku oraz końcu Stringa
        System.out.println(wyraz.trim());
        // Metoda toLowerCase zamienia wszystkie litery na male litery
        System.out.println(wyraz.toLowerCase());
        // Metoda toUpperCase zamienia wszystkie litery na wielkie litery
        System.out.println(wyraz.toUpperCase());
        // Metoda split rozdziela Stringa na mniejsze od podanego przez nas znaku. W tym przypadku jest to znak d
        for (String output : wyraz.split("d")) {
            System.out.println(output);
        }
        */

        // ZAD 3.3
        /*
        int a,b;
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        a = wejscie.nextInt();
        System.out.println("Podaj wykladnik: ");
        b = wejscie.nextInt();
        
        Potega potega = new Potega();
        potega.x = a;
        potega.n = b;
        
        int w1 = Potega.potega_r(a,b);
        int w2 = Potega.potega_i(a, b);
        System.out.println("Rekurencyjnie: "+a+"^"+b+"="+w1);
        System.out.println("Iteracyjnie: "+a+"^"+b+"="+w2);
        */
        
        // ZAD 3.4
        /*
        Fibonacci fib = new Fibonacci();
        int n, wynik  = 0;
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj n: ");
        n = wejscie.nextInt();
        
        wynik = fib.fibonacci(n);
        System.out.println("Wartosc ciagu Fibonacciego dla n = "+n+" wynosi: "+wynik);
        */
    }
    
}
