package com.example.dawid.kawiarnia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KawiarniaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kawiarnia);
        ButterKnife.bind(this);
    }

    @BindView(R.id.choose_food)
    Button btnChooseFood;
    @BindView(R.id.table_number)
    EditText etTableNumber;

    @OnClick(R.id.choose_food) void goCoffeeListActivity(){
        Intent intent = new Intent(KawiarniaActivity.this,CoffeeListActivity.class);
        startActivity(intent);
    }
}
