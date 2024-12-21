import java.util.Scanner;

//Faça um programa que leia 2 números inteiros e imprima na tela (um oi) se os 2
//são maiores que 10 ou se pelo menos um não é maior que 10
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        if((a > 10 && b > 10) || (a < 10 || b < 10)){
            System.out.println("oi");
        }
    }
}