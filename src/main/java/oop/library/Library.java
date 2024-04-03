package oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    ArrayList<Rent> rents;

    public Library() {
        this.rents = new ArrayList<>();
    }

    public boolean addRent(Rent a)
    {
       return rents.add(a);
    }
    public boolean removeRent(Rent a)
    {
        return rents.remove(a);
    }
    public ArrayList getExpired(LocalDate a)
    {
        ArrayList<Rent> Expiredrent = new ArrayList<>();
        for (int i = 0; i < rents.size(); i++) {
            if(rents.get(i).end.isAfter(a))
            {
                Expiredrent.add(rents.get(i));
            }
        }
        return Expiredrent;
    }

}
