import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

       int num2=increment.apply(45);
       int num3=multiplyBy10.apply(45);

       Function<Integer,Integer> add1AndMultiplyBy10 = increment.andThen(multiplyBy10);

         System.out.println(add1AndMultiplyBy10.apply(1));
    }
    static Function<Integer,Integer> increment = x -> x + 1;

    static Function<Integer,Integer> multiplyBy10 = x -> x * 10;


}
