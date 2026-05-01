package learn;

/**
     * ACCESS SPECIFIER ON CLASSES *

 1. TOP LEVEL
 Only 2 Specifier  -
 public - Can Access from anywhere
    e.g. public class Student { }
 default(no keywords) - can access only within same package
    e.g. class Helper { }
 ****NOTE****
 One .java file can have only one public class, and its name must match the filename.

 Why no private or protected specifier here ??
 A : private → means no one can access it — pointless for a top-level class
 protected → means same package + subclasses — Java says use default instead

 2. Inner Class (class inside another class)
 class Outer {
 public class A { }
 private class B { }
 protected class C { }
 class D { }
 }
 * */

/**
 * ACCESS SPECIFIER ON ATTRIBUTES & METHODS *

 1. public -  access from anywhere
 eg :
 public class Student {
 public String name = "Surya";
 }

 2. private - Accessible only within the same class.
 eg:
 class Student {
 private int age = 20;
 void display() {
 System.out.println(age);
 }
 }
 3. protected - Accessible within same class + same package + subclasses.
 eg :
 javaclass Animal {
 protected String sound = "roar";
 }

 * */

/**
    * STATIC KEYWORD *
 static means the member belongs to the class, not to any object.
 * Static Variable - One copy shared across all objects.
 * Static Method -  Can be called without creating an object.

 0_0 NOTES (0)_(0)
    Static method cannot use instance variables or this keyword ,
    because there's no object context.

    * Static Block *
 Runs once when class is loaded — before main or constructor.
 example :
    class Student {
        static int count;

        static {
            count = 100; // runs once at class loading
            System.out.println("Static block ran!");
        }
    }
 */

/**
    * FINAL KEYWORD *
 * final means cannot be changed/overridden.
    final variable - cannot be changed
    final method -  cannot be override
    final class - cannot be inherited

 */

public class PcBuild{
    private String name ;
    private byte age ;
    public static class Builder{
        private String name ;
        private byte age ;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setAge(byte age){
            this.age = age;
            return this;
        }
        public PcBuild build(){
            PcBuild obj = new PcBuild();
            obj.name = this.name;
            obj.age = this.age;
            return obj;
        }
    }
    public void display(){
        System.out.println("NAME : " + name);
        System.out.println("AGE : " + age);
    }
}

