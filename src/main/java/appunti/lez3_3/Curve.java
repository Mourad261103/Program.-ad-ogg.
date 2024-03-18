package appunti.lez3_3;


/**
 * abstract si usa ne caso si voglia fare una classe ibrida con metodi non ancora esistenti
 * i metodi astratti gli viene data un corpo in automatico e si usa per dare metodi univoci sotto classi
 */

/**
 * in interfacce possiamo implementare solo metodi ne attributi ne niente e sono astratte non istanziate
 */

/**
 * le classi normali sono concrete e istanziate in cui non eseste il concettto di ibrido
 */

/**
 * FULL CLASSE E SOTTO CLASSI
 * class implement Iterfaccia: questa usata per dare metodi univoci per tutte le sotto classi
 * interfacci: un azzione o un metodo che deve essere sempre fatto in tutte le classi
 * classi extend abstractclass:
 *
 * OSS:l'interfaccia ci da il concetto di polimorfismo
 * quindi possimao definire sottoclassi con classe generale abstract
 */

/**  INSTACES
 * System.out.println(new Triangle() instanceof Curve); //vediamo se Triangle e una sotto classe di Curve e ritorna true false
 *
 *
 *
 *
 */

/**
 * interface Movable {
 *     void stepAhead();
 *     void turnLeft();
 *     void turnRight();
 *
 *     default void turnAround() {
 *         turnLeft();
 *         turnLeft();
 *     }
 * }
 *
 * i metodi di defoult sevono per fare varie modifiche
 */

