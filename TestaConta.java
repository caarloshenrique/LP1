package excecao;

public class TestaConta {
    public static void main(String[] args) {
        Conta cliente1 = new Conta();
        
        cliente1.deposito(300);
        
        try{
            cliente1.saque(400);
        } catch (SaldoInsuficienteException e){
            //catch para pegar exatamente o erro do saldo
            System.out.println("Exceção por saldo insuficiente: " + e.getSaldoAtual());
        }
        catch (Exception e){
            //catch para pegar qualquer erro decente de exception
            System.out.println("Outro erro!");
        }
        
        System.out.println("Saldo: " + cliente1.getSaldo());
    }
}
