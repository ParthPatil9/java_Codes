package oops;

//Parent class (Superclass)
class Animal {
 String name;

 public void eat() {
     System.out.println(name + " is eating.");
 }
}
//Child class (Subclass) inheriting from Animal
class Dog extends Animal {
 public void bark() {
     System.out.println(name + " is barking");
 }
}
public class inheritance {
 public static void main(String[] args) {
     // Create an object of the subclass (Dog)
     Dog myDog = new Dog();
     
     myDog.name = "Buddy";
     
     myDog.eat();
     
     myDog.bark();
 }
}

