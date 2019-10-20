public abstract class Terrorista extends Vilao {
    @Override
    public void atirar(float z) {
        super.atirar(z);
        System.out.println("Terrorista atirando");
    }
}
