public class IdentiteEtCoordonnees {
    String matricule;
    String nom;
    String prenom;
    String date_de_naissance;
    String vile_de_naissance;
    boolean sexe;
    String photo;
    String noEtNomDeRue;
    String codePostal;
    String ville;
    String telephone;
    String email;

    public IdentiteEtCoordonnees(String nom, String prenom, String date_de_naissance, String vile_de_naissance, boolean sexe, String photo, String noEtNomDeRue, String codePostal, String ville, String telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.vile_de_naissance = vile_de_naissance;
        this.sexe = sexe;
        this.photo = photo;
        this.noEtNomDeRue = noEtNomDeRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getVile_de_naissance() {
        return vile_de_naissance;
    }

    public void setVile_de_naissance(String vile_de_naissance) {
        this.vile_de_naissance = vile_de_naissance;
    }

    public boolean getSexe() {
        return sexe;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNoEtNomDeRue() {
        return noEtNomDeRue;
    }

    public void setNoEtNomDeRue(String noEtNomDeRue) {
        this.noEtNomDeRue = noEtNomDeRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
