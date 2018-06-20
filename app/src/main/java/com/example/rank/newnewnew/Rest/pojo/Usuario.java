package com.example.rank.newnewnew.Rest.pojo;

import com.google.gson.annotations.SerializedName;

public class Usuario {

    @SerializedName("nome")
    public String nome;
    @SerializedName("email")
    public String email;
    @SerializedName("usuario")
    public String usuario;
    @SerializedName("senha")
    public String senha;
    @SerializedName("telefone")
    public String telefone;

    public Usuario(String nome, String email, String usuario, String senha, String telefone) {
        this.nome      = nome;
        this.email     = email;
        this.usuario   = usuario;
        this.senha     = senha;
        this.telefone  = telefone;
    }
}
