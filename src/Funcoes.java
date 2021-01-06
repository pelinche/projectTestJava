import java.util.Locale;
import java.util.Scanner;

public class Funcoes {


    public static void trabalhandoComString(){
        String original = "acdef FGHY ABC abc DEFG     ";
        log("Original: -"+original+"-");
        String s01 = original.toLowerCase();
        log("lowecase-"+s01+"-");
        String s02 = original.toUpperCase();
        log("UPPERCASE-"+s02+"-");
        String s03 = original.trim();
        log("Trim:-"+s03+"-");
        String s04 = original.substring(2);
        log("Substring:-"+s04+"-");
        String s05 = original.substring(2,9);
        log("Substring - 2/9:-"+s05+"-");
        String s06 = original.replace("a","x");
        log("replace:-"+s06+"-");
        String s07 = original.replace("abc","xyz");
        log("replace:-"+s07+"-");
        int i = original.indexOf("bc");
        log("Posição:"+i);
        int j = original.lastIndexOf("bc");
        log("Ultima Posição:"+j);

        String[] vect = original.split(" ");
        log("Tamanho do vetor:"+vect.length);
        log("Valor 1 do vetor: "+vect[0]);





    }

    public static void repeticaoDoWhile(){
        Scanner sc = new Scanner(System.in);
        char repetir;
        do{
            log("Informe a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (9 * celsius / 5) + 32;
            log("Temperatura em Fahrenheit: "+fahrenheit);
            log("Repetir (s/n)?");
            repetir = sc.next().charAt(0);
        }while( repetir != 'n');
    }

    public static void repeticaoFor(){
        Scanner sc = new Scanner(System.in);
        log("Informe o número de valores: ");
        int N = sc.nextInt();
        int soma = 0;
        for(int i = 0; i < N;i++){
            log("Informe o valor "+(i+1)+" de " +N);

            soma += sc.nextInt();
        }
        log("Soma: "+soma);

        sc.close();
    }

    public static void repeticaoWhile(){
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        log("Informe o valor: ");
        int x =sc.nextInt();
        while( x != 0){
            soma += x;
            log("Informe o valor: ");
            x = sc.nextInt();
        }

        log("Soma dos valores: "+soma);
        sc.close();


    }



    public static void condicaoTernaria(){
        double preco = 34.5;
        double desconto = (preco<20.0)?preco*0.1:preco*0.05;
        log(preco+" - Desconto: "+desconto);

    }

    public static void diaSemana(){
        Scanner sc = new Scanner(System.in);
        log("Informe o dia da semana:");
        int diaSemana = sc.nextInt();
        String dia;
        switch  (diaSemana){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
        }
        log("Dia da Semana: "+dia);
        sc.close();

    }

    public static void minutosOperadora(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        log("Informe os minutos: ");
        int minutos = sc.nextInt();
        int franquia = 100;
        double valorplano = 50.0;
        double valorporminuto = 2.0;
        if(minutos > franquia){
            valorplano += ((minutos - franquia) * valorporminuto);
        }
        System.out.printf("Valor da fatura: %.2f%n",valorplano);

    }

    public static void estruturaCondicional(){
        Scanner sc = new Scanner(System.in);

        log("Qual o horário?");
        int hora = sc.nextInt();


        if(hora<12){
            log("Bom dia");

        }else if(hora < 18){
            log("Boa tarde!");
            //log("Boa noite");
        }else{
            log("Boa noite");
        }

    }
    public static void log(String msg){
        System.out.println(msg);
    }
    public static void conteudoaula(){
        Scanner sc = new Scanner(System.in);
            /*
        char x;
        x = sc.next().charAt(0);
        log(x+"");

        int y = sc.nextInt();
        log("Você digitou:"+y);
        */

        /*
        //Locale.setDefault(Locale.US);
        log("Hello World");
        int idade = 25;
        double altura = 1.68123121;
        char sexo = 'F';
        System.out.printf("%.2f%n",altura);
        System.out.printf("%.4f%n",altura);

        log(altura+"");

        System.out.printf("Resultado %.2f metros%n",altura);
        String nome = "Luis";
        Double salario = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome, idade, salario);


        log(idade+" " + altura+ " "+sexo);

    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.5;
    double measure = 53.234567;
        Locale.setDefault(Locale.getDefault());
    System.out.printf("Products%n" +
            "%s which price is $ %.2f%n" +
            "%s which price is $ %.2f%n%n" +
            "Record %d years old, code %d and gender: %s %n" +
            "Measure with eight decimal places: %.8f %n" +
            "Rounded (three decimal places): %.3f %n",product1,price1,product2, price2,age,code,gender,measure,measure);
        Locale.setDefault(Locale.US);
    System.out.printf("US Decimal point %.3f",measure);

         */

    }
    public static void ex01(){
        Scanner sc = new Scanner(System.in);


        //sc.close();
        int a = 0;
        int b = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        log("Soma: "+(a+b));

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        double area = sc.nextDouble();
        System.out.printf("Área: %.4f%n",(pi*(area*area )));

    }

    public static void ex03(){
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int diferenca = (a*b - c*d);
        log("Diferença: "+diferenca);
    }


    public static void ex04(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int matricula = sc.nextInt();
        int horastrabalhadas = sc.nextInt();
        double valorporhora = sc.nextDouble();

        log("Number = "+matricula);
        System.out.printf("SALARY = %.2f%n",(double)horastrabalhadas * valorporhora);

    }

    public static void ex05(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1 = sc.nextInt();
        int qtde1 = sc.nextInt();
        double vlr1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int qtde2 = sc.nextInt();
        double vlr2 = sc.nextDouble();

        double total = (qtde1 * vlr1) + (qtde2 * vlr2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);

    }

    public static void ex06(){
        log("Informe 3 valores A, B, C");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;
        System.out.printf("Área do triangulo Base A, Altura C: %.3f%n",a*c/2);
        System.out.printf("Área do Círculo: %.3f%n",(pi*(c*c)));
        System.out.printf("Área do trapézio: %.3f%n",((a+b)*c)/2);
        System.out.printf("QUADRADO: %.3f%n",b*b);
        System.out.printf("RETANGULO: %.3f%n",a*b);


    }

    public static void raizQuadrada(){
        double y = 25.0;
        double x = Math.sqrt(y);
        Funcoes.log(""+x);
    }

    public static void maiorValor(){
        Scanner sc = new Scanner(System.in);
        Funcoes.log("Informe 3 valores");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Funcoes.log("Maior Valor: "+max(a,b,c)+"");

        sc.close();

    }

    public static int max(int x,int y, int z){
        int aux = 0;
        if(x > y & x > z){
            aux = x;
        }else if(y>z){
            aux = y;
        }else{
            aux = z;
        }


        return aux;
    }

}
