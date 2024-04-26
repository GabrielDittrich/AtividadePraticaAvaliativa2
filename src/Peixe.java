public class Peixe extends Animal {

    private String agua;

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public Peixe(String agua) {
        this.agua = agua;
    }

    public Peixe(int id, String especie, String comida, int patas, String agua) {
        super(id, especie, comida, patas);
        this.agua = agua;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAgua: " + agua;
    }
}
