package lab10;

//Superclass: Hillstations
class Hillstations {
 public void location() {
     System.out.println("Location: Generic hill station location");
 }
 public void famousfor() {
     System.out.println("Famous for: Scenic beauty");
 }
}
class Manali extends Hillstations {
 
 public void location() {
     System.out.println("Location: Manali, Himachal Pradesh, India");
 }

 public void famousfor() {
     System.out.println("Famous for: Rohtang Pass, Solang Valley");
 }
}

class Mussoorie extends Hillstations {
 public void location() {
     System.out.println("Location: Mussoorie, Uttarakhand, India");
 }
 public void famousfor() {
     System.out.println("Famous for: Kempty Falls, Lal Tibba");
 }
}


class Gulmarg extends Hillstations {
 public void location() {
     System.out.println("Location: Gulmarg, Jammu and Kashmir, India");
 }
 public void famousfor() {
     System.out.println("Famous for: Skiing, Gondola rides");
 }
}

public class ClassMain {
 public static void main(String[] args) {
     Hillstations manali = new Manali();
     Hillstations mussoorie = new Mussoorie();
     Hillstations gulmarg = new Gulmarg();

     manali.location();
     manali.famousfor();

     mussoorie.location();
     mussoorie.famousfor();

     gulmarg.location();
     gulmarg.famousfor();
 }
}
