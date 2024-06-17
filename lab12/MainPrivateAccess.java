package bank1;

class PrivateAccessDemo {
 private int privateVar = 10;

 private void privateMethod() {
     System.out.println("Private method in PrivateAccessDemo");
 }

 public void accessPrivateMembers() {
     System.out.println("Private variable: " + privateVar);
     privateMethod();
 }
}

public class MainPrivateAccess {
 public static void main(String[] args) {
     PrivateAccessDemo demo = new PrivateAccessDemo();
     demo.accessPrivateMembers();
 }
}