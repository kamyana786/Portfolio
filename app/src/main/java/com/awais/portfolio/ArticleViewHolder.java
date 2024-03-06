package com.awais.portfolio;


import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name;
    TextView reg;



    LinearLayout post;
    public ArticleViewHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.image);
        name=itemView.findViewById(R.id.name);
        reg=itemView.findViewById(R.id.reg);


        post=itemView.findViewById(R.id.post);
    }
}
