public class manager extends Employee{

    boolean smile;

    public manager(String nome, String cognome, int anni, int salary, boolean smile) {
        super(nome, cognome, anni, salary);
        this.smile = smile;
    }

    public boolean isSmile() {
        return smile;
    }

    public void setSmile(boolean smile) {
        this.smile = smile;
    }

    @Override
    public String toString() {
        return "manager{" +
                "smile=" + smile +
                ", salary=" + salary +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", anni=" + anni +
                '}';
    }
}
