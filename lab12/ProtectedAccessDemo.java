package bank1;

class Parent {
 protected int protectedVar = 10;

 protected void protectedMethod() {
     System.out.println("Protected method in Parent");
 }
}


class Child extends Parent {
 public void accessProtectedMember() {
     System.out.println("Protected variable in Child: " + protectedVar);
     protectedMethod();
 }
}
public class ProtectedAccessDemo {
 public static void main(String[] args) {
     Child child = new Child();
     child.accessProtectedMember();
 }
}