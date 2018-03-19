package pl.edu.ur.POLab3;

public class Potega {
    
    int x;
    int n;
    
    public static int potega_r(int x, int n){
        int a;

         if (n == 0){
             return 1;
         }else{
             return x * potega_r(x, --n);
         }
    }
    
    public static int potega_i(int x, int n){
        int wynik = 1;
        while(n > 0){
            wynik *= x;
            n--;
        }
        return wynik;    
    }
    
}
