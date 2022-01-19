import java.util.Scanner;

class sSalario{
    public static int resultado(int salario){
        return salario+100;
    }
}

public class main {
    public static  void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int salario;

        System.out.println("Digite seu salário: ");
        salario = ler.nextInt();

        System.out.println();

        System.out.println("Novo salário: " +sSalario.resultado(salario));

    }
}
