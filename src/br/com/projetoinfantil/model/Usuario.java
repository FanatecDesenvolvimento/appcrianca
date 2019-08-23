
package br.com.projetoinfantil.model;


public class Usuario {
    private int idUsu;
    private String nomeUsu;
    private String loginUsu;
    private String senhaUsu;

    public Usuario(int idUsu, String nomeUsu, String loginUsu, String senhaUsu) {
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.loginUsu = loginUsu;
        this.senhaUsu = senhaUsu;
        
    }
    

    public Usuario() {
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getLoginUsu() {
        return loginUsu;
    }

    public void setLoginUsu(String loginUsu) {
        this.loginUsu = loginUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

  
    public String toString() {
        return "Usuario " + "idUsu " + idUsu + "nomeUsu " + nomeUsu + "loginUsu " + loginUsu + "senhaUsu " + senhaUsu;
    }

}
