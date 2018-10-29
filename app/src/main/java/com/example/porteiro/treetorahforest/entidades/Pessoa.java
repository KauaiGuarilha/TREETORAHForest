package com.example.porteiro.treetorahforest.entidades;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String pais;
    private String estado;
    private int num_arvores_cortadas;
    private double volume_m3;
    private int arvores_resp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNum_arvores_cortadas() {
        return num_arvores_cortadas;
    }

    public void setNum_arvores_cortadas(int num_arvores_cortadas) {
        this.num_arvores_cortadas = num_arvores_cortadas;
    }

    public double getVolume_m3() {
        return volume_m3;
    }

    public void setVolume_m3(double volume_m3) {
        this.volume_m3 = volume_m3;
    }

    public int getArvores_resp() {
        return arvores_resp;
    }

    public void setArvores_resp(int arvores_resp) {
        this.arvores_resp = arvores_resp;
    }
}
