package fr.pteodoresco.dansmoncoin;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainMenu extends Fragment {

    public MainMenu() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button listButton = view.findViewById(R.id.list_button);
        listButton.setOnClickListener(event -> {
            Intent intent = new Intent(MainMenu.this.getContext(), ListActivity.class);
            startActivity(intent);
        });

        Button mapButton = view.findViewById(R.id.map_button);
        mapButton.setOnClickListener(event -> {
            Intent intent = new Intent(MainMenu.this.getContext(), MapActivity.class);
            startActivity(intent);
        });
    }
}