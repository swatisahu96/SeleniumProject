package Inheritance.single;

public class Java extends Language{

    String newFeature;


    Java(){

        System.out.println("I am a default child Java");
    }

    Java(String v,String auth, String nf){
        super(v, auth);
        this.newFeature=nf;
    }

    public void printDetails(){

        super.printInfo();
        System.out.println("New feature is:"+newFeature);
    }



}
