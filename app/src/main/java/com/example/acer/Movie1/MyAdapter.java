package com.example.acer.Movie1;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private final Context context;
    private final List<Moviedata> moviedataList;

    public MyAdapter(MainActivity mainActivity, ArrayList<Moviedata> moviedatalist) {
        this.context = mainActivity;
        this.moviedataList = moviedatalist;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.row, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Picasso.with(context).load(moviedataList.get(position).getImage()).into(viewHolder.imageView);

    }

    @Override
    public int getItemCount() {
        return moviedataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final ImageView imageView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("image", moviedataList.get(position).getImage());
            intent.putExtra("id", moviedataList.get(position).getId());
            intent.putExtra("title", moviedataList.get(position).getTitle());
            intent.putExtra("overview", moviedataList.get(position).getOverview());
            intent.putExtra("release_date", moviedataList.get(position).getReleasedate());
            intent.putExtra("vote_avg", moviedataList.get(position).getVote());
            intent.putExtra("position", position);
            intent.putExtra("movielist", (Serializable) moviedataList);

            context.startActivity(intent);

        }
    }
}
