import java.util.Scanner;
public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma letra ou '0' para sair: ");

            char letra = scanner.next().charAt(0);  // Lê o primeiro caractere da entrada do usuário

            if (letra == '0') {
                break;  // Sai do loop se o user digitar '0'
            }

            if (letra >= 'a' && letra <= 'z') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(letra + " é uma vogal.");  //
                } else {
                    System.out.println(letra + " é uma consoante.");
                }
            } else {
                System.out.println("Letra inválida. insira uma letra minúscula.");
            }
        }

        scanner.close();
    }
}