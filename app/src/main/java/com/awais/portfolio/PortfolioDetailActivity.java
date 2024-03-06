package com.awais.portfolio;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class PortfolioDetailActivity extends AppCompatActivity {
    TextView name;
    TextView reg;
    TextView description;
    ImageView image;
    Article article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_detail);
        name=findViewById(R.id.name);
        reg=findViewById(R.id.reg);
        description=findViewById(R.id.description);
        image=findViewById(R.id.image);

        article=new Gson().fromJson(getIntent().getStringExtra("data"),Article.class);

        name.setText(article.getName());
        reg.setText(article.getReg());
        description.setText(article.getDescription());
        image.setImageResource(article.getImage());



    }



}