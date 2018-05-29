package pl.mpas.microbloge_course.model;

import com.google.common.base.Preconditions;

import java.io.File;
import java.util.Date;
import java.util.Objects;

public class User {
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String login;
    private String password1;
    private String password2;
    private String uniqueAccountName;
    private String userAccountDescription;
    // TODO: change this class for java 8 specific
    private Date accountCreationDate;
    AccountStatus accountStatus;
    File userAvatar;
    AccountType accountType;

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

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password1='" + password1 + '\'' +
                ", password2='" + password2 + '\'' +
                ", uniqueAccountName='" + uniqueAccountName + '\'' +
                ", userAccountDescription='" + userAccountDescription + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                ", accountStatus=" + accountStatus +
                ", userAvatar=" + userAvatar +
                ", accountType=" + accountType +
                '}';
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public User(String login, String password1, String password2) {
        this.login = login;
        this.password1 = password1;
        this.password2 = password2;
    }

    public User(String login, String password1, String password2, String uniqueAccountName, String userAccountDescription, Date accountCreationDate, AccountStatus accountStatus, File userAvatar, AccountType accountType) {
        this.login = login;
        this.password1 = password1;
        this.password2 = password2;
        this.uniqueAccountName = uniqueAccountName;
        this.userAccountDescription = userAccountDescription;
        this.accountCreationDate = accountCreationDate;
        this.accountStatus = accountStatus;
        this.userAvatar = userAvatar;
        this.accountType = accountType;
    }

    public User(String login, String password1, String uniqueAccountName, String userAccountDescription, Date accountCreationDate, AccountStatus accountStatus, File userAvatar, AccountType accountType) {
        this.login = Preconditions.checkNotNull(login, "Argument cannot be null!");
        this.password1 = Preconditions.checkNotNull(password1, "Argument cannot be null!");
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

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password1, user.password1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password1);
    }

}
