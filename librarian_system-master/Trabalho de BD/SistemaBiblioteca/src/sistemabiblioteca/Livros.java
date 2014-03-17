/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;

/**
 *
 * @author Junior
 */
public class Livros {
    private int CodLivro;
    private String NomeLivro;
    private String Autor;
    private String Editora;
    private int Ano;
    private String Gênero;
    private int Quantidade;
    

    public int getCodLivro() {
        return CodLivro;
    }

    public void setCodLivro(int CodLivro) {
        this.CodLivro = CodLivro;
    }

    public String getNomeLivro() {
        return NomeLivro;
    }

    public void setNomeLivro(String NomeLivro) {
        this.NomeLivro = NomeLivro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }
    
    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getGênero() {
        return Gênero;
    }

    public void setGênero(String Gênero) {
        this.Gênero = Gênero;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

}
