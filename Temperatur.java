import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {
        //Scanner dient zum Einlessen von Keyboard Input
        Scanner scanner = new Scanner(System.in);
        int tempCelsius = scanner.nextInt();
        double tempFahrenheit = 1.8 * tempCelsius + 32;
        System.out.println(tempCelsius+ " Celsius = " + tempFahrenheit + " Fahrenheit ");
        scanner.close();
    }
}
