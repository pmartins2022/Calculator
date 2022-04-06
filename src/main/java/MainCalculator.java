import java.util.Scanner;

public class MainCalculator
{

    public static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        menu();

        do

            switch (opcao) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    break;
            }

        while (opcao<0 || opcao >7);



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
