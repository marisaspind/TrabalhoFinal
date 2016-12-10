/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

import TrabalhoFinal.Produto;

/**
 *
 * @author douglasdanieldelfrari
 */
public class ControllerCadastro {
    
    // singleton
    
    
    
    public boolean cadastrarProduto(Produto p) {
     
        boolean result = false;
        
        if (p != null && p.getCod().length()>0 &&
                         p.getNome().length()>0&& 
                         p.isQuantidade()!=0 &&
                         p.getVlCompra()!=0 &&
                         p.getVlVenda()!=0 &&
                         p.getObserv().length()>0) {
   
            // insere no modelo de dados
            RepositoriosManager.getInstance().inserirProduto(p);
            
            System.out.println(p.toString());
            
            result = true;
        }
        
        
        return result;
    }
}

    
    

