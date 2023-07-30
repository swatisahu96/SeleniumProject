package Inheritance.single;

public class python extends Language {

    String newFeature;
    python(){

        System.out.println("I am a default child: Python");
    }

    python(String v,String auth, String nf){
        super(v, auth);
        this.newFeature=nf;
    }

    public void printPython(){

        super.printInfo();
        System.out.println("New feature is:"+newFeature);
    }

}
