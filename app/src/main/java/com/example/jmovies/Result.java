package com.example.jmovies;

import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("name")
    private String superName;

    public Result(String superName) {
        this.superName = superName;
    }

    public String getSuperName() {
        return superName;
    }

    public String getName() {
        return superName;
    }
}
