package interfaces;

import model.Pessoa;

import java.util.List;

public interface BancoArrayPessoaInterface {

    public void cadastrarPessoa(Pessoa pessoa);
    public List<Pessoa> buscarPessoas();
    public void excluirPessoa(int index);
    public void alterarPessoa(int index, Pessoa pessoa);
    public Pessoa filtrarPessoa(Pessoa pessoa, int filtro);

    public int verificarQuantidadeContatos();
    public void apagarAgenda();

}
