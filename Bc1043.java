
import java.util.Locale;
import java.util.Scanner;

public class Bc1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        double AREA;
        double PERIMETRO;

        sc.close();

        if (A + B > C && A + C > B && B + C > A){
            PERIMETRO = A + B + C;
            System.out.printf("Perimetro = %.1f%n", PERIMETRO); 
        }
        else{
            AREA = (A + B) * C / 2;
            System.out.printf("Area = %.1f%n", AREA);
        }
    }
}
