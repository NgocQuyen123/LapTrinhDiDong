package admin.example.bt_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    List<MyItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        itemList.add(new MyItem("Cà phê sữa", "Đậm đà hương vị Việt", R.drawable.coffee));
        itemList.add(new MyItem("Trà đào", "Mát lạnh và thơm ngon", R.drawable.tea));
        itemList.add(new MyItem("Sinh tố bơ", "Béo ngậy tự nhiên", R.drawable.smoothie));

        adapter = new MyAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}