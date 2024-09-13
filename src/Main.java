import Util.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2;
        System.out.println("----------------------");
        System.out.println("1 - somar");
        System.out.println("2 - subtrair");
        System.out.println("3 - dividir");
        System.out.println("4 - multiplicar");
        System.out.println("----------------------");
        System.out.println("Qual opção você deseja utilizar? ");
        int calculo = scan.nextInt();
        while(calculo > 4|| calculo < 1){
            System.out.println("erro!, apenas de 1 a 4");
            calculo = scan.nextInt();
        }
        if(calculo == 1){
            System.out.println("Digite um numero: ");
            n1 = scan.nextDouble();
            System.out.println("Digite um numero: ");
            n2 = scan.nextDouble();
            double soma = Calculadora.somar(n1,n2);
            System.out.println(n1+ " + "+ n2+ " = "+ soma);
        }
        else if(calculo == 2){
            System.out.println("Digite um numero: ");
            n1 = scan.nextDouble();
            System.out.println("Digite um numero: ");
            n2 = scan.nextDouble();
            double subtracao = Calculadora.subtrair(n1,n2);
            System.out.println(n1+" - "+n2+ " = "+ subtracao);
        }
        else if(calculo == 3){
            System.out.println("Digite um numero: ");
            n1 = scan.nextDouble();
            System.out.println("Digite um numero: ");
            n2 = scan.nextDouble();
            if(n2 == 0){
                System.out.println("Nenhum numero pode ser divido por 0");
            }
            double divisao = Calculadora.dividir(n1,n2);
            System.out.println(n1+" / "+n2+ " = "+ divisao);
        }
        else if(calculo == 4){
            System.out.println("Digite um numero: ");
            n1 = scan.nextDouble();
            System.out.println("Digite um numero: ");
            n2 = scan.nextDouble();
            double multiplicacao = Calculadora.multiplicar(n1,n2);
            System.out.println(n1+" * "+n2+" = "+ multiplicacao);
        }
    }

}