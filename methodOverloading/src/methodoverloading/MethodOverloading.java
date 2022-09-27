package methodoverloading;
public class MethodOverloading {

    public static void main(String[] args) {
        
        FourOperation op = new FourOperation();
        int result = op.summation(222, 422, 13);
        System.out.println(result);

    }
}
