package lab1;

public class Produs {
    private int id;
    private String nume;
    private String dataFabricarii;
    private String dataExpirarii;
    private double pret;

    public Produs(int id, String nume, String dataFabricarii, String dataExpirarii, double pret) {
        this.id = id;
        this.nume = nume;
        this.dataFabricarii = dataFabricarii;
        this.dataExpirarii = dataExpirarii;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", dataFabricarii='" + dataFabricarii + '\'' +
                ", dataExpirarii='" + dataExpirarii + '\'' +
                ", pret=" + pret +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }
}