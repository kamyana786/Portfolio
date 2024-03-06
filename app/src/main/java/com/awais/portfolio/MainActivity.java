package com.awais.portfolio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArticlesAdapter adapter;
    List<Article> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        data = getArticlesData();
        adapter = new ArticlesAdapter(this, data);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private List<Article> getArticlesData() {
        List<Article> articles = new ArrayList<>();
        Article article = new Article(
                "M.Ahmad",
                "FA21-BSE-140/C",
                "living in Sahiwal",
                R.drawable.ahmad

        );
        articles.add(article);
        article = new Article(
                "Awais Ahmad",
                "FA21-BSE-129/C",
                "living in Okara",
                R.drawable.awais
        );
        articles.add(article);
        article = new Article(
                "Ammar Wahab",
                "FA21-BSE-101/C",
                "living in Haroonabad",
                R.drawable.ammar
        ); articles.add(article);
        article = new Article(
                "Atif Ahmad",
                "FA21-BSE-148/C",
                "living in Serghodha",
                R.drawable.atif
        ); articles.add(article);
        article = new Article(
                "Farhan Riaz",
                "FA21-BSE-168/C",
                "living in Mulatan",
                R.drawable.farhan
        ); articles.add(article);
        article = new Article(
                "Syed kaleem ",
                "FA21-BSE-126/C",
                "living in Deepalpur",
                R.drawable.kaleem
        ); articles.add(article);
        article = new Article(
                "Mubashir Zaffar",
                "FA21-BSE-128/C",
                "living in Sahiwal",
                R.drawable.mubashir
        ); articles.add(article);
        article = new Article(
                "M.Naeem",
                "FA21-BSE-152/C",
                "living in D.G.Khan",
                R.drawable.naeem
        ); articles.add(article);
        article = new Article(
                "Shabaz Abbas",
                "FA21-BSE-127/C",
                "living in Sadiqabad",
                R.drawable.shabaz
        ); articles.add(article);
        article = new Article(
                "Ziafat Majeed",
                "FA21-BSE-120/C",
                "living in Arifwala",
                R.drawable.ziafat
        );articles.add(article);
        article = new Article(
                "M.Naveed",
                "FA21-BSE-155/C",
                "living in pakpattan",
                R.drawable.naveed
        );
        articles.add(article);
        return articles;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}



