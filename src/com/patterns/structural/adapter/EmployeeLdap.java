package com.patterns.structural.adapter;

public class EmployeeLdap {

    private String cn;
    private String surname;
    private String giventName;
    private String mail;

    public EmployeeLdap(String cn, String surname, String giventName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.giventName = giventName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGiventName() {
        return giventName;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "EmployeeLdap{" +
                "cn='" + cn + '\'' +
                ", surname='" + surname + '\'' +
                ", giventName='" + giventName + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
