/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

import TrabalhoFinal.Produto;
import java.util.ArrayList;

/**
 *
 * @author douglasdanieldelfrari
 */
public class RepositoriosManager {
    
    private static RepositoriosManager instancia;
    
    // contador de produtos
    private int contadorProdutos = 1;

    
    // guarda os dados de PRODUTOS
    private ArrayList<Produto> listaProdutos;
    
    
    // retorna a instancia do repositorio manager
    public static RepositoriosManager getInstance() {
        
        if (instancia == null) {
            
            instancia = new RepositoriosManager();
        }
        
        return instancia;
    }

    // construtor private
    private RepositoriosManager() {
        
        listaProdutos = new ArrayList<Produto>();
        
        
    }
    
    
    /**
     * Usado para obter o contador atual
     * @return o numero atual do contador
     */
    public int getContadorProdutos() {
        return contadorProdutos;
    }
    
    
    
    public void inserirProduto(Produto p) {
        
        listaProdutos.add(p); 
        
        contadorProdutos++; 
        
    }
    
    
    public ArrayList<Produto> obterListaProdutos() {
        
        return listaProdutos;
    }

    /**
     * Cadastra dados FAKE para testes
     */
    private void loadProdutosParaTestes( ) {
        
        for (int i = 0; i < 20; i++) { 
            Produto p = new Produto("codigo", "nome", 1, "fornecedor", 1, 1, "Observ");
            
            contadorProdutos++;
            listaProdutos.add(p);
        }
        
        
    }

    
    
}
