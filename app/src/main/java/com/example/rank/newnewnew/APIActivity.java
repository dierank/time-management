package com.example.rank.newnewnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rank.newnewnew.Rest.pojo.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class APIActivity extends AppCompatActivity
{
    ListView lista;
    APIInterface apiInterface;
    APIInterface api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);

        // Referência da listView layout_api
        lista = findViewById(R.id.listaUsuarios);

        // Função para buscar os dados em formato JSON
        getUsuarios();
    }

    private void getUsuarios() {
        // Cria o client Retrofit REST se baseando na interface API
        api = APIClient.getClient().create(APIInterface.class);

        // Busca os dados de acordo com a URL dada e as classes utilizadas
        Call<List<Usuario>> call = api.getUsuarios();
        call.enqueue(new Callback<List<Usuario>>() {
            @Override
            public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
                // Coleta os dados do 'response' e coloca em uma lista de Usuario
                List<Usuario> usuarioLista = response.body();

                // Cria um vetor de strings que conterá um nome em cada posição
                String[] usuarios = new String[usuarioLista.size()];

                // Loop para atribuir os nomes da tabela ao vetor de strings acima criado
                for (int i = 0; i < usuarioLista.size(); i++) {
                    usuarios[i] = usuarioLista.get(i).nome;
                }

                // Aplica este vetor de strings como uma listView no android
                lista.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, usuarios));
            }

            // Caso haja erros na busca de dados
            @Override
            public void onFailure(Call<List<Usuario>> call, Throwable t) {
                // Chama um 'toast' com a mensagem de erro
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
