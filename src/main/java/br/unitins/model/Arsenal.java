package br.unitins.model;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Arsenal extends PanacheEntity{
    private String nomeArma;
    private String paisFabricacao;
    private String numeroSerie;
    private int anoFabricacao;
    public String getNomeArma() {
        return nomeArma;
    }
    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }
    public String getPaisFabricacao() {
        return paisFabricacao;
    }
    public void setPaisFabricacao(String paisFabricacao) {
        this.paisFabricacao = paisFabricacao;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

}
