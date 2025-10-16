import java.util.*;

public class Main {
    public static void main(String[] args) {
        String nome = "Herben Oliveira";
        String tipoDeConta = "Corrente";
        double saldo = 5000;
        Scanner scanner = new Scanner(System.in);

        String textoInicial = """
                *****************************
                
                Dados do cliente
                
                Nome: %s
                Tipo de conta: %s
                Saldo Inicial: %.2f
                
                ******************************
                """.formatted(nome, tipoDeConta, saldo);

        System.out.println(textoInicial);

        String menu = """
                Operações
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        int operacao = 0;
        while (operacao != 4) {

            System.out.println(menu);
            System.out.println("Digite a opção desejada:");
            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Você selecionou a opção consulta de saldo");
                    System.out.println("Seu saldo é: " + saldo);

                    break;

                case 2:
                    System.out.println("Você selecionou a opção receber valor");
                    System.out.println("Quanto você deseja receber?");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito realizado! Seu novo saldo é R$" + saldo);
                    break;

                case 3:
                    System.out.println("Você selecionou a opção transferir valor");
                    System.out.println("Quanto você deseja transferir?");
                    double transferencia = scanner.nextDouble();
                    saldo -= transferencia;
                    System.out.println("Você Retirou R$" + transferencia);
                    System.out.println("Seu novo saldo é R$" + saldo);
                    break;

                case 4:
                    System.out.println("Você selecionou a opção sair");
                    System.out.println("Saindo da operação bancária");
                    break;

                default:
                    System.out.println("Opção Inválida.");

                    break;
            }
            System.out.println();
        }
        System.out.println("Finalizando operações bancárias.");
        scanner.close();
    }
}