public class Batman extends Heroi implements Camuflagem {
    public void camuflar(int cor) {
        this.cor = cor;
        System.out.println("Batman camuflando");
    }

    @Override
    public void atirar(float z) {
        super.atirar(z);
        System.out.println("Batman atirando");
    }
}
