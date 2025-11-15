package admin.example.viewpage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentGrid extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid, container, false);

        recyclerView = view.findViewById(R.id.recyclerGrid);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            items.add(new Item("Grid " + i, R.drawable.ic_launcher_background));
        }

        recyclerView.setAdapter(new ItemAdapter(items));
        return view;
    }
}