public class testegetset {
    public static void main(String[] args) {
        conta conta = new conta();
        conta.setnumero(String.valueOf(1337));
        System.out.println(conta.getnumero());

        cliente paulo = new cliente();
        conta.setnumero("paulo silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());


    }
}


