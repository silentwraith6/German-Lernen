package com.example.hp.germanarticles;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 16-07-2019.
 */

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewGerman;
        TextView textViewEnglish;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewGerman = (TextView) itemView.findViewById(R.id.textViewGerman);
            this.textViewEnglish = (TextView) itemView.findViewById(R.id.textViewEnglish);
        }
    }

    public CustomAdapter2(ArrayList<DataModel> data) {
        this.dataSet = data;
    }

    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        view.setOnClickListener(Possesive.myOnClickListener);

        CustomAdapter.MyViewHolder myViewHolder = new CustomAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final CustomAdapter.MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewGerman;
        TextView textViewVersion = holder.textViewEnglish;

        textViewName.setText(dataSet.get(listPosition).getPGermanName());
        textViewVersion.setText(dataSet.get(listPosition).getPEnglishName());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}

