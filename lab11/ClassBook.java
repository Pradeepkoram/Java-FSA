package lab11;


interface Person {
 void speak();
}

class Student implements Person {
 
 public void speak() {
     System.out.println("Student speaks: Hello, I am a student.");
 }
}
class Teacher implements Person {

 public void speak() {
     System.out.println("Teacher speaks: Good morning class!");
 }

}
public class ClassBook{
 public static void main(String[] args) {
     Student student = new Student();
     Teacher teacher = new Teacher();
     student.speak();
     teacher.speak();
 }
}