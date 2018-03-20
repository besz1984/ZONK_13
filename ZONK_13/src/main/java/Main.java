import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Co 13. wyraz ze wskazanej iteracji oznaczony jako ZONK!!!");

//      ZAKRES WPISYWANY ZE SCANNER:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj pierwszą z dwóch liczb:");
//        int x = scanner.nextInt();
//        System.out.println("Podaj drugą liczbę:");
//        int y = scanner.nextInt();

//      ZAKRES WPISANY W "Edit Configurations"
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.println("Wynik zadania:");

        printElements(x, y);
    }

    public static void printElements(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 13 == 0) {
                System.out.println("ZONK!!!");
            } else {
                System.out.println(i);
            }
        }
    }
}

