package application;

import entities.*;
import entities.CurrencyConverter;
import entities.Product;
import entities.Triangle;
import util.Calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Program {


    public static void main(String[] args) throws ParseException {
        //movimentaItem();
        //compraDolar();
        //abreConta();

        //vetorParte1();
        //vetorParte2();
        //exercicioVetor();
        //lacoForEach();
        //listasParte();
        //exercicioFuncionarios();
        //matriz();
        //matriz2();

        //dataJava1();
        dataJava2();



    }

    public static void dataJava2(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY,4 );
        d = cal.getTime();
        System.out.println(sdf.format(d));
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("Minutes: "+minutes);
        int month = 1+cal.get(Calendar.MONTH);
        System.out.println("Month: "+month);

    }


    public static void dataJava1() throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000 * 60 * 60 * 5);

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        //System.out.println(y1 + " - "+y2);

        System.out.println("x1: "+(x1));
        System.out.println("x2: "+(x2));
        System.out.println("x3: "+(x3));
        System.out.println("x4: "+(x4));
        System.out.println("y1: "+(y1));
        System.out.println("y2: "+(y2));
        System.out.println("y3: "+(y3));
        System.out.println("---------------------------------------");
        System.out.println("x1: "+sdf2.format(x1));
        System.out.println("x2: "+sdf2.format(x2));
        System.out.println("x3: "+sdf2.format(x3));
        System.out.println("x4: "+sdf2.format(x4));
        System.out.println("y1: "+sdf2.format(y1));
        System.out.println("y2: "+sdf2.format(y2));
        System.out.println("y3: "+sdf2.format(y3));
        System.out.println("---------------------------------------");
        System.out.println("x1: "+sdf3.format(x1));
        System.out.println("x2: "+sdf3.format(x2));
        System.out.println("x3: "+sdf3.format(x3));
        System.out.println("x4: "+sdf3.format(x4));
        System.out.println("y1: "+sdf3.format(y1));
        System.out.println("y2: "+sdf3.format(y2));
        System.out.println("y3: "+sdf3.format(y3));


    }


// 3 4 10 8 15 12 21 11 23 8 14 5 13 19 8
    public static void matriz2(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int M, N;

        System.out.print("Linhas: ");
        M = sc.nextInt();
        System.out.print("Colunas: ");
        N = sc.nextInt();

        System.out.println("Linhas: "+M+" - Colunas: "+N);
        int [][] mat = new int[M][N];
        for (int i = 0; i< mat.length ;i++){
            for(int j = 0; j < mat[i].length ;j++){
                System.out.print("Posição "+i+"-"+j+": ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Insert the value to find position:");
        System.out.println("");
        int valor = sc.nextInt();
        for (int i = 0; i< mat.length ;i++){
            for(int j = 0; j < mat[i].length ;j++){
                if(valor == mat[i][j]){
                    System.out.println("--------------------");
                    System.out.println("Position "+i+","+j);
                    //mostrar os outros valores...

                    if(j>0){
                        System.out.print("Value LEFT: ");
                        System.out.println(mat[i][j-1]);
                    }
                    if(j < mat[i].length-1){
                        System.out.print("Value RIGHT: ");
                        System.out.println(mat[i][j+1]);
                    }
                    if(i>0){
                        System.out.print("Value UP: ");
                        System.out.println(mat[i-1][j]);
                    }
                    if(i < mat.length -1){
                        System.out.print("Value DOWN: ");
                        System.out.println(mat[i+1][j]);
                    }


                }
            }
        }

// 3 4 10 8 15 12 21 11 23 8 14 5 13 19 8


        sc.close();
    }


    public static void matriz(){
        //vetor: 5 -3 10 15 8 2 7 9 -4
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Matriz bidimensional de tamanho: ");
        int n = sc.nextInt();
        int [][] mat = new int[n][n];

        for (int i = 0; i< mat.length ;i++){
            for(int j = 0; j < mat[i].length ;j++){
                System.out.print("Posição "+i+"-"+j+": ");
                mat[i][j] = sc.nextInt();
            }
        }


        System.out.println("");
        System.out.println("Diagonal Principal");
        for (int i = 0; i<mat.length;i++){
            System.out.print(mat[i][i]+ "  ");
        }
        System.out.println("");
        System.out.println("---------------------------");
        int negativenumbers = 0;
        for (int i = 0; i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j]<0){
                    negativenumbers ++;
                }
            }
        }

        System.out.println("Negative Values = "+negativenumbers);






        sc.close();
    }

    public static void exercicioFuncionarios(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();
        for (int i = 0;i < n;i++){

            System.out.println("Employe #"+(i+1)+": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            //validate if id is in use....
            while (hasId(list, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id,name,salary));

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        while (!hasId(list, idsalary)) {
            System.out.print("ID don't located. Try Again");
            idsalary = sc.nextInt();
        }
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        int finalIdsalary = idsalary;
        Employee emp = list.stream().filter(x -> x.getId() == finalIdsalary).findFirst().orElse(null);
        emp.increaseSalary(percentage);
        System.out.println(emp.getName()+" - New Salary: "+emp.getSalary());


        System.out.println("List of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }

    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    public static void listasParte(){
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("John");
        list.add("Bob");
        list.add("Alex");
        list.add(2,"Luis");

        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("---------------");
        //list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("---------------");
        System.out.println("Index of Bob: "+ list.indexOf("Bob"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("---------------");
        String name = list.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);
        System.out.println(name );




    }

    public static void lacoForEach(){
        String[] vect = new String[]{"Maria","Bob","Alex"};
        for (int i = 0;i<vect.length;i++){
            System.out.println(vect[i]);
        }
        System.out.println("------------------------");
        for (String obj:vect) {
            System.out.println(obj);
            
        }

    }

    public static void exercicioVetor(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de quartos ocupados: ");
        int n = sc.nextInt();
        Room[] rooms = new Room[10];

        for(int i = 0;i < n;i++){
            System.out.print("-> Número do Quarto:");
            int nroquarto = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Email:");
            String email = sc.next();
            rooms[nroquarto] = new Room(name, email);

        }

        System.out.println("Busy Rooms:");
        for(int i = 0;i < 10;i++){

            if( rooms[i] != null){

                System.out.println(i+": "+rooms[i].getName()+", "+rooms[i].getEmail());
            }

        }


    }

    public static void vetorParte2(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de registros: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];
        for (int i = 0;i < products.length; i++){
            System.out.print("-> Informe a descrição para o produto "+(i+1)+": ");
            String name = sc.next();
            System.out.print("-> Informe o Preço para o produto "+name+": ");
            double price = sc.nextDouble();


            Product product = new Product(name, price);
            products[i] = product;

        }

        double sum = 0.0;
        for (int i = 0;i < products.length; i++){
            sum +=  products[i].getPrice();


        }
        double media = sum / products.length;
        System.out.println("Média dos valores: "+String.format("%.2f",media));



        sc.close();
    }


    public static void vetorParte1(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de registros: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0 ;i < n;i++){
            System.out.print("-> Informe a altura da "+(i+1)+ " pessoa: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0;i<n;i++){
            sum += vect[i];
        }
        Double media = sum / n;
        System.out.println("Média "+String.format("%.2f",media));






        sc.close();
    }

    public static void abreConta(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.next();
        Account account = new Account(number,holder);
        System.out.print("Is there an initial deposit(y/n): ");
        if(sc.next().charAt(0) == 'y'){
            System.out.print("Enter initial deposit value: ");
            account.deposit(sc.nextDouble());
        }
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println(account);




    }

    public static void compraDolar(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();
        System.out.print("Valor do Dolar: ");
        cc.dollarPrice = sc.nextDouble();
        System.out.println(cc.dollarPrice);
        System.out.print("Quantidade: ");
        cc.ammount = sc.nextDouble();

        System.out.println("Valor em Reais: "+cc.valueInReals());




    }

    public static void circunferencia(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI: %.2f",Calculator.PI);



        sc.close();
    }


    public static void movimentaItem(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter product data: ");


        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Price: ");
        double price = sc.nextDouble();

//        System.out.print("Quantity in stock: ");
//        int quantitity = sc.nextInt();
        Product product = new Product(name, price);

        //product.toString();
        System.out.println(product);
        System.out.print("Enter the number of product to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println(product);

        System.out.print("Enter the number of product to be removed in stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println(product);

        sc.close();



    }

    public static void trianguloOO(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x  = new Triangle();
        y  = new Triangle();

        System.out.println("Enter the measure of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area = %.4f%n",areaX);
        System.out.printf("Triangle Y area = %.4f%n",areaY);

        if(areaX > areaY){
            System.out.println("Maior área é de X");
        }else{
            System.out.println("Maior área é de Y");
        }

        sc.close();


    }


    public static void triangulo(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        System.out.println("Enter the measure of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC ));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC ));

        System.out.printf("Triangle X area = %.4f%n",areaX);
        System.out.printf("Triangle Y area = %.4f%n",areaY);

        if(areaX > areaY){
            System.out.println("Maior área é de X");
        }else{
            System.out.println("Maior área é de Y");
        }

        sc.close();
    }

}
