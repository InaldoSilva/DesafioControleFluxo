import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Contador {
    public static void main(String @NotNull [] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int primeiro = Integer.parseInt(terminal.nextLine());
        System.out.println("Digite o segundo número");
        int segundo = Integer.parseInt(terminal.nextLine());


        try {

            if (primeiro > segundo) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = primeiro; i <= segundo; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        }catch (NumberFormatException e) {
            System.out.println("Os parâmetros devem ser números inteiros válidos");
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

}
