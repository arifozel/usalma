import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,k;
        int total = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = inp.nextInt();
        System.out.print("Üssü giriniz: ");
        k = inp.nextInt();

        int i = 1;
        while ( i <= k) {
            total *= n;
            i++;
        }

        System.out.println("Sonuc : " + total);
    }
}