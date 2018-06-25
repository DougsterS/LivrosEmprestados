/*
 *@author Douglas Monteiro, Karoline Lyra & Icaro Ibernon
 * Classe contendo os principais métodos do projeto
 */
package outros;

/*Imports*/
import java.util.InputMismatchException;
import java.util.Scanner;
import principais.Registrar;

/**
 *
 * @author Douglas Monteiro & Karol Lyra
 */
public class ManipulaValores {
    
    Scanner leitor = new Scanner(System.in);
    
    public int obterValor(){
		/**
		 * Método responsável por adquirir um valor do usuário
		 * para que este seja usufruido pelo programa
		 * 
		 */
		int valor = -1;
		System.out.println("Informe a opção que deseja seguir: ");
		while(true){
                    valor = leitor.nextInt();
                    if (valor > 0){
			break;//Encerra o método no momento que o usuário informa um valor maior que 0
                    }
                    else{
			while(valor < 0 || valor == 0 ) {
        			System.out.println("Por Favor, informe uma opção válida:");/*Caso seja informado um número negativo, 
																			o programa requisita ao usuário 
																			um valor maior que zero*/
				valor = leitor.nextInt();
				if(valor > 0) break;
                        }
                        return valor;
                    }
		}
		
            return valor;
	}
    
    public void encerrar() {//Método para encerrar o programa
	System.out.println("\n\nObrigado por utilizar nossos serviços!");
	System.out.println("Você faz a diferença!");
	System.exit(0);
	}
    
        public void menuPrincipal(){
            
        int opcao = 0;/*variavel para receber as opções*/
        Menus menu = new Menus();/*Cria a classe menu para ser implementada*/
        Registrar registro = new Registrar();/*Cria classe de Registro*/
        
        menu.menuTexto();
        try{
        opcao = obterValor();
        switch(opcao){
            case 1:
                registro.registrar();
            break;
            case 2:
                encerrar();
            break;
            default:
                System.out.println("\n\nValor inválido por favor tente novamente!\n\n");
            break;
            
        }
        }catch(InputMismatchException exc){
            
        System.out.println("\n\nCoisa feia cara, querendo quebrar '-' Vacilão\n\n");
        
        }
    }
}