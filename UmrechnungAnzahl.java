import java.util.Scanner;

public class UmrechnungAnzahl {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please add Number" + " " );
        int count = scanner.nextInt();
        int gros = count / 144;
        count = count % 144;
        int schock = count / 60;
        count = count % 60;
        int dutzend = count / 12;
        count = count % 12;
        int stueck = count;
        System.out.printf("%d  Gross   %d  Schock  %d  Dutzend  %d  Stück\n",   gros, schock, dutzend, stueck);
        scanner.close();
    }
}
