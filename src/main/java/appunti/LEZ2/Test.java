package appunti.LEZ2;

public class Test {



    public static void main(String[] args) {

        //CREANDO UN COSTRUTTORE non si ha problemi visto che a mancanti dati valori defoult
        Patient p1=new Patient("FIL",30,180);

       //CON QUESTO TIPO SI PUO INCONBERE IN ERRORI
        //p1.name="jj";
        //p1.height=180;
       //p1.age=30;

        System.out.println(p1.name+" "+p1.age+" "+p1.height);

        Patient p2= new Patient();
        System.out.println(p2.name);
        System.out.println(p1);//stampa id ogg
        p1.setName("gg");//questo e piu lento

    }



}

