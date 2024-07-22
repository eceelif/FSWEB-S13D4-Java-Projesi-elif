package com.students;

import com.project.superhuman.Human;

public class Egemen extends Human {
    private String egemenSecret;

    // constructers
    public Egemen() {
        super();
        egemenSecret = "anime seviyor : "+ Human.CODE;
    }



    public String getEgemenSecret() {
        return egemenSecret;
    }


}
