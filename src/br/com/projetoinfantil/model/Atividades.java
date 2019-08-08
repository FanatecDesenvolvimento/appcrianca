/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoinfantil.model;

/**
 *
 * @author android
 */
public class Atividades {
    private int idAtividades;
    private String descricaoAtividades;
    private String faixaAtividades;

    public Atividades() {
    }

    public Atividades(int idAtividades, String descricaoAtividades, String faixaAtividades) {
        this.idAtividades = idAtividades;
        this.descricaoAtividades = descricaoAtividades;
        this.faixaAtividades = faixaAtividades;
    }

    public int getIdAtividades() {
        return idAtividades;
    }

    public void setIdAtividades(int idAtividades) {
        this.idAtividades = idAtividades;
    }

    public String getDescricaoAtividades() {
        return descricaoAtividades;
    }

    public void setDescricaoAtividades(String descricaoAtividades) {
        this.descricaoAtividades = descricaoAtividades;
    }

    public String getFaixaAtividades() {
        return faixaAtividades;
    }

    public void setFaixaAtividades(String faixaAtividades) {
        this.faixaAtividades = faixaAtividades;
    }

    @Override
    public String toString() {
        return "Atividades{" + "idAtividades=" + idAtividades + ", descricaoAtividades=" + descricaoAtividades + ", faixaAtividades=" + faixaAtividades + '}';
    }
    
    
}
