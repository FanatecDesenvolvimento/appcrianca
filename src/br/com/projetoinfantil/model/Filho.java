package br.com.projetoinfantil.model;

public class Filho {

    private int idFilho;
    private String sexoFilho;
    private int dataNascimentoFilho;
    private String nomeFilho;
    private int fkidPai;
    

    public Filho() {
    }

    public Filho(int idFilho, String sexoFilho, int dataNascimentoFilho, String nomeFilho) {
        this.idFilho = idFilho;
        this.sexoFilho = sexoFilho;
        this.dataNascimentoFilho = dataNascimentoFilho;
        this.nomeFilho = nomeFilho;
    }

    public int getIdFilho() {
        return idFilho;
    }

    public void setIdFilho(int idFilho) {
        this.idFilho = idFilho;
    }

    public String getSexoFilho() {
        return sexoFilho;
    }

    public void setSexoFilho(String sexoFilho) {
        this.sexoFilho = sexoFilho;
    }

    public int getDataNascimentoFilho() {
        return dataNascimentoFilho;
    }

    public void setDataNascimentoFilho(int DataNascimentoFilho) {
        this.dataNascimentoFilho = dataNascimentoFilho;
    }

    public String getNomeFilho() {
        return nomeFilho;
    }

    public void setNomeFilho(String nomeFilho) {
        this.nomeFilho = nomeFilho;
    }

      public int getFkidPai() {
        return fkidPai;
    }

    public void setFkidPai(int fkidPai) {
        this.fkidPai = fkidPai;
    }

    
    @Override
    public String toString() {
        return "Filho{" + "idFilho=" + idFilho + ", sexoFilho=" + sexoFilho + ", dataNascimentoFilho=" + dataNascimentoFilho + ", nomeFilho=" + nomeFilho + '}';
    }

  
   

}
