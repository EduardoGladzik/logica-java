package DAO;

import interfaces.BancoArrayPessoaInterface;
import model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class BancoArrayPessoa implements BancoArrayPessoaInterface {

    private List<Pessoa> agenda;

    public BancoArrayPessoa() {
        this.agenda = new ArrayList<>();
    }

    @Override
    public void cadastrarPessoa(Pessoa pessoa) {
        this.agenda.add(pessoa);
    }

    @Override
    public List<Pessoa> buscarPessoas() {
        return this.agenda;
    }

    @Override
    public void excluirPessoa(int index) {
        this.agenda.remove(index);
    }

    @Override
    public void alterarPessoa(int index, Pessoa pessoa) {
        this.agenda.add(index, pessoa);
//        Array.set(this.agenda, index, pessoa);
    }

    @Override
    public Pessoa filtrarPessoa(Pessoa pessoa, int filtro) {
        switch(filtro) {
            case 1: //filtro por nome
                for (Pessoa pessoaAuxiliar : this.agenda) {
                    if (pessoaAuxiliar.getNome().contains(pessoa.getNome())) {
                        return pessoaAuxiliar;
                    }
                }
                break;

            case 2: //filtro por idade
                //nao implementado
                break;
        }
        return null;
    }

    @Override
    public int verificarQuantidadeContatos() {
        return this.agenda.size();
    }

    @Override
    public void apagarAgenda() {
        this.agenda.clear();
    }
}
