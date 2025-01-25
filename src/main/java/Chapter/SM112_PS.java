package Chapter;

import java.io.FileWriter;
import java.io.IOException;

class myDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am meth 1");
    }
}
interface myint{
    void display();

}
public class SM112_PS {
    public static void main(String[] args) {
//    myDeprecated d = new myDeprecated();
//    d.meth1();
//    myint i =() ->System.out.println("I am display");

        int i=5;
        String table = " ";
        for(int j=0;j<=10;j++){
            table += i + "*"+ (j+1) + "="+ i*(j+1);
            table += "\n";
        }
        try{
            FileWriter fileWriter = new FileWriter("multiplication.txt");
            fileWriter.write(table);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }