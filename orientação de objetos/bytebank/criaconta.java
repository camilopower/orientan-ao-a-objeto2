public class criaconta {
    public static void main(String[] args) {
       conta primeiraconta = new conta();
       primeiraconta.getsaldo = 200;
        System.out.println(primeiraconta.getsaldo);

        primeiraconta.getsaldo += 100;
        System.out.println(primeiraconta.getsaldo);

        conta  segundaconta = new conta();
        segundaconta.getsaldo = 50;

        System.out.println(segundaconta.getsaldo);
        System.out.println(primeiraconta.getAgencia());
        System.out.println(primeiraconta.getnumero());
        System.out.println(segundaconta.getNumero());

    }
}
