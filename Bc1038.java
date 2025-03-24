
import java.util.Scanner;

public class Bc1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        float preco = 0.0f;
        float Total;

        switch (i1) {
            case 1:
                preco = 4.00f;
                break;
            case 2:
                preco = 4.50f;
                break;
            case 3:
                preco = 5.00f;
                break;
            case 4:
                preco = 2.00f;
                break;
            case 5:
                preco = 1.50f;
                break;
        }
        
        sc.close();
        Total = preco * i2;

        System.out.printf("Total: R$ %.2f%n", Total);


    }
    
}
