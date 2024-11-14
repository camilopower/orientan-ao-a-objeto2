public class testereferencias {
    public static void main(String[] args) {
        conta primeiraconta = new conta();
        conta segundaconta = new conta();
        primeiraconta.getsaldo = 200;

        System.out.println( primeiraconta.getsaldo);

        primeiraconta.getsaldo +=100;
        System.out.println(primeiraconta.getsaldo);

        segundaconta.getsaldo = 300;

        System.out.println("primeira conta tem" + primeiraconta.getsaldo);

        System.out.println("saldo da secunda conta" + segundaconta.getsaldo);


        System.out.println(primeiraconta.getsaldo);

        System.out.println("sao a mesmissima conta");
        if(primeiraconta == segundaconta){
            System.out.println("sao a mesmissima conta");


        }
    }
}
