package ro.ulbs.paradigme.lab3.util;

import java.util.Random;

public class PasswordMaker {
    Random rand = new Random();
    private final int MAGIC_NUMBER=5;

    private String name;

    StringRandomizer sr = new StringRandomizer();

    private final String MAGIC_STRING = sr.randomString(20);

    public PasswordMaker(String name){
        this.name=name;
    }

    public String getPassword(){
        String sir=sr.randomString(MAGIC_NUMBER);
        String alfabet=sr.randomString(10,MAGIC_STRING);
        String nume=String.valueOf(name.length());
        int nrrand = rand.nextInt(51);
        return sir+alfabet+nume+nrrand;
    }
}
