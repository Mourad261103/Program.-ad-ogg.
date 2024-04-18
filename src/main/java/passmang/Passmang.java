package passmang;

public interface Passmang {
    boolean addaccount(account new_account);
    boolean removeaccount(account account);

    account[] find_accountsbytype(String type);
}
