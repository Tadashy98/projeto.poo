package menu;

import java.util.Scanner;
import metodos.Metodos;

/**
 *
 * @author tadashy
 */
public class Main {
    public static void main(String[] args) {
        int leitor;
        Scanner scan = new Scanner(System.in);
        Metodos met = new Metodos();
        whilePrograma:
        while (true) {            
                System.out.println("========== SEJA BEM VINDO ==========\n");
                System.out.println("Escolha uma das opções abaixo:\n");
                System.out.println("--------------- MENU ---------------");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Remover");
                System.out.println("3 - Listar");
                System.out.println("4 - Sair");
                System.out.println("--------------- >  < ---------------");
                System.out.println("====================================\n");
                leitor = scan.nextInt();
                switch(leitor){
                    case 1:
                        met.adicionar();
                        break;
                    case 2:
                        met.remover();
                        break;
                    case 3:
                        met.listar();
                        break;
                    case 4:
                        break whilePrograma;
                }
        }
    }    
}
