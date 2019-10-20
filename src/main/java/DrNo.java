public class DrNo extends Terrorista {
    @Override
    public void correr(float x, float y) {
        super.correr(x, y);
        System.out.println("DrNo correndo");
    }

    @Override
    public void atirar(float z) {
        super.atirar(z);
        System.out.println("DrNo atirando");
    }

    @Override
    public void saltar(float z) {
        super.saltar(z);
        System.out.println("DrNo saltando");
    }
}
