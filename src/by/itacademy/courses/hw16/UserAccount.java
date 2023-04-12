package by.itacademy.courses.hw16;


import java.time.LocalDateTime;
import java.util.Objects;

public class UserAccount implements Cloneable {
    private final String login;
    private final String password;
    private LocalDateTime registrationDate;
    private LocalDateTime lastAuthorizationDate;

    public UserAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserAccount(String login, String password,LocalDateTime registrationDate,LocalDateTime lastAuthorizationDate) {
        this.login = login;
        this.password = password;
        this.registrationDate=registrationDate;
        this.lastAuthorizationDate=lastAuthorizationDate;
    }
    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setLastAuthorizationDate(LocalDateTime lastAuthorizationDate) {
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return Objects.equals(password, that.password);
    }

    @Override
    public String toString() {
        return "login =" + login+
                ", password =" + password +
                ", registrationDate = " + registrationDate +
                ", lastAuthorizationDate = " + lastAuthorizationDate;
    }
}
