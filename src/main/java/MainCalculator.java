import java.util.Scanner;

public class MainCalculator
{
    static Scanner ler = new Scanner(System.in);
    static Calculator calc = new Calculator();

    public static void main(String[] args)
    {
        int opcao = -1;


        while (opcao != 0)
        {
            menu();
            opcao = ler.nextInt();

            switch (opcao)
            {
                case 1 -> {
                    double x, y;
                    System.out.println("**** Soma de dois números ******");
                    x = populateFirst();
                    y = populateSecond();
                    System.out.println(calc.somar(x, y));
                }

                case 2 -> {
                    double x, y;
                    System.out.println("**** Produto de dois números ******");
                    x = populateFirst();
                    y = populateSecond();
                    System.out.println(calc.produto(x, y));
                }

                case 3 -> {
                    double x, y;
                    System.out.println("**** Subtração de dois números ******");
                    x = populateFirst();
                    y = populateSecond();
                    System.out.println(calc.subtracao(x, y));
                }
                case 4 -> {
                    double x, y;
                    System.out.println("**** Quociente de dois números ******");
                    x = populateFirst();
                    y = populateSecond();
                    System.out.println(calc.quociente(x, y));
                }

                case 7 -> {
                    calc.apagarResultado();
                }

            }
        }
    }

    public static void menu()
    {

        System.out.println("**********************");
        System.out.println("****CALCULADORA*****");
        System.out.println("0 - SAIR");
        System.out.println("1-Soma de dois números");
        System.out.println("2-Produto de dois números");
        System.out.println("3-Subtração de dois números");
        System.out.println("4-Quociente de dois números");
        System.out.println("5-Guardar Resultado em Memória");
        System.out.println("6-Usar valor em Memória para outra operação");
        System.out.println("7-Limpar Memória");

        System.out.println("Escolha a operação");


    }

    public static double populateFirst()
    {
        System.out.println("**** Insira 1º número ou ANS");
        ler.nextLine();
        String x = ler.nextLine();

        double num1;

        if (x.equalsIgnoreCase("ANS"))
        {
            num1 = calc.getLastResultValue();
        } else
        {
            num1 = Double.parseDouble(x);
        }

        return num1;
    }

    private static double populateSecond()
    {
        System.out.println("**** Insira 2º número ou ANS");
        String y = ler.nextLine();

        double num2;

        if (y.equalsIgnoreCase("ANS"))
        {
            num2 = calc.getLastResultValue();
        } else
        {
            num2 = Double.parseDouble(y);
        }

        return num2;
    }

}
