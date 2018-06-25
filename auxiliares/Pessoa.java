package auxiliares;

/**
 *
 * @author Douglas Monteiro, Karoline Lyra & Icaro Ibernon
 * Classe responsável por conter informações pertinentes ao programa.
 * 
 */
public class Pessoa extends Datas implements Livro{
    
    /*Variáveis locais: nome e relacionamento*/
    private String nome;/*Variável que irá receber o nome do indivíduo*/
    private String relacionamento;/*Variável que irá receber a relação entre pessoas*/

    public String getRelacionamento() {/*Getter da variável privada relacionamento*/
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {/*Setter da variável privada relacionamento*/
        this.relacionamento = relacionamento;
    }

    
    @Override/*Implementa o método tituloLivro da interface Livro*/
    public String tituloLivro(String titulo) {
        return titulo;/*Retorna ao método a String imposta a titulo*/
    }

    @Override/*Implementa o método autorLivro da interface Livro*/
    public String autorLivro(String autor) {
        return autor;/*Retorna ao método a String imposta a autor*/
    }
    
    public String getNome() {/*Getter da variavel privada nome*/
        return nome;
    }

    public void setNome(String nome) {/*Setter da variável privada nome*/
        this.nome = nome;
    }

   
}
