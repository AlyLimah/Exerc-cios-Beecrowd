
import java.util.Locale;
import java.util.Scanner;

public class Bc1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        sc.close();

        

        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
        if (A * A == (B * B) + (C * C)){
            System.out.println("TRIANGULO RETANGULO");
        }
        if (A * A > (B * B) + (C * C)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (A * A < (B * B) + (C * C)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && A == C && B == A && B == C && C == A && C == B){
            System.out.println("TRIANGULO EQUILATERO");
        }
         else if (A == B || B == C || A == C){
            System.out.println("TRIANGULO ISOSCELES");
        }
      }
    }
}
