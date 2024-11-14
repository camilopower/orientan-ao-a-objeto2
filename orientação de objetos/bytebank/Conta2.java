public class Conta2 {

    public String setitular;
    public Object setnumero;
    double saldo;

private    String titular;

  private  string cpf;

   private string profissao;


    void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta2 destino) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;

    }

    public double getSaldo() {
        return this.saldo;
    }
}
