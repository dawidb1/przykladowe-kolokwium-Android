package com.example.dawid.kawiarnia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Dawid on 31.01.2018.
 */

public class CoffesAdapter extends RecyclerView.Adapter<CoffesAdapter.ViewHolder> {

    public CoffesAdapter(ArrayList<Coffee> coffees) {
        this.coffees = coffees;
    }

    public ArrayList<Coffee> coffees = new ArrayList<>();
    private Context context;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coffee_item,null);
        context = parent.getContext();
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setTvCoffeeName(coffees.get(position).getName());
        holder.setTvPrice(coffees.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return coffees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @OnClick(R.id.submit_coffee) void goKawiarniaActivity(View view){
            Intent intent = new Intent(context,KawiarniaActivity.class);
            context.startActivity(intent);
        }

        @BindView(R.id.coffe_type)
        TextView tvCoffeeName;
        @BindView(R.id.price)
        TextView tvPrice;

        public void setTvCoffeeName(String name){
            this.tvCoffeeName.setText(name);
        }
        public void setTvPrice(int price){
            this.tvPrice.setText(price + "zł");
        }
    }
}
