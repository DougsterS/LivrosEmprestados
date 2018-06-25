package outros;

/**
 *
 * @author Douglas Monteiro, Karoline Lyra & Icaro Ibernon
 * Classe responsável por conter os menus principais do programa
 * 
 */
public class Menus {
    
    public void cabecalho(){/*Cabeçalho do menu principal*/
        System.out.println("----------------------------\n "
                + "     Emprestador     \n" + 
                "----------------------------");
    }
    
    public void menuTexto(){/*Opções do Menu Principal*/
        System.out.println("Programa utilizado para registrar livros emprestados\n" +
                "Por favor escolha a opção que deseja executar\n" +
                "1 - Registrar Livro Emprestado\n" +
                "2 - Sair\n");
    }
    
}
