package pl.mpas.microbloge_course.model;

import java.io.File;
import java.util.Date;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private String uniqueAccountName;
    private String userAccountDescription;
    // TODO: change this class for java 8 specific
    private Date accountCreationDate;
    AccountStatus accountStatus;
    File userAvatar;
    AccountType accountType;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", uniqueAccountName='" + uniqueAccountName + '\'' +
                ", userAccountDescription='" + userAccountDescription + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                ", accountStatus=" + accountStatus +
                ", userAvatar=" + userAvatar +
                ", accountType=" + accountType +
                '}';
    }

    public String getUniqueAccountName() {
        return uniqueAccountName;
    }

    public void setUniqueAccountName(String uniqueAccountName) {
        this.uniqueAccountName = uniqueAccountName;
    }

    public String getUserAccountDescription() {
        return userAccountDescription;
    }

    public void setUserAccountDescription(String userAccountDescription) {
        this.userAccountDescription = userAccountDescription;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public File getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(File userAvatar) {
        this.userAvatar = userAvatar;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public User(String login, String password, String uniqueAccountName, String userAccountDescription, Date accountCreationDate, AccountStatus accountStatus, File userAvatar, AccountType accountType) {
        this.login = login;
        this.password = password;
        this.uniqueAccountName = uniqueAccountName;
        this.userAccountDescription = userAccountDescription;
        this.accountCreationDate = accountCreationDate;
        this.accountStatus = accountStatus;
        this.userAvatar = userAvatar;
        this.accountType = accountType;
    }

    public User() {
        // empty
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

}
