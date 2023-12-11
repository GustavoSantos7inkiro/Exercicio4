import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double c,k,f,re,ra;

        System.out.print("Coloque a temperatura em Celsius: ");
        c = scanner.nextDouble();
              k = c + 273.15;
              re = c * 0.8;
              ra = c * 1.8 + 32 + 459.67;
              f = c + 1.8 + 32;

              System.out.printf("A temperatura em Kelvin (K) é: %.2f %n", k);
              System.out.printf("A temperatura em Réaumur (Re) é: %.3f %n", re);
              System.out.printf("A temperatura em Rankine (Ra) é: %.4f %n", ra);
              System.out.printf("A temperatura em Fahrenheit (F) é: %.5f %n", f);






    }
}