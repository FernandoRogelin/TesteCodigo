import java.util.Scanner;


public class Treinando {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner l = new Scanner(System.in);
        System.out.println("Escreva 3 numeros:");
        num1 = l.nextInt();
        num2 = l.nextInt();
        num3 = l.nextInt();

        if (calculaNota(num1, num2, num3) > 6){
            System.out.println("Aprovado");
        } else if(calculaNota(num1, num2, num3) < 4){
            System.out.println("Reprovado");
        } else if(calculaNota(num1, num2, num3) >=4 && calculaNota(num1, num2, num3) <= 6){
            System.out.println("Fazer a prova de novo");
        }
    }

    public static float calculaNota(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }
}