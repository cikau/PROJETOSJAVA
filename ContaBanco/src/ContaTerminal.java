import java.util.Scanner;
public class ContaTerminal {
    /*
    --> variável de texto para guardar o nome do cliente:
    String nome;
    --> variável do tipo Integer para guardar número da agência:
    int agencia;
    --> variável de texto para guardar numero da conta com dígito:
    String numeroConta;
    --> variável do tipo double para guardar o saldo:
    double saldo;
    */

public static void main(String[] args) {
//criando o objeto Scanner:
Scanner scanner = new Scanner(System.in);

    double saldo = 300.65;

    System.out.println("Olá! Boas vindas ao Banco X!");

    System.out.println("Por favor, informe o seu nome completo: ");
    String nome = scanner.next();

    System.out.println("Agora, informe os quatro dígitos da sua agência: ");
    int agencia = scanner.nextInt();

    System.out.println("Estamos terminando... Insira os números da sua conta corrente + dígito identificador: ");
    String numeroConta = scanner.next();

    System.out.println("Olá, " + nome + ", " + "obrigado por criar uma conta em nosso banco!" + "\nSua agência é " + agencia + " e a sua conta é " + numeroConta + "." + "\nSeu saldo no valor de " + saldo + " já está disponível para saque.");

    }

}
