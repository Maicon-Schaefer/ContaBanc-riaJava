import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioFinalCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "Maicon Schaefer";
        String tipoConta = "Corrente";
        double saldoConta = 2500.00;
        int numeroDigitado = 0;

        DecimalFormat formatador = new DecimalFormat("#,##0.00");

        System.out.println("*****************************************");
        System.out.println("\nNome:             " + nomeCliente);
        System.out.println("Tipo conta:       " + tipoConta);
        System.out.println("Saldo:            R$" + formatador.format(saldoConta));
        System.out.println("\n*****************************************");
        System.out.println("\nOperações");

        while (numeroDigitado != 4){
            System.out.println("\n1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\nDigite a opção desejada:");
            numeroDigitado = scanner.nextInt();

            if(numeroDigitado == 1){
                System.out.println("\nSeu saldo atual é de: R$" + formatador.format(saldoConta));
            } else if (numeroDigitado == 2){
                System.out.println("\nDigite o valor que você irá receber:");
                double valorReceber = scanner.nextDouble();
                saldoConta = (saldoConta + valorReceber);
                System.out.println("\nSeu novo saldo é de: R$" + formatador.format(saldoConta));
            } else if (numeroDigitado == 3){
                System.out.println("\nDigite o valor que você irá transferir:");
                double valorTransferir = scanner.nextDouble();
                if (saldoConta > valorTransferir){
                    saldoConta = (saldoConta - valorTransferir);
                    System.out.println("\nSeu novo saldo é de: R$" + formatador.format(saldoConta));
                } else {
                    System.out.println("\nVocê não tem saldo suficiente para realizar esta transferência!");
                }
            } else if(numeroDigitado > 4) {
                System.out.println("\nA opção digitada é inválida! Tente novamente.");
                System.out.println();
            }
        }
    }
}
