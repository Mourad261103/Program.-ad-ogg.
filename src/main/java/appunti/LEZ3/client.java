import java.time.LocalDate;

public class client extends Persona{
    int contcnum;

    LocalDate datacollab;

    boolean gold;

    public client(String nome, String cognome, int anni, int contcnum, boolean gold,LocalDate datacollab) {
        super(nome, cognome, anni);
        this.contcnum = contcnum;
        this.gold = gold;
        this.datacollab=datacollab;
    }


}
