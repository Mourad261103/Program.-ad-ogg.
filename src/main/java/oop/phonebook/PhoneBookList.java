package oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList  implements PhoneBook{
    static final int MAX_PERSONS=256;

    ArrayList<Person> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person person) {
        if (phoneBook.contains(person) || phoneBook.size()>=MAX_PERSONS)
        {
            return false;
        }
        phoneBook.add(person);
        return true;
    }

    @Override
    public boolean removePerson(Person person) {
            return  phoneBook.remove(person);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp=new ArrayList<>();

        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).lastname.equals(lastname))
            {
               tmp.add(phoneBook.get(i));
            }
        }
        return  tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp=new ArrayList<>();

        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).lastname.equals(lastname) && phoneBook.get(i).name.equals(name))
            {
                tmp.add(phoneBook.get(i));
            }
        }
        return tmp.toArray(new Person[]{});
    }
}
