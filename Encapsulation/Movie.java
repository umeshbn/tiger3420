package com.xowkz.oops.Encapsulation;

import java.io.File;

public class Movie {
    String name;
   String moviename;
   int duration;
    
     void film (String moviename) {
    	this. moviename=moviename;
    }
     
     
     String film(String name,int duration) {
    	this.name=name;
        this. duration=duration;
    	 return "santosh";
    	}
     
     public static void main(String []args) {
    	Movie m=new Movie();
    	m.film("spider man");
        m.film("spider man",1);
        System.out.println(m.name+"\n"+m.moviename+""+m.duration);

        System.out.println("===========");
    	
    }
}
