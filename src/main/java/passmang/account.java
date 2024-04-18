package passmang;

import java.util.Objects;

public class account{
    String type;
    String Email;
    String Username;
    String Password;

    public account(String type, String email, String username, String password) {
        this.type = type;
        Email = email;
        Username = username;
        Password = password;
    }

    public account(String type, String email, String password) {
        this.type = type;
        Email = email;
        Username = email;
        Password = password;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        account account = (account) o;
        return Objects.equals(type, account.type) && Objects.equals(Email, account.Email) && Objects.equals(Username, account.Username) && Objects.equals(Password, account.Password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, Email, Username, Password);
    }
}
