package auxiliares;

/**
 *
 * @author Douglas Monteiro, Karoline Lyra & Icaro Ibernon
 * Classe utilizada para conter as informações básicas de tempo
 * Dia/Mês/Ano
 * 
 */
public class Datas {
    
    private String mes;/*Variável responsável por conter o mês*/
    private String ano;/*Variável responsável por conter o ano*/
    private String dia;/*Variável responsável por conter o dia*/

    public String getDia() {/*Getter da variável privada dia*/
        return dia;
    }

    public void setDia(String dia) {/*Setter da variável privada dia*/
        this.dia = dia;
    }
    

    public String getMes() {/*Getter da variável privada mes*/
        return mes;
    }

    public void setMes(String mes) {/*setter da variável privada mes*/
        this.mes = mes;
    }

    public String getAno() {/*Getter da variável privada ano*/
        return ano;
    }

    public void setAno(String ano) {/*Setter da variável privada ano*/
        this.ano = ano;
    }


}
