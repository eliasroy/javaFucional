import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<String>nombre = List.of("Juan", "Pedro", "Luis");
        //use predicate return true or false
        Predicate<String> predicado = n->n.length()<5;
         nombre.stream().filter(predicado).collect(Collectors.toList()).forEach(System.out::println);
    }
}
