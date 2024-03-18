import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        client p1=new client(
                "marco",
                "rossi",
                33,
                64,
                false,
                LocalDate.of(1034,12,23)
                );
        //UPCASTING SI VA IN GENERALE
        Persona c=new client("marco",
                "rossi",
                33,
                64,
                false,
                LocalDate.of(1034,12,23));//qui posso manioìpolare solo attributi in comun

        //DOWNCAST SI VA NELLO SPECIFICO
    Persona[] people =new Persona[]{p1,c};//METTE ATTRIBUTI IN COMUNE
        for (Persona p : people) {
            System.out.println(p.getCognome());
        }

       Persona p=c;


        /**
         * POLIMORFISMO
         */
        Mammal[] mammals =new Mammal[]{new Mammal(),new Cat(),new Dog()};
        for (int i = 0; i < mammals.length; i++) {
           System.out.println(mammals[i].sayHello());
        }

    }
    }


