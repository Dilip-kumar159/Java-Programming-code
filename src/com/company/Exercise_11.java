package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen{
    void wirte(){
        System.out.println("Writing....");
    }
    void refill(){
        System.out.println("Refilling....");
    }
    void changeNib(){
        System.out.println("Changing the Nib....");
    }
}

class monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smarttelephone extends telephone{
    void ring(){
        System.out.println("Call is Ringing");
    }
    void lift(){
        System.out.println("lift the call");
    }
    void disconnect(){
        System.out.println("Disconnect the call");
    }
    void mute(){
        System.out.println("Mute the call");
    }
}

interface tvremote{
    void on();
    void change();
}
interface smart_remote extends tvremote{
    void off();
    void music_button();
}
class tv implements tvremote,smart_remote{
    public void on(){
        System.out.println("On the tv");
    }
    public void change(){
        System.out.println("Change the channel");
    }
    public void off(){
        System.out.println("Off the Tv");
    }
    public void music_button(){
        System.out.println("Play music");
    }

}
public class Exercise_11 {
    public static void main(String[] args) {
        // problem 1 --> abstract class creation
//        fountainpen p = new fountainpen();
//        p.changeNib();
//        p.refill();
//        p.wirte();
        // problem 2 --> classes and interfaces and demonstrating in polymorphism.
//        human dilip = new human();
//        dilip.eat();
//        dilip.sleep();
//        dilip.jump();
//        dilip.bite();
        // using Polymorphism
//        BasicAnimal b = new human();
//        b.eat();
//        b.sleep();
//       b.bite(); --> error because reference is basicanimal where the bite() method is not present in that interface.
//        monkey m = new human();
//        m.bite();
//        m.jump();
        // Problem 3 --> abstract classes and demonstrating the polymorphism.
//        smarttelephone st = new smarttelephone();
//        st.lift();
//        st.ring();
//        st.disconnect();
//        st.mute();
//        // defining the polymorphism
//        telephone t = new smarttelephone();
//        t.disconnect();
//        t.lift();
//        t.ring();
//        t.mute(); // here mute method won't display because it is not belong to telephone class ,
//        telephone class is a reference to the smarttelephone class

        // problem 4 --> interface inheritance and implementing a class
        tv t = new tv();
        t.on();
        t.music_button();
        t.change();
        t.off();

    }
}
