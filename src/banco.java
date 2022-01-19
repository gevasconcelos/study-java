import java.util.Scanner;

class abrirConta{
    public static float abrindoConta(float saldo){
        return saldo = 1;
    }
}

class fazerDeposito{
    public static float depositando(float saldo, float valorDepositado){
        saldo = saldo+valorDepositado;
        return saldo;
    }
}

public class banco {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        float saldo;
        float valorDepositado;
        int opcao,contaExistente;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("\nOlá " +nome + " por favor escolha uma opção:");
        System.out.println("Já tem uma conta no nosso banco?"+ "\n1 - Sim" + "\n2 - Não");
        contaExistente = ler.nextInt();

        if(contaExistente == 2){

        }else{
            do{
                System.out.println("1 - Abrir conta" +
                        "\n2 - Saldo"+
                        "\n3 - Depositar"+
                        "\n4 - Saque"+
                        "\n5 - Encerrar conta"+
                        "\n0 - Terminar operação");
                System.out.println("\n");
                opcao = ler.nextInt();

                if (opcao == 1) {
                    System.out.println("\n"+nome+ " Sua conta foi aberta e acrescentamos o valor de: "+abrirConta.abrindoConta(saldo));
                }
                if (opcao == 2) {
                    System.out.println("Seu saldo é: " +saldo);
                }
                if(opcao == 3){
                    System.out.println("\nDigite o valor para depositar: ");
                    valorDepositado = ler.nextFloat();
                    System.out.println("\n"+nome+ " Sua conta foi aberta e acrescentamos o valor de: "+fazerDeposito.depositando(saldo));
                }
            }while (opcao != 0);
        }





    }
}
