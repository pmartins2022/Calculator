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

                case 5 -> {
                    calc.apagarResultado();
                }

                case 6 -> {
                    double x,y ;
                    System.out.println("**** Potência de 1º número elevado ao 2ª número ******");
                    x = populateFirst();
                    y = populateSecond();
                    System.out.println(calc.potencia(x, (int) y));
                }

                case 7 -> {
                    double x ;
                    System.out.println("**** Fatorial número Inteiro ******");
                    x = populateFirst();
                    System.out.println(calc.fatorial(x));
                }

                case 8 -> {
                    double x ;
                    System.out.println("**** Verificar se número Inteiro é primo ******");
                    x = populateFirst();
                    System.out.println(calc.isPrime((int) x));
                }

                case 9 -> {
                    double x ;
                    System.out.println("**** Verificar se o numero é a soma dos cubos dos digitos que o compõem ******");
                    x = populateFirst();
                    System.out.println(calc.cubosAlgarismos((int)x));
                }

                case 10 -> {
                    double x ;
                    System.out.println("**** Converter número decimal para binário ******");
                    x = populateFirst();
                    System.out.println(calc.convertToBinary((int) x));
                }

                case 11 -> {
                    double x ;
                    System.out.println("**** Converter número binário para decimal ******");
                    x = populateFirst();
                    System.out.println (calc.binaryToDecimal ((int) x));
                }
                case 12 -> {
                    double x ;
                    System.out.println("**** Converter número decimal para hexadecimal ******");
                    x = populateFirst();
                    System.out.println(calc.converteDecimalParaHexa ((int) x));
                }
                case 19 -> {
                    System.out.println("**** Soma de dois números hexadecimais ******");
                    Hexadecimal x = new Hexadecimal(populateFirstStr());
                    Hexadecimal y = new Hexadecimal(populateSecondStr());
                    Hexadecimal soma = x.somaHexadecimal(y);
                    System.out.println(soma);
                }
                case 20 -> {
                    System.out.println("**** Produto de dois números hexadecimais ******");
                    Hexadecimal x = new Hexadecimal(populateFirstStr());
                    Hexadecimal y = new Hexadecimal(populateSecondStr());
                    Hexadecimal produto = x.produtoHexadecimal(y);
                    System.out.println(produto);
                }
                case 21 -> {
                    System.out.println("**** Subtração de dois números hexadecimais ******");
                    Hexadecimal x = new Hexadecimal(populateFirstStr());
                    Hexadecimal y = new Hexadecimal(populateSecondStr());
                    Hexadecimal sub = x.subtracaoHexadecimal(y);
                    System.out.println(sub);
                }
                case 23 -> {
                    System.out.println("**** Soma números complexos ******");
                    double x = populateFirst();
                    double y = populateSecond();
                    NumeroComplexo nc1 = new NumeroComplexo(x,y);
                    double x2 = populateFirst();
                    double y2 = populateSecond();
                    NumeroComplexo nc2 = new NumeroComplexo(x2,y2);
                    System.out.println(nc1.somar(nc2));
                }
                case 24 -> {
                    System.out.println("**** Produto de números complexos ******");
                    double x = populateFirst();
                    double y = populateSecond();
                    NumeroComplexo nc1 = new NumeroComplexo(x,y);
                    double x2 = populateFirst();
                    double y2 = populateSecond();
                    NumeroComplexo nc2 = new NumeroComplexo(x2,y2);
                    System.out.println(nc1.produto(nc2));
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
        System.out.println("5-Limpar Memória");
        System.out.println("6-Calcular o valor de x na potência de y");
        System.out.println("7-Calcular fatorial de um numero inteiro");
        System.out.println("8-Verificar se um numero é primo");
        System.out.println("9-Verificar se o numero é a soma dos cubos dos digitos que o compõem");
        System.out.println("10-Converter numero decimal para binário");
        System.out.println("11-Converter número binário para decimal");
        System.out.println("12-Converter número decimal para hexadecimal");
        System.out.println("15-Soma de dois binários");
        System.out.println("16-Produto de dois binários");
        System.out.println("17-Subtração de dois binários");
        System.out.println("19-Soma de dois números hexadecimais");
        System.out.println("20-Produto de dois números hexadecimais");
        System.out.println("21-Subtração de dois números hexadecimais");
        System.out.println("23-Soma de dois números complexos");
        System.out.println("24-Produto de dois números complexos");
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

    public static String populateFirstStr()
    {
        System.out.println("**** Insira 1º número");
        ler.nextLine();
        String x = ler.nextLine();
        return x;
    }

    public static String populateSecondStr()
    {
        System.out.println("**** Insira 2º número");

        String x = ler.nextLine();
        return x;
    }
}
