package com.cucumberrest.api.models;

import com.google.gson.annotations.SerializedName;

public class Person {
     @SerializedName("surname")
     private String personSurname;

     @SerializedName("name")
     private String personName;

     public String getPersonSurname() {
          return personSurname;
     }

     public String getPersonName() {
          return personName;
     }
}
