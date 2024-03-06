package com.awais.portfolio;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticleViewHolder> {

    Context context;
    List<Article> data;

    public ArticlesAdapter(Context context, List<Article> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_article,parent,false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        Article article=data.get(position);
        holder.name.setText(article.getName());
        holder.image.setImageResource(article.getImage());
        holder.post.setOnClickListener(v -> {
            Intent intent=new Intent(context,PortfolioDetailActivity.class);
            intent.putExtra("data",new Gson().toJson(article));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
