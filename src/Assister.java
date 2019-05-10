public class Assister {
    String  code;
    String  matricule;
    float   noteDE;
    float   noteTP;
    float   noteProjet;

    public Assister(String code, String matricule, float noteDE, float noteTP, float noteProjet) {
        this.code = code;
        this.matricule = matricule;
        this.noteDE = noteDE;
        this.noteTP = noteTP;
        this.noteProjet = noteProjet;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public float getNoteDE() {
        return noteDE;
    }

    public void setNoteDE(float noteDE) {
        this.noteDE = noteDE;
    }

    public float getNoteTP() {
        return noteTP;
    }

    public void setNoteTP(float noteTP) {
        this.noteTP = noteTP;
    }

    public float getNoteProjet() {
        return noteProjet;
    }

    public void setNoteProjet(float noteProjet) {
        this.noteProjet = noteProjet;
    }
}
