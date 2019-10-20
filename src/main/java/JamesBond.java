public class JamesBond extends Heroi {
    @Override
    public void atirar(float z) {
        super.atirar(z);
        System.out.println("JamesBond atirando");
    }

    @Override
    public void saltar(float z) {
        super.saltar(z);
        System.out.println("JamesBond saltando");
    }
}
