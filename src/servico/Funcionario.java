package servico;

import setor.Setor;

/**
 *
 * @author tadashy
 */
public class Funcionario {
    Setor setor = new Setor();
    Pessoa pessoa = new Pessoa();

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
