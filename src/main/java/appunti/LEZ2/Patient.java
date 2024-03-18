package appunti.LEZ2;

public class Patient {
    //CASI ACESSO:
    //-se metto pubblic posso fare modifiche a piacimento a ogg creato
    //-se non metto niente package-privat modificabili da classi in stesso package
    //-privat nessuno puo vedere o modificare attrubuti o classi

    String name;
    int age;
    float height;

    public Patient(String name, int age, float height) //si usa un costruttore per non avere problemi di non inizializzazzione a null
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Patient(int age)//possiamo avere dei sottocostruttori per ad esempio valori default
    {
        this.name="j_d";
        this.age=age;
    }
    public Patient()//possiamo avere dei sottocostruttori
    {
      this.name="j_d";
      this.age=42;
    }

    //CASO IN CUI ATTRIBUTI SONO TUTTI PRIVATI MA VOGLIAMO MOSTRARRE ATTRIBUTI O MODIFICARLI
    //creo metodi pubblici dopo aver creato costruttore

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
