package com.ignateva.hw_cookie2.entity;

public class User {


    public String name;
   public static String e_mail;
   public static String pass;

    public User(String name, String e_mail, String pass) {

        this.name = name;

        this.e_mail =e_mail;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n"+

                "Почта: " + e_mail + "\n";
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getE_mail() {
        return e_mail;
    }

    public static void setE_mail(String e_mail) {
        User.e_mail = e_mail;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        User.pass = pass;
    }
}
