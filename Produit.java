public class Produit {
    private int code;
    private double prixOrigine;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    public Produit(int code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }
    @Override
    public String toString() {
        return code + ";" + prixOrigine;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Produit) {
            Produit autreProduit = (Produit) obj;
            return this.code == autreProduit.code;
        }
        return false;
    }
    public double prixProduit() {
        return prixOrigine;
    }

}
