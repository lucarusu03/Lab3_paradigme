package ro.ulbs.paradigme.lab3.util;

import java.util.Random;

public class PasswordMaker {
    Random rand = new Random();
    private final int MAGIC_NUMBER=5;

    private String name;

    StringRandomizer sr = new StringRandomizer();

    private final String MAGIC_STRING = sr.randomString(20);

    private static PasswordMaker instance = null;

    private PasswordMaker(String name){
        this.name=name;
    }

    public static PasswordMaker getInstance(String name){
        if(instance==null){
            instance=new PasswordMaker(name);
        }
        return instance;
    }

    public String getPassword(){
        String sir=sr.randomString(MAGIC_NUMBER);
        String alfabet=sr.randomString(10,MAGIC_STRING);
        String nume=String.valueOf(name.length());
        int nrrand = rand.nextInt(51);
        return sir+alfabet+nume+nrrand;
    }
}
