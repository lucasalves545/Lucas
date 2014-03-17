/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;

/**
 *
 * @author Junior
 */
public class Usuario {
    private int Login;
    private String NomeUsuario;
    private String Senha;
    private int CPF;
    private boolean Situacao;
    

    public int getLogin() {
        return Login;
    }

    public void setLogin(int Login) {
        this.Login = Login;
    }

    public String getNomeUsuario() {
        return NomeUsuario;
    }

    public void setNomeUsuario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
     public boolean getSituacao() {
        return Situacao;
    }

    public void setSituacao(boolean Situacao) {
        this.Situacao = Situacao;
    }
}
