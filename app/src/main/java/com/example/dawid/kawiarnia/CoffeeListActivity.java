package com.example.dawid.kawiarnia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CoffeeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffee_list);
        ButterKnife.bind(this);

        coffees = new ArrayList<>();
        coffees.add(new Coffee("Black",6));
        coffees.add(new Coffee("White",7));
        coffees.add(new Coffee("Cappucino",10));
        coffees.add(new Coffee("Mocca",12));
        coffees.add(new Coffee("Latte",12));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
//
        CoffesAdapter coffesAdapter = new CoffesAdapter(coffees);
        recyclerView.setAdapter(coffesAdapter);
    }

    private ArrayList<Coffee> coffees;
    @BindView(R.id.recycle_view) RecyclerView recyclerView;

}
