package oop.phonebook;

import java.sql.Array;
import java.util.Arrays;

public class PhoneBookArray implements  PhoneBook{

    static final int MAX_PERSONS=256;
    Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person person) {

        for (int i = 0; i < MAX_PERSONS; i++)
        {
            if (phoneBook[i]!=null && phoneBook[i].equals(person))
            {
                return false;
            }
        }

        for (int i = 0; i < MAX_PERSONS; i++)
        {
            if (phoneBook[i]==null)
            {
                phoneBook[i]=person;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person person)
    {
        for (int i = 0; i < MAX_PERSONS; i++)
        {
            if (phoneBook[i]!=null && phoneBook[i].equals(person))
            {
                phoneBook[i]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        Person[] tmp=new Person[MAX_PERSONS];
        int k=0;
        for (int i = 0; i < MAX_PERSONS; i++)
        {
            if (phoneBook[i]!=null &&phoneBook[i].lastname.equals(lastname))
            {
             tmp[k]=phoneBook[i];
             k++;
            }
        }
        return Arrays.copyOf(tmp,k);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] tmp=new Person[MAX_PERSONS];
        int k=0;
        for (int i = 0; i < MAX_PERSONS; i++)
        {
            if (phoneBook[i]!=null && phoneBook[i].lastname.equals(lastname)&&phoneBook[i].name.equals(name))
            {
                tmp[k]=phoneBook[i];
                k++;
            }
        }
        return Arrays.copyOf(tmp,k);
    }
}
