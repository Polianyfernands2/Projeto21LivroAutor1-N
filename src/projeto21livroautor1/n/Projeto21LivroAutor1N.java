/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto21livroautor1.n;

/**
 *
 * @author aluno
 */
public class Projeto21LivroAutor1N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Livro objLivro = new Livro();
    objLivro.setTitulo("Herois do Olimpo");
    objLivro.setEditora( "Saraiva" );
    objLivro.setAno( 2001 );
    
    Autor objAutor = new Autor();
    objAutor.setNome("Rick Riorda");
    objAutor.setAnoNasc( 1970 );
    objAutor.setEmail( "titio.rick@gmail.com" );
    objAutor.setObra(objLivro);
    objLivro.addAutor
    System.out.println("Livro: "  +objLivro.getTitulo( ) 
             +objLivro.getEditora( ) 
             +objLivro.getAno( ));
    System.out.println("Autor: " +objAutor.getNome( )+ 
             objAutor.getAnoNasc( )+ 
             objAutor.getEmail( ));
      }
}
