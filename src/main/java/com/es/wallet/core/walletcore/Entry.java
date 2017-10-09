package com.es.wallet.core.walletcore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "entry")
public class Entry implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="category")
    private String category;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="userName")
    private String user;

    @Column(name="url")
    private String url;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name = "passwordHint")
    private String passwordHint;

    @Column(name="pin")
    private String pin;


    //protected constructor for JPA
    protected Entry() {
    }

    public Entry(long id, String category, String title, String description, String user, String url, String email, String password, String passwordHint, String pin) {
        this.id=id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.user = user;
        this.url = url;
        this.email = email;
        this.password = password;
        this.passwordHint = passwordHint;
        this.pin = pin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user='" + user + '\'' +
                ", url='" + url + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", passwordHint='" + passwordHint + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}

