public class Generatore {

    public static void stampaQuadrato(int a) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a; j++) {

                System.out.print('*');

            }

            System.out.print("\n");

        }
    }

    public static void stampaAsterischi(int a) {

        for (int i = 1; i <= a; i++) {

            System.out.print('*');

        }

        System.out.print("\n");

    }

    public static void stampaRettangolo(int a, int b) {

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= b; j++) {

                System.out.print('*');

            }

            System.out.print("\n");

        }
    }

    public static void stampaRombo(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }

            System.out.println();

        }

    }
}
