import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("WORDLE");

        System.out.print("¡Adivina la palabra de 5 letras!");

        String secreta = "manos";


        for (int i = 0; i < 5; i++) {

            String palabra = scanner.next();

            if (palabra.equals(secreta)) {
                System.out.print("¡Eres un genio, has acertado la palabra!");
            } else {
                if (palabra.charAt(0) == secreta.charAt(0)) {
                    System.out.print("\033[42m" + palabra.charAt(0) + "\033[0m");
                } else if (palabra.charAt(0) == secreta.charAt(1) || palabra.charAt(0) == secreta.charAt(2) || palabra.charAt(0) == secreta.charAt(3) || palabra.charAt(0) == secreta.charAt(4)) {
                    System.out.print("\033[43m" + palabra.charAt(0) + "\033[0m");
                } else {
                    System.out.print(palabra.charAt(0));
                }

                if (palabra.charAt(1) == secreta.charAt(1)) {
                    System.out.print("\033[42m" + palabra.charAt(1) + "\033[0m");
                } else if (palabra.charAt(1) == secreta.charAt(0) || palabra.charAt(1) == secreta.charAt(2) || palabra.charAt(1) == secreta.charAt(3) || palabra.charAt(1) == secreta.charAt(4)) {
                    System.out.print("\033[43m" + palabra.charAt(1) + "\033[0m");
                } else {
                    System.out.print(palabra.charAt(1));
                }


                if (palabra.charAt(2) == secreta.charAt(2)) {
                    System.out.print("\033[42m" + palabra.charAt(2) + "\033[0m");
                } else if (palabra.charAt(2) == secreta.charAt(0) || palabra.charAt(2) == secreta.charAt(1) || palabra.charAt(2) == secreta.charAt(3) || palabra.charAt(2) == secreta.charAt(4)) {
                    System.out.print("\033[43m" + palabra.charAt(2) + "\033[0m");
                } else {
                    System.out.print(palabra.charAt(2));
                }

                if (palabra.charAt(3) == secreta.charAt(3)) {
                    System.out.print("\033[42m" + palabra.charAt(3) + "\033[0m");
                } else if (palabra.charAt(3) == secreta.charAt(0) || palabra.charAt(3) == secreta.charAt(1) || palabra.charAt(3) == secreta.charAt(2) || palabra.charAt(3) == secreta.charAt(4)) {
                    System.out.print("\033[43m" + palabra.charAt(3) + "\033[0m");
                } else {
                    System.out.print(palabra.charAt(3));
                }

                if (palabra.charAt(4) == secreta.charAt(4)) {
                    System.out.print("\033[42m" + palabra.charAt(4) + "\033[0m");
                } else if (palabra.charAt(4) == secreta.charAt(0) || palabra.charAt(4) == secreta.charAt(1) || palabra.charAt(4) == secreta.charAt(2) || palabra.charAt(4) == secreta.charAt(3)) {
                    System.out.print("\033[43m" + palabra.charAt(4) + "\033[0m");
                } else {
                    System.out.print(palabra.charAt(4));
                }

                System.out.println();
            }
        }
    }
}