
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14,r,alan,cevre;

        Scanner input = new Scanner (System.in);

        System.out.println("Dairenin yari capini giriniz :");
        r = input.nextDouble();


        alan = pi*r*r;
        System.out.println("alan : "+ alan);

        cevre = 2*pi*r;
        System.out.println("cevre: "+ cevre);





    }
}