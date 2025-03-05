import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //Function
       int num2=increment.apply(1);
       int num3=multiplyBy10.apply(1);

       Function<Integer,Integer> add1AndMultiplyBy10 = increment.andThen(multiplyBy10);

       //bifunction
       int num4=add.apply(1,100);
         System.out.println(num4);
    }
    static Function<Integer,Integer> increment = x -> x + 1;


    static Function<Integer,Integer> multiplyBy10 = x -> x * 10;

    static BiFunction<Integer,Integer,Integer> add = (increment,multiplyBy10) -> increment + multiplyBy10;
}
