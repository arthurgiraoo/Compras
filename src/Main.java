
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito nubank = new CartaoDeCredito(limite);
        int sair = 1;

        while (sair == 1){
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();
            System.out.println("Digite o valor: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(valor, descricao);
            boolean compraRealizada = nubank.lancaCompras(compra);
            if (compraRealizada){
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar comprando; ");
                sair = leitura.nextInt();

            } else {
                System.out.println("saldo insuficiente!");
                 break;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        for (Compra c : nubank.getCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " + nubank.getSaldo());
    }

}