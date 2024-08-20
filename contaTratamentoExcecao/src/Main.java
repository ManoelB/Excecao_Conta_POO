public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();

        try{
            c1.setValorLimite(300.0f);
            System.out.println("Limite: R$300,00");

            c1.depositar(700.0f);
            System.out.println("Depósito: R$700,00");

            c1.sacar(400.0f);
            System.out.println("Saque: R$400,00");

            c1.sacar(700.0f);
            System.out.println("Saque: R$700,00");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}