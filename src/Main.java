import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcolaPotenza(2, ));

    }
    public static void pariDispari(int a) {
        if (a % 2 == 0) {
            System.out.println("Numero pari");
        } else {
            System.out.println("Numero dispari");
        }
    }

    public static int addizione(int a, int b) {
        return a + b;
    }

    public static int sottrazione(int a, int b) {
        return a - b;
    }

    public static int moltiplicazione(int a, int b) {
        return a * b;
    }

    public static int divisione(int a, int b) {
        return a / b;
    }

    public static int calcolaPotenza(int base, int exp) {
        int result = 1;
        if(base > 0 && exp == 0) {
            return result;
        } else if (base == 0 && exp >= 1) {
            return 0;
        } else {
            for(int i = 1; i <= exp; i++) {
                result = result * base;
            }
            return result;
        }
    }
}
