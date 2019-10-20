public abstract class Personagem {
    private boolean vivo;
    protected float posicaoX;
    protected float posicaoY;
    protected float posicaoZ;
    protected int cor;

    public void correr(float x, float y) {
        posicaoX = x;
        posicaoY = y;
    }

    public void saltar(float z) {
        posicaoZ = z;
    }

    public void atirar(float z) {
        posicaoZ = z;
    }
    public void morrer(float z) {
        posicaoZ = z;
        System.out.println("Morto");
    }
}
