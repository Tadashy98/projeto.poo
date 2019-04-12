package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servico.Funcionario;
import servico.Pessoa;
import setor.Setor;

/**
 *
 * @author tadashy
 */
public class Metodos {
    List<Funcionario> funcionarios = new ArrayList();
    
    public void adicionar(){
        Scanner scan = new Scanner(System.in);
        Funcionario func = new Funcionario();
        
        Pessoa pessoa = new Pessoa();
        System.out.println("Preparando o cadastro...");
        System.out.println("\n");
        System.out.println("==================================\n");
        System.out.println("Informe o código:");
        pessoa.setCodigo(scan.nextInt());
        System.out.println("Informe o nome:");
        scan = new Scanner(System.in);
        
        pessoa.setNome(scan.nextLine());
        
        scan = new Scanner(System.in);
        
        System.out.println("Informe a idade:");
        pessoa.setIdade(scan.nextInt());
        
        Setor setor = new Setor();
        System.out.println("Setor:");
        System.out.println("Informe o código do setor:");
        setor.setCodigo(scan.nextInt());
        System.out.println("Informe o nome do setor:");
        
        scan = new Scanner(System.in);
        setor.setNome(scan.nextLine());
        
        func.setPessoa(pessoa);
        func.setSetor(setor);
        
        funcionarios.add(func);
        System.out.println("Funcionário cadastrado com sucesso!");
        System.out.println("==================================\n");
    }
    public void remover(){
        Scanner scan = new Scanner(System.in);
        Funcionario func = new Funcionario();
        Pessoa pessoa = new Pessoa();
        System.out.println("Preparando a remoção...");
        System.out.println("==================================\n");
        System.out.println("Informe o código do funcionário:");
        func.getPessoa().setCodigo(scan.nextInt());
        funcionarios.remove(func);
        System.out.println("funcionário removido com sucesso!");
        System.out.println("==================================\n");
    }
    public void listar(){
        for (Funcionario func : funcionarios) {
            System.out.println("=========== Funcionário ===========");
            System.out.println("Código: "+func.getPessoa().getCodigo());
            System.out.println("Nome: "+func.getPessoa().getNome());
            System.out.println("Idade: "+func.getPessoa().getIdade());
            System.out.println("Setor:");
            System.out.println("Código: "+func.getSetor().getCodigo());
            System.out.println("Nome: "+func.getSetor().getNome());
            System.out.println("===================================\n");
        }
        System.out.println("\n");
    }
}
