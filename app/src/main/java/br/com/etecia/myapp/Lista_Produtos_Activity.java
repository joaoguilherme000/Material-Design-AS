package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.etecia.appprodutos.R;

class ListaProdutosActivity extends AppCompatActivity {
    RecyclerView idRecViewProdutos;
    List<Produtos> listaProdutos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_produtos_layout);

        idRecViewProdutos = findViewById(R.id.idRecViewProdutos);

        listaProdutos = new ArrayList<>();
        //lista de produtos
        listaProdutos.add(
                new Produtos("John wick 4", R.drawable.filmes1, 1, 350.00)
        );
        listaProdutos.add(
                new Produtos("Batman", R.drawable.filmes2, 1, 1.00)
        );
        listaProdutos.add(
                new Produtos("Homem aranha 3", R.drawable.filmes3, 1, 1.00)
        );
        listaProdutos.add(
                new Produtos("Grinch", R.drawable.filmes4, 1, 1.00)
        );
        listaProdutos.add(
                new Produtos("Pinoquio", R.drawable.filmes5, 1, 1.00)
        );
        listaProdutos.add(
                new Produtos("Mario o filme", R.drawable.filmes6, 1, 1.00)
        );
        listaProdutos.add(
                new Produtos("Um estranho no ninho", R.drawable.filmes7, 1, 1.00)
        );
        listaProdutos.add(
                new Produtos("Homem aranha no aranha verso", R.drawable.filmes8, 1, 1.00)
        );
        listaProdutos.add(
                new Produtos("O nevoeiro", R.drawable.filmes9, 1, 1.00)
        );
        listaProdutos.add(
                new Produtos("A coisa", R.drawable.filmes10, 1, 1.00)
        );


        ProdutosAdapter adapter = new ProdutosAdapter(getApplicationContext(), listaProdutos);

        idRecViewProdutos.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecViewProdutos.hasFixedSize();

        idRecViewProdutos.setAdapter(adapter);


    }
}