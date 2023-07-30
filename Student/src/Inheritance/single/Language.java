package Inheritance.single;

public class Language {

    public String author;
    public String version;

    Language(){

        System.out.println("In Parent class");
    }

    Language( String author, String version){
        this.author = author;
        this.version= version;
    }


    public void printInfo(){

        System.out.println("Programming Language{ version: "+version+" ,author:"+author+"}");
    }






}
