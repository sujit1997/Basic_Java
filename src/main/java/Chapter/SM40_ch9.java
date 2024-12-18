package Chapter;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

}
public class SM40_ch9 {
    public static void main(String[] args) {
    MyEmployee sujit = new MyEmployee();
    // sujit.id = 45;
    // sujit.name = "Sujit"; // Throws an error due to private access modifiers

    sujit.setName("Sujit Manmode");
    System.out.println(sujit.getName());

    sujit.setId(1);
    System.out.println(sujit.getId());
    }
}
