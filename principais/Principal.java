package principais;

/*Imports*/
import outros.ManipulaValores;
import outros.Menus;

/**
 *
 * @author Douglas Monteiro, Karoline Lyra & Icaro Ibernon
 * 
 */

public class Principal {
    
    public static void main(String[] args){
        Menus menu = new Menus();
        ManipulaValores valor = new ManipulaValores();
        
        menu.cabecalho();/*Chama os sysos do cabeçalho*/
        valor.menuPrincipal();/*Chama o Menu Principal*/
    }
}
