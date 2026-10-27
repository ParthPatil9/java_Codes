package oops;

//Parent class (Superclass)
class Animalo {
 String name;

 public void eat() {
     System.out.println(name + " is eating.");
 }
}
//Child class (Subclass) inheriting from Animal
class Dogo extends Animal {
 public void bark() {
     System.out.println(name + " is barking");
     super.name="super";
     System.out.println(name);
 }
}
public class superr {
 public static void main(String[] args) {
     // Create an object of the subclass (Dog)
     Dogo myDog = new Dogo();
     
     myDog.name = "Buddy";
     
     myDog.eat();
     
     myDog.bark();
 }
}

