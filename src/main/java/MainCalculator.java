import java.util.Scanner;

public class MainCalculator
{

    public static void main(String[] args)
    {

        Calculator calc = new Calculator();
        Scanner ler = new Scanner(System.in);
        double res = 0;
        int opcao = 0;
        menu();
        opcao = ler.nextInt();


        do

            switch (opcao) {
                case 1 -> {
                    double x,y;
                    System.out.println("**** Soma de dois números ******");
                    System.out.println("**** Insira 1º número ");
                    x=ler.nextDouble();
                    System.out.println("**** Insira 2º número ");
                    y=ler.nextDouble();
                    res=calc.somar(x,y);
                    }

                case 2 -> {
                    double x,y;
                    System.out.println("**** Produto de dois números ******");
                    System.out.println("**** Insira 1º número ");
                    x=ler.nextDouble();
                    System.out.println("**** Insira 2º número ");
                    y=ler.nextDouble();
                    res=calc.produto(x,y);
                     }

                case 3 -> {
                    double x,y;
                    System.out.println("**** Subtração de dois números ******");
                    System.out.println("**** Insira 1º número ");
                    x=ler.nextDouble();
                    System.out.println("**** Insira 2º número ");
                    y=ler.nextDouble();
                    res=calc.subtracao(x,y);
                }
                case 4 -> {
                    double x,y;
                    System.out.println("**** Quociente de dois números ******");
                    System.out.println("**** Insira 1º número ");
                    x=ler.nextDouble();
                    System.out.println("**** Insira 2º número ");
                    y=ler.nextDouble();
                    res=calc.quociente(x,y);
                }
                case 6 -> {
                    calc.getLastResultValue();
                    break;
                    }

                case 7 -> {
                    calc.apagarResultado();
                    break;
                }

            }

        while (opcao<0 && opcao >7);



    }

    public static void menu(){

        System.out.println("**********************");
        System.out.println("****CALCULADORA*****");
        System.out.println("1-Soma de dois números");
        System.out.println("2-Produto de dois números");
        System.out.println("3-Subtração de dois números");
        System.out.println("4-Quociente de dois números");
        System.out.println("5-Guardar Resultado em Memória");
        System.out.println("6-Usar valor em Memória para outra operação");
        System.out.println("7-Limpar Memória");

        System.out.println("Escolha a operação");


    }


}
