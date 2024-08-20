public class ContaCorrente {
    private float limite, saldo, valorLimite;

    public void sacar(float valor){
        if (valor < 0){
            throw new IllegalArgumentException("Valor inválido! O valor não pode ser negativo.");
        } else if (valor > saldo + limite){
            throw new IllegalArgumentException("Saque inválido! O valor é maior do que é permitido.");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(float valor){
        if (valor < 0){
            throw new IllegalArgumentException("Depósito inválido! O valor depositado não pode ser negativo.");
        } else {
            saldo+=valor;
        }
    }

    public void setValorLimite(float valor){
        if (valor < 0){
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
    }
}
