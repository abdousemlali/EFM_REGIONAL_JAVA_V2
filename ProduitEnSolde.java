public class ProduitEnSolde extends Produit {
    private double remise;

    public ProduitEnSolde(int code, double prixOrigine) {
        super(code, prixOrigine);
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        if (remise < 0 || remise > 90) {
            throw new IllegalArgumentException("La remise doit être comprise entre 0 et 90");
        }
        this.remise = remise;
    }

    @Override
    public double prixProduit() {
        return getPrixOrigine() * (1 - (remise / 100));
    }
    @Override
    public String toString() {
        return super.toString() + ";" + remise;
    }

}
