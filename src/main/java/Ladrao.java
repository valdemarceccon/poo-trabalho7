public abstract class Ladrao extends Vilao {
    @Override
    public void saltar(float z) {
        super.saltar(z);
        System.out.println("Ladrao saltando");
    }
}
