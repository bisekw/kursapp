package com.company;

public class User {
   private int id;
   private String logon;
    private String password;


    public User (int id, String logon, String password)
    {
        this.id=id;
        this.logon=logon;
        this.password=password;
    }
    public int getid()
    {
        return id;
    }
    public String getlogon()
    {
        return logon;
    }
    public String getPassword()
    {
        return password;
    }

    public String toString()
    {
        return "User{"+" id= "+id+ ", login= "+ login+'\''+ ", password= "+ password +'\''+ '}';
    }
}
