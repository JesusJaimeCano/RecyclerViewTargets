package e.jesus.recyclerviewtargets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView lugaresRV;
    List<Lugar> lugars;
    LugarAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lugars = new ArrayList<>();

        lugars.add(new Lugar("Piramide", "Su puta madre", 1, R.drawable.artemisa));
        lugars.add(new Lugar("Chichen", "Mas alla de su puta madre", 1, R.drawable.artemisa));
        lugars.add(new Lugar("Zues", "Re Lejos", 1, R.drawable.artemisa));
        lugars.add(new Lugar("Babilonia", "No she carnal", 1, R.drawable.artemisa));
        lugars.add(new Lugar("Artemisa", "Fijate en maps", 1, R.drawable.artemisa));
        lugars.add(new Lugar("Coloso Rodas", "Por asha", 1, R.drawable.artemisa));

        lugaresRV = findViewById(R.id.lugaresRV);
        lugaresRV.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new GridLayoutManager(MainActivity.this, 3);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        lugaresRV.setLayoutManager(linearLayoutManager);

        adapter = new LugarAdapter(lugars);

        lugaresRV.setAdapter(adapter);

    }
}
