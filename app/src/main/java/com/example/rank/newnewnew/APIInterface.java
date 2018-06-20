package com.example.rank.newnewnew;

import com.example.rank.newnewnew.Rest.pojo.Usuario;
import com.example.rank.newnewnew.model.Atividade;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface APIInterface
{
    String BASE_URL = "http://192.168.9.14/APIRest/public/api/";

    @GET("usuarios")
    Call<List<Usuario>> getUsuarios();

    @GET("usuario/{id}/atividades")
    Call<List<Atividade>> getAtividades(@Path("id") String var);
}
