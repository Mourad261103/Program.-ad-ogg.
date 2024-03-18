public class Employee extends Persona{
    int salary;

    public Employee(String nome, String cognome, int anni, int salary) {
        super(nome, cognome, anni);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", anni=" + anni +
                '}';
    }
}
