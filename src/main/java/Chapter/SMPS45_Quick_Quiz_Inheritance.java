package Chapter;
class animal{
String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void statement(){
        System.out.println("It' an constructor");
    }
}
class dog extends animal{
    String bark;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}

public class SMPS45_Quick_Quiz_Inheritance {
    public static void main(String[] args) {
        // Object of dog class
        dog local = new dog();
        local.setBark("Boo");
        local.setColor("black");
        System.out.println(local.getBark());
        System.out.println(local.getColor());

        // Object of animal class
        animal cat = new animal();
        cat.setColor("White");
        System.out.println(cat.getColor());
    }
}
