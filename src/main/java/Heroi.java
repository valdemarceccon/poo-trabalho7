public abstract class Heroi extends Personagem {
    @Override
    public void correr(float x, float y) {
        super.correr(x, y);
        System.out.println("Heroi correndo");
    }

    @Override
    public void saltar(float z) {
        super.saltar(z);
        System.out.println("Heroi saltando");
    }

}
