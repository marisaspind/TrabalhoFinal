
package TrabalhoFinal;

import TrabalhoFinal.TelaCadastrar2;
import TrabalhoFinal.TelaExibir3;
import javax.swing.JTextField;

public class Produto {
        // atributos
    private String cod;
    private String nome;
    private int quantidade;
    private String fornecedor;
    private float vlVenda;
    private float vlCompra;
    private String Observ;
    
    

    public Produto(String cod,String nome,int quantidade, String fornecedor,float vlVenda, float vlCompra,String Observ) {
        this.cod = cod;
        this.nome = nome;
        this.quantidade= quantidade;
        this.fornecedor=fornecedor;
        this.vlVenda = vlVenda;
        this.vlCompra = vlCompra;       
        this.Observ =Observ;
    }

    Produto() {
        
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(float vlVenda) {
        this.vlVenda = vlVenda;
    }

    public float getVlCompra() {
        return vlCompra;
    }

    public void setVlCompra(float vlCompra) {
        this.vlCompra = vlCompra;
    }

    public int isQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public  String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor( String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getObserv() {
        return Observ;
    }

    public void setObserv(String Observ) {
        this.Observ = Observ;
    }


    

    

   @Override
    public String toString() {
        String valores = "Codigo"+cod+
                       "Nome="+nome+
                       "quantidade"+quantidade+
                       "fornecedor"+ fornecedor+
                       "vlVenda"+vlVenda+
                        "vlCompra"+vlCompra+
                         "Observação"+Observ;
                         
        
        return valores;
    }

    
    
    
    
    
}
