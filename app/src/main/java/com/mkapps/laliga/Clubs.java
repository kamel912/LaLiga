package com.mkapps.laliga;

/**
 * Created by MK on 08/12/2016.
 */

public class Clubs {
    String name,position,stadium;
    int emblem,points;

    public Clubs(String n, String p,String s, int o, int e) {
        this.name = n;
        this.position = p;
        this.emblem = e;
        this.points = o;
        this.stadium= s;
    }
}
