/**
 * Created by Bruno on 08/05/2016.
 */
public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float _valorLimite){
        this.limite = _valorLimite;
        this.valorLimite = _valorLimite;
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void sacar(float valor){
        if(valor < 0)
            throw new IllegalArgumentException("Valor passado precisa ser maior que 0");

        if(valor > limite)
            throw new IllegalArgumentException("Tentativa de saque inválida. O valor ultrapassa o limite atual da conta");

        this.saldo -= valor;
        this.limite -= valor;
    }

    public void depositar(float valor){
        if(valor < 0)
            throw new IllegalArgumentException("Valor passado precisa ser maior que 0");

        this.saldo += valor;
        this.limite += valor;
    }

    public void setValorLimite(float valor){
        if(valor < 0)
            throw new IllegalArgumentException("Valor passado precisa ser maior que 0");

        this.valorLimite = valor;
    }
}
