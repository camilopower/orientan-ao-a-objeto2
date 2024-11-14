public class testametodo {
    public static void main(String[] args) {

        Conta2 contaDopaulo = new Conta2();
        contaDopaulo.saldo = 100;
        contaDopaulo.setitular = "paulo silveira";
        System.out.println(contaDopaulo.setitular);
        contaDopaulo.deposita(50);
        System.out.println(contaDopaulo.getSaldo());
        contaDopaulo.saca(20);
        System.out.println(contaDopaulo.getSaldo());
        System.out.println("conseguiuRetirar");

        Conta2 contaDaMarcela = new Conta2();
        contaDaMarcela.deposita(1000);

        if (contaDaMarcela.transfere(3000, contaDopaulo)) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDopaulo.getSaldo());
    }

}






