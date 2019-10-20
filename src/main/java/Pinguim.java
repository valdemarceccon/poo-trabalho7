public class Pinguim extends Ladrao {
    @Override
    public void atirar(float z) {
        super.atirar(z);
        System.out.println("Pinguim atirando");
    }

    @Override
    public void correr(float x, float y) {
        super.correr(x, y);
        System.out.println("Pinguim correndo");
    }
}
