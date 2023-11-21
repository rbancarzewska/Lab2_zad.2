import java.util.Scanner; // importuje scanner
78
public class KonwersjaTypowDanych {
    public static void main(String[] args) {
        // Deklaracja zmiennych
        int wartoscInt;
        double wartoscDouble;
        char wartoscChar;
        boolean wartoscBoolean;

        // Stwarzam przy pomocy  Scannera obiekt do wprowadzenia danych
        Scanner scanner = new Scanner(System.in);

        // Wartosci wprowadzane dla poszczegolnych typow zmiennych
        System.out.print("Wprowadz wartosc typu int: ");
        wartoscInt = scanner.nextInt();

        System.out.print("Wprowadz wartosc typu double: ");
        wartoscDouble = scanner.nextDouble();

        System.out.print("Wprowadz wartosc typu char: ");
        wartoscChar = scanner.next().charAt(0);

        System.out.print("Wprowadz wartosc typu boolean (true/false): ");
        wartoscBoolean = scanner.nextBoolean();

        // Konwertowanie i wypisywanie wynikow konwersji
        System.out.println("\nWyniki konwersji:");
        System.out.println("1. Double na int: " + (int) wartoscDouble);

        System.out.println("2. Int na double: " + (double) wartoscInt);

        System.out.println("3. Char na int: " + (int) wartoscChar);

        System.out.println("4. Boolean na string: " + String.valueOf(wartoscBoolean));

        // Zamykanie scannera, aby zabezpieczyc wyciek danych
        scanner.close();
    }
}