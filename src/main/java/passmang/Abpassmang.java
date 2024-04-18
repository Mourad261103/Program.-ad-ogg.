package passmang;

import java.util.ArrayList;

public class Abpassmang implements Passmang{
    ArrayList<account> accounts;

    public Abpassmang(ArrayList<account> accounts) {
        this.accounts = new ArrayList<account>();
    }

    @Override
    public boolean addaccount(account new_account) {
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).equals(new_account))
            {
                return false;
            }
        }
        return accounts.add(new_account);
    }

    @Override
    public boolean removeaccount(account account) {
        return accounts.remove(account);
    }

    @Override
    public account[] find_accountsbytype(String type) {
        ArrayList<account> new_list_accoount=new ArrayList<account>();
        for (int i = 0; i < accounts.size(); i++) {
            if(type.equals(accounts.get(i).type))
            {
                new_list_accoount.add(accounts.get(i));
            }
        }
        return new_list_accoount.toArray(new account[]{});
    }
}
