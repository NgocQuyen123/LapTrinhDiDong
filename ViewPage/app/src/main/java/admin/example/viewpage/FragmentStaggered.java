package admin.example.viewpage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class FragmentStaggered extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_staggered, container, false);

        recyclerView = view.findViewById(R.id.recyclerStaggered);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            items.add(new Item("Staggered " + i, R.drawable.ic_launcher_background));
        }

        recyclerView.setAdapter(new ItemAdapter(items));
        return view;
    }
}