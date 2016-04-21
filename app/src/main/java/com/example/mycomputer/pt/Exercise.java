package com.example.mycomputer.pt;

/**
 * Created by epatter1 on 4/20/2016.
 */
public class Exercise {
    private final String name;
    public final String description;

    public Exercise(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Exercise(){
        this.name = "";
        this.description = "";
    }

    public String getName(){
        return this.name;
    }
}
