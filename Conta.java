package excecao;

public class Conta {
    private double saldo;
    
    public Conta(){}
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void saque(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }else{
            throw new SaldoInsuficienteException(saldo);
        }
    }
    
    public void deposito(double valor){
        this.saldo += valor;
    }
    
    
}
