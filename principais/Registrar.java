package principais;

/*Imports*/
import auxiliares.Pessoa;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import outros.ManipulaValores;

/**
 *
 * @author Douglas Monteiro, Karoline Lyra & Icaro Ibernon
 * Classe responsável por conter os métodos de registro do programa
 * 
 */
public class Registrar {/*Método responsável por realizar os registros de informações*/
    
    public void registrar(){
        
        try{
        Scanner leitor = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        ManipulaValores valor = new ManipulaValores();
        File arq = new File("Registro.txt");
        boolean existe = arq.exists();
        String titulo;/*Variável que recebe o titulo do livro*/
        String nome;/*Variável que recebe o nome da pessoa a qual o livro foi emprestado*/
        String autor;/*Variável que recebe o nome do autor*/
        String dia;/*Variável que recebe o dia*/
        String mes;/*Variável que recebe o mês*/
        String ano;/*Variável que recebe o ano*/
        String relacionamento;/*Variável que recebe o relacionamento do usuário com a pessoa que recebeu o livro*/
        int opcao;/*Variável que recebe as opções*/
        
        System.out.println("\n\n---------------\n"+
                "   Registrador\n" +
                "---------------\n\n");
        System.out.println("Por Favor, siga os passos a seguir para registrar" +
                "um livro ao qual você emprestou");
        
        System.out.println("1 - Nome do Livro Emprestado:");
        titulo = leitor.nextLine();
        pessoa.tituloLivro(titulo);/*Atribui valor ao método tituloLivro da interface*/
        
        System.out.println("2 - Autor do Livro Emprestado:");
        autor = leitor.nextLine();
        pessoa.autorLivro(autor);/*Atribui valor ao método autorLivro da interface*/
        
        System.out.println("3 - Nome Da Pessoa que voce emprestou:");
        nome = leitor.nextLine();
        pessoa.setNome(nome);/*Atribui valor a variável nome da classe pessoa*/
        
        System.out.println("4 - De onde voce conhece a pessoa " +
                "Ou nível de relacionamento:");
        relacionamento = leitor.nextLine();
        pessoa.setRelacionamento(relacionamento);/*Atribui valor a variável relacionamento da classe pessoa*/
        
        System.out.println("5 - Dia de Hoje:");
        dia = leitor.nextLine();
        pessoa.setDia(dia);/*Atribui valor a variável dia herdada da classe Datas*/
        
        System.out.println("6 - Mês que estamos:");
        mes = leitor.nextLine();
        pessoa.setMes(mes);/*Atribui valor a variável mes herdada da classe Datas*/
        
        System.out.println("7 - Ano em que estamos:");
        ano = leitor.nextLine();
        pessoa.setAno(ano);/*Atribui valor a variável ano herdada da classe Datas*/
        
        /*As próximas 8 linhas são responsáveis por mostrar as informações que o usuário atribuir*/
        System.out.println("\n\nRegistro reaizado com Sucesso!\n\n");
        System.out.println("Nome do Livro: " + pessoa.tituloLivro(titulo) + " Autor: " +
            pessoa.autorLivro(autor));
        System.out.println("Emprestado a: " + pessoa.getNome());
        System.out.println("Relacionamento: " + pessoa.getRelacionamento());
        System.out.println("No dia: " + pessoa.getDia() + "/" 
                + pessoa.getMes() + "/" +
                pessoa.getAno() + "\n\n");
        
        FileWriter fw = new FileWriter(arq,true);/*Classe para escrever dentro do arquivo de resgistro*/
        
        /*Próximas 6 linhas são responsáveis por colocar as informações no arquvo*/
        fw.append("Nome do Livro: " + pessoa.tituloLivro(titulo) + "\r\n" + "Autor: " +
            pessoa.autorLivro(autor) + "\r\n");
        fw.append("Emprestado a: " + pessoa.getNome() + "\r\n");
        fw.append("Relacionamento: " + pessoa.getRelacionamento() + "\r\n");
        fw.append("No dia: " + pessoa.getDia() + "/" 
                + pessoa.getMes() + "/" +
                pessoa.getAno() + "\r\n\r\n");
        fw.close();/*Fecha o Arquivo*/
               
        System.out.println("Deseja realizar outro cadastro?\n" +
                "1 - SIM  || 2 - NÃO e ENCERRAR");
        
        opcao = valor.obterValor();
        
        while (opcao > 2){
            System.out.println("Por Favor informe uma opção válida:\n" +
                "1 - SIM  || 2 - NÃO e ENCERRAR");
            opcao = valor.obterValor();
        }
        
        if (opcao == 1){
            registrar();
        }
        
        if (opcao == 2){
            valor.encerrar();
        }
        }catch(IOException exc){//Trata a exceção de arquivo
            System.out.println("Não quebrou! :/");
        }
    }
}