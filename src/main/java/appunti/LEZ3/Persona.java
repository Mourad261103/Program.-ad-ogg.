import java.util.Objects;

public class Persona {

    String nome;

    String cognome;

    int anni;

    public Persona(String nome, String cognome, int anni) {
        this.nome = nome;
        this.cognome = cognome;
        this.anni = anni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnni() {
        return anni;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }

    /**
     *
     * SE DUE OGG SONO UGUALI
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return anni == persona.anni && Objects.equals(nome, persona.nome) && Objects.equals(cognome, persona.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, anni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", anni=" + anni +
                '}';
    }
}
