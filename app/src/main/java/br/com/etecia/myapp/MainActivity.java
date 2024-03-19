package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewLivros;
    List<Livros> lstLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstLivros = new ArrayList<>();
        lstLivros.add(new Livros("john wick 4", "ação", " john wick sai matando todo mundo", R.drawable.filmes1));
        lstLivros.add(new Livros("The batman", "Ficção", "Um dos maiores clássicos da literatura mundial", R.drawable.filmes2));
        lstLivros.add(new Livros("Homem aranha 3", "Auto ajuda", "Eu e Esse Meu Coração", R.drawable.filmes3));
        lstLivros.add(new Livros("The grinch", "Alimentação", "Este não é mais um livro de dieta: O novo e libertador estilo de vida alimentar para saúde e boa", R.drawable.filmes4));
        lstLivros.add(new Livros("Mario bros", "Auto ajuda", "O dilema do porco espinho", R.drawable.filmes6));
        lstLivros.add(new Livros("Um estranho no ninho", "Auto ajuda", "Como fazer amigos", R.drawable.filmes7));
        lstLivros.add(new Livros("Pinnochio", "Romance", "The Vegitarian Life", R.drawable.filmes5));
        lstLivros.add(new Livros("Homem aranha no aranha verso", "Categoria do livro", "Descrição do livro", R.drawable.filmes8));
        lstLivros.add(new Livros("o nevoeiro", "Categoria do livro", "Descrição do livro", R.drawable.filmes9));
        lstLivros.add(new Livros("Enigma de outro mundo", "Categoria do livro", "Descrição do livro", R.drawable.filmes10));

        recyclerViewLivros = findViewById(R.id.idRecyclerLivros);

        recyclerViewLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        ListaAdapter adapter = new ListaAdapter(getApplicationContext(), lstLivros);

        recyclerViewLivros.setAdapter(adapter);


    }
}