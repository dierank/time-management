package com.example.rank.newnewnew.Rest.pojo;

import com.google.gson.annotations.SerializedName;

public class Atividade {

    @SerializedName("id")
    public String id;
    @SerializedName("id_usuario")
    public String id_usuario;
    @SerializedName("id_categoria")
    public String id_categoria;
    @SerializedName("nome")
    public String nome;
    @SerializedName("notas")
    public String notas;
    @SerializedName("criadoEm")
    public String criadoEm;
    @SerializedName("atividade_inicio")
    public String atividade_inicio;
    @SerializedName("atividade_fim")
    public String atividade_fim;

    public Atividade() {

    }


}
