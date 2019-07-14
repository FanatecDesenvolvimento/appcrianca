package br.com.projetoinfantil.model;
import java.time.LocalDate;
import java.time.Period;

public class Filho {

    private int idFilho;
    private String sexoFilho;
    private LocalDate dataNascimentoFilho;
    private String nomeFilho;
    private int fkidPai;

    public Filho() {
    }

    public Filho(int idFilho, String sexoFilho, LocalDate dataNascimentoFilho, String nomeFilho, int fkidPai) {
        this.idFilho = idFilho;
        this.sexoFilho = sexoFilho;
        this.dataNascimentoFilho = dataNascimentoFilho;
        this.nomeFilho = nomeFilho;
        this.fkidPai = fkidPai;
    }
    
    public Period setIdadeFilho(){
        LocalDate localDate = LocalDate.now();
        Period periodo = Period.between(dataNascimentoFilho, localDate);
        periodo.getYears();
        return periodo;
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

    public LocalDate getDataNascimentoFilho() {
        return dataNascimentoFilho;
    }

    public void setDataNascimentoFilho(LocalDate dataNascimentoFilho) {
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
