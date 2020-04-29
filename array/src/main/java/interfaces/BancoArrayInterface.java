package interfaces;

import model.Pessoa;

import java.util.List;

public interface BancoArrayInterface {

    public void cadastrarPessoa(Pessoa pessoa);
    public List<Pessoa> buscarPessoas();
    public void excluirPessoa(int index);
    public Pessoa filtrarPessoa(Pessoa pessoa, int filtro);


}
