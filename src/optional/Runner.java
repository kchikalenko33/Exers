package optional;

import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> noEmpty = Optional.of("abc");
        System.out.println(noEmpty.orElse("hello"));


       // System.out.println(empty.orElseThrow((() -> new RuntimeException("dfs"))));

        System.out.println(noEmpty.map(n -> n.length()));

        noEmpty.ifPresent(x -> System.out.println("x"));
        empty.ifPresent(x -> System.out.println(x));



    }

}
