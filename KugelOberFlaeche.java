import java.util.Scanner;

public class KugelOberFlaeche {
    public static void main(String[] args) {
        KugelBerechnen();
    }
    public static void KugelBerechnen() {
        System.out.println( "Please add Radius Number" );
        char exp  = '³';
        Scanner scanner = new Scanner( System.in );
        double radius = scanner.nextDouble();
        double PI = 3.14;
        double Oberflaeche;
        Oberflaeche = PI * radius * radius;
        System.out.println(Oberflaeche + " "   +  "m" + exp);
        scanner.close();
    }
}
