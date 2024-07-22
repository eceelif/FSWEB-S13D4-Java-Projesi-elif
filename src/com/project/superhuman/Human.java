package com.project.superhuman;

public class Human {
    public String isim;
    public int boy;
    public boolean gender;
    public int yas;
    public int weight;
    public int miles;
    public String Unvan;

    private String city;
    private String MaidenName;
    private int favNumber;
    private String country;
    private int runnerMeter;

    public static String CODE;
    public static String API_ENDPOINT;
    public static int defaultStartValue;
    public static String defaultTitle;



    public Human() {
        runnerMeter = 0;
        isim = "isimsiz";
        boy = 170;
        gender = true;
        yas = 30;
        weight = 80;
        Unvan = Human.defaultTitle;
        //Unvan = defaultTitle;

        city = "Ankara";
        MaidenName = "Elem";
        favNumber = 4;
        country = "turkey";

    }

    public Human(int userId) {
        this.runnerMeter = 0;
        Unvan = Human.defaultTitle;
        if (userId == 2) {
            this.isim = "Gökalp";
            this.boy = 190;
            this.gender = true;
            this.yas = 26;
            this.weight = 93;

            this.city = "Trabzon";
            this.MaidenName = "yok";
            this.favNumber = 61;
            this.country = "Turkey";
        }


    }

    public String getCityInfo() {
        if (this.favNumber == 61) {
            return "Böyle bir şehir yok";
        }
        return "Şehir=" + this.city;
    }

    public void setCity(String cityValue){
        city = cityValue;
    }
    public void getCityValue() {
        if (favNumber == 61) {
            System.out.println("Böyle bir şehir yok");
            return;
        }
        System.out.println(city);
    }


    public void run(int runnedMeter) {
        this.runnerMeter = this.runnerMeter + runnedMeter;
        if (favNumber == 61) {
            this.runnerMeter = this.runnerMeter + 2;
        }
    }


    public int runnerMeterValue() {
        return this.runnerMeter;
    }


}
