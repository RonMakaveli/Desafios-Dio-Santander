import java.util.Scanner;

class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência (apenas números):");
        int agencia = getNumeroInteiro(scanner);

        System.out.println("Por favor, digite o número da Conta (apenas números):");
        int numero = getNumeroInteiro(scanner);

        System.out.println("Por favor, digite o nome do Cliente (apenas letras):");
        String nomeCliente = getNomeCliente(scanner);

        System.out.println("Por favor, digite o saldo da conta (apenas números):");
        double saldo = getNumeroDecimal(scanner);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }

    private static int getNumeroInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }
    }

    private static double getNumeroDecimal(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }
    }

    private static String getNomeCliente(Scanner scanner) {
        while (true) {
            String nome = scanner.nextLine();
            if (nome.matches("[a-zA-Z\\s]+")) {
                return nome;
            } else {
                System.out.println("Por favor, insira apenas letras.");
            }
        }
    }
}
