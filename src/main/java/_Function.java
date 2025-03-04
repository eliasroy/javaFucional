import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
       int num= increment(0);

       int num2=increment.apply(45);
         System.out.println(num2);
    }
    static Function<Integer,Integer> increment = x -> x + 1;
    static int increment(int number){
        return number + 1;
    }
}
