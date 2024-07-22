package com.students;

import com.project.superhuman.Human;

public class Gokalp extends Human {
    //private String city; ->bunu yapma :) Zaten Human da var.
    private String gokalpSecret;


    public void cityValue(){
        System.out.println("Şehir : " + this.getCityInfo());
    }

    public Gokalp (){
        super(2);
        gokalpSecret = "egemen anime sevmiyor";
        //this.setCity(city); //şurada bi kalalım....
    }

    public String GetgokalpSecret() {
        return gokalpSecret;
    }

    public String GetTitle(){
        return Unvan;
    }

}