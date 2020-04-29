import java.util.HashSet;
import java.util.Set;

public class Principal1 {
    public static void main(String[] args) {

        //Set - referencia diamond
        Set<String> nomes = new HashSet<>();

        nomes.add("thiago");
        nomes.add("thiago");
        nomes.add("brenda");
        nomes.add("lyanna");
        nomes.add("taiane");
        nomes.add("tatiane");
        nomes.add("tertulio");

        System.out.println("Tem(os) "+ nomes.size() + " pessoa(s) cadastrada(s) na base!");
//        for(String nome : nomes) {
//            System.out.println(nome);
//        }

        //JDK8 9 10 11 e jdk12 - LAMBDA....
//        nomes.forEach(nome -> System.out.println(nome));

//        nomes.forEach(System.out::println);

        //filtro sem lambda
//        for(String nome : nomes) {
//            if(nome.contains("t")) {
//                System.out.println(nome);
//            }
//        }

        nomes.stream().filter(nome -> nome.contains("t")).forEach(System.out::println);

    }
}