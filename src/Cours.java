public class Cours {
    private String  code;
    private String  nom;
    private String  description;
    private String  anne;
    private float   coefficientDuCours;
    private float   pourcentageDE;
    private float   pourcentageTP;
    private float   pourcentageProjet;

    public Cours(String code, String nom, String description, String anne, float coefficientDuCours, float pourcentageDE, float pourcentageTP, float pourcentageProjet) {
        this.code = code;
        this.nom = nom;
        this.description = description;
        this.anne = anne;
        this.coefficientDuCours = coefficientDuCours;
        this.pourcentageDE = pourcentageDE;
        this.pourcentageTP = pourcentageTP;
        this.pourcentageProjet = pourcentageProjet;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnne() {
        return anne;
    }

    public void setAnne(String anne) {
        this.anne = anne;
    }

    public float getCoefficientDuCours() {
        return coefficientDuCours;
    }

    public void setCoefficientDuCours(float coefficientDuCours) {
        this.coefficientDuCours = coefficientDuCours;
    }

    public float getPourcentageDE() {
        return pourcentageDE;
    }

    public void setPourcentageDE(float pourcentageDE) {
        this.pourcentageDE = pourcentageDE;
    }

    public float getPourcentageTP() {
        return pourcentageTP;
    }

    public void setPourcentageTP(float pourcentageTP) {
        this.pourcentageTP = pourcentageTP;
    }

    public float getPourcentageProjet() {
        return pourcentageProjet;
    }

    public void setPourcentageProjet(float pourcentageProjet) {
        this.pourcentageProjet = pourcentageProjet;
    }
}
