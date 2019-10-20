public abstract class Vilao extends Personagem {
    @Override
    public void correr(float x, float y) {
        super.correr(x, y);
        System.out.println("Vilao correndo");
    }
}
