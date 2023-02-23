import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Boutique {
    private ArrayList<Produit> produits;

    public Boutique() {
        this.produits = new ArrayList<Produit>();
    }

    public int indiceDe(int code) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void ajouter(Produit p) throws Exception {
        if (indiceDe(p.getCode()) != -1) {
            throw new Exception("Produit déjà existant dans la boutique.");
        }
        produits.add(p);
    }

    public boolean supprimer(int code) {
        int indice = indiceDe(code);
        if (indice == -1) {
            return false;
        } else {
            produits.remove(indice);
            return true;
        }
    }

    public boolean supprimer(Produit p) {
        return produits.remove(p);
    }

    public int nombreProduitsEnSolde() {
        int nombre = 0;
        for (Produit produit : produits) {
            if (produit instanceof ProduitEnSolde) {
                nombre++;
            }
        }
        return nombre;
    }

    public void enregistrer(String chemin) throws Exception {
        try {
            FileWriter fw = new FileWriter(chemin);
            for (Produit produit : produits) {
                fw.write(produit.toString() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            throw new Exception("Erreur ");
        }
    }
}
