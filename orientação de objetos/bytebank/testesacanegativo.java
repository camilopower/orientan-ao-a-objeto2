public class testesacanegativo {
    public static void main(String[] args) {
        Conta2 conta2 = new Conta2();
        conta2.deposita(100);
        System.out.println();conta2.saca(200);


        conta2.saca(101);

        System.out.println(conta2.getSaldo());
    }
}
