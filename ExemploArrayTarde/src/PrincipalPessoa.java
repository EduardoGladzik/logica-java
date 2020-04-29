import java.util.LinkedList;
import java.util.List;

/**
 * @author thiago-cury
 * @since 07/04/2020 - 16:19
 * @version 1.0
 */
public class PrincipalPessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Thiago");
        pessoa1.setIdade(36);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Eduardo");
        pessoa2.setIdade(21);

        List<Pessoa> contatos = new LinkedList<>();
        contatos.add(pessoa1);
        contatos.add(pessoa2);

//        System.out.println(contatos.get(0).toString());

        for(Pessoa pessoa : contatos) {
            System.out.println(pessoa.toString());
        }
    }
}
