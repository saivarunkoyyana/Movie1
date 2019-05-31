package com.example.acer.Movie1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    private ImageView backdropimage;
    private ImageView poster;
    private List<Moviedata> moviedataList;
    private TextView title_tv;
    private TextView releasedate_tv;
    private TextView overview_tv;
    private TextView vote_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        backdropimage = findViewById(R.id.backdrop);
        moviedataList = new ArrayList<>();
        Context context = this;
        poster = findViewById(R.id.poster);
        title_tv = findViewById(R.id.title);
        releasedate_tv = findViewById(R.id.releasedate);
        overview_tv = findViewById(R.id.overview);
        vote_tv = findViewById(R.id.vote);


        moviedataList = (List<Moviedata>) getIntent().getSerializableExtra("movielist");
        String title = getIntent().getStringExtra("title");
        String releasedate = getIntent().getStringExtra("release_date");
        String overview = getIntent().getStringExtra("overview");
        String vote = getIntent().getStringExtra("vote_avg");
        int position = getIntent().getIntExtra("position", 0);

        Picasso.with(context).load(moviedataList.get(position).getBackdrop()).into(backdropimage);
        Picasso.with(context).load(moviedataList.get(position).getImage()).into(poster);
        title_tv.setText(getString(R.string.titlename) + title);
        releasedate_tv.setText(getString(R.string.releasedatetext) + releasedate);
        overview_tv.setText("OVERVIEW :" + overview);
        vote_tv.setText("VOTE AVERAGE :" + vote);



    }
}
