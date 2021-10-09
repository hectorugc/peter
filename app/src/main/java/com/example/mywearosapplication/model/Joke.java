package com.example.mywearosapplication.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Joke implements Serializable {
    String id;
    String value;
    String created_at;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }




}
