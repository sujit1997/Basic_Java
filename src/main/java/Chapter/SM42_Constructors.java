package Chapter;
    class myMainEmployee{
        private int id;
        private String name;


        public myMainEmployee(){ // It's an constructor
           id = 45;
           name= "munna";
        }

        public myMainEmployee(String myName, int myId){ // It's a second constructor by same name so it's an Constructor Verloading
        id = myId;
        name = myName;
        }

        public String getName(){return name;}
        public void setName(String n){ this.name = n;}
        public int getId(){return id;}
        public void setId(int i){ this.id = i;}

    }
public class SM42_Constructors {
    public static void main(String[] args) {
    myMainEmployee sujit = new myMainEmployee("Sujit",55);
    myMainEmployee munna = new myMainEmployee();

    //sujit.setName("Sujit manmode");
    //sujit.setId(2);
        System.out.println(sujit.getName());
        System.out.println(sujit.getId());
        System.out.println(munna.getId());
        System.out.println(munna.getName());

    }
}
