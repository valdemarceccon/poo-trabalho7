public class Goldfinger extends Terrorista implements Personificacao {

    private Heroi heroi;

    public void personificar(Heroi h) {
        this.heroi = h;
        System.out.println("Personificando");
    }

    public void camuflar(int cor) {
        this.cor = cor;
        System.out.println("Goldfinger camuflando");
    }

    @Override
    public void saltar(float z) {
        super.saltar(z);
        System.out.println("Goldfinger saltando");
    }
}
