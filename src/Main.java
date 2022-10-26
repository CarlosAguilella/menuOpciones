import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("palabras"));

        int numero = new Random().nextInt(4750);

        String secreta = "";

        for (int i = 0; i < numero; i++) {
            secreta = scanner.nextLine();
        }

        scanner = new Scanner(System.in);


        System.out.println("WORDLE");

        System.out.println("¡Adivina la palabra de 5 letras!");


        for (int i = 0; i < 10; i++) {

            String palabra = scanner.next();

            if (palabra.equals(secreta)) {
                System.out.print("¡Eres un genio, has acertado la palabra!");
            } else if ((i+1)==5) {
                System.out.println("No has acertado, la palabra era: "+ secreta);
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