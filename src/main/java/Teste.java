public class Teste {
    public static void main(String[] args) {
        Batman batman = new Batman();
        JamesBond jamesBond = new JamesBond();
        Coringa coringa = new Coringa();
        Pinguim pinguim = new Pinguim();
        Goldfinger goldfinger = new Goldfinger();
        DrNo drNo = new DrNo();

        System.out.println("Batman:");
        batman.atirar(55);
        batman.camuflar(3);
        System.out.println();

        System.out.println("JamesBond");
        jamesBond.atirar(3);
        jamesBond.saltar(33);
        System.out.println();

        System.out.println("Coringa");
        coringa.atirar(10);
        System.out.println();

        System.out.println("Pinguin");
        pinguim.atirar(10);
        pinguim.correr(8,8);
        System.out.println();

        System.out.println("Goldfinger");
        goldfinger.saltar(66);
        goldfinger.camuflar(10);
        goldfinger.personificar(batman);
        goldfinger.personificar(jamesBond);
        System.out.println();

        System.out.println("DrNo");
        drNo.saltar(1234);
        drNo.atirar(4123);
        drNo.correr(1,2);
    }
}
