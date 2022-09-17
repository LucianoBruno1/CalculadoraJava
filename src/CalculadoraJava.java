import java.util.Scanner;
public class CalculadoraJava {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


        while(true) {

        System.out.print("\nDigite o primeiro valor: ");
        double valor1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        double valor2 = input.nextInt();

        System.out.println("\n[1] SOMA\n[2] SUBTRAÇÃO\n[3] Multiplicação\n[4] Divisão\n[5] Sair\n");

                System.out.print("Digite a opção desejada: ");
                int opcao = input.nextInt();


                if (opcao == 1) {
                    double soma = valor1 + valor2;
                    System.out.print("\nO valor da soma é: " + soma);


                } else if (opcao == 2) {
                    double subtracao = valor1 - valor2;
                    System.out.println("\nA subtração dos valores é: " + subtracao);


                } else if (opcao == 3) {
                    double multiplicacao = valor1 * valor2;
                    System.out.println("\nA multiplicação dos valores é: " + multiplicacao);


                } else if (opcao == 4) {
                    double divisao = valor1 / valor2;
                    System.out.println("\nA divisão dos valores é: " + divisao);

                } else if (opcao == 5) {
                    System.out.println("Obrigado por utilizar.");
                    break;
                }

            }
    }




}
