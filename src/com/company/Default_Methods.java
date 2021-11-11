package com.company;

import java.util.SplittableRandom;

interface camera{
    void snap();
    void recordVideo();
    private void greet2(){ // this method cannot be called outside the interface,class
        // there is one possible condition is need to define in the default method so that it executes.
        System.out.println("Good Morning");
    }
    default void selfie(){ // default methods can directly define in interface and can call in main function ,
        // eventhough if the function is not in define in the class it can execute if it is defined then it will run that method.
        greet2();
        System.out.println("Taking a Selfie");
    }
}
interface wifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}
class Cellphone1{
    void call(int number){
        System.out.println("calling number " + number);
    }
}
class Smartphone1 extends Cellphone1 implements camera,wifi{
    public void snap(){
        System.out.println("Taking a snap");
    }
    public void recordVideo() {
        System.out.println("Recording 4K Video");
    }
    public String[] getNetworks() {
        System.out.println("Getting list of Networks ");
        String[] networkList = {"Dilip@159" , "Arun@s", "Gmg@145"};
        return networkList;
    }
    public void connectToNetworks(String network) {
        System.out.println("Connecting to " + network);
    }
//    public void selfie(){
//        System.out.println("Taking a selfie in SmartPhone");
//    }
}
public class Default_Methods {
    public static void main(String[] args) {
//        Smartphone1 s = new Smartphone1();
//        s.recordVideo();
//        s.snap();
//        s.call(888066);
//        s.selfie();
//        String[] arr = s.getNetworks();
//        for (String item : arr) {
//            System.out.println(item);
//    }

            camera c = new Smartphone1();
            c.recordVideo();
            c.selfie();
            c.snap();
//            c.call(); --> error because reference camera does not contain any call method.
    }
}
