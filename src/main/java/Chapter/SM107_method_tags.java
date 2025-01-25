package Chapter;
/**
 * this is description of class
 * */
public class SM107_method_tags {
    /**
     *
     * @param args these are argumentsupplied to command line
     * */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *
     * @param i This is the first number to add
     * @param j this is the second number to add
     * @return sum of two numbers as an integer
     * @throws  Exception if i is 0
     * @deprecated  this method is deprecated please use + operator
     */
    public int add(int i,int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i+j;
        return c;
    }
}
