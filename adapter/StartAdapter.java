package com.ann.englishapp.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.ann.englishapp.R;

public class StartAdapter {


    public static final class StartViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;

        public MainViewHolder(View itemView) {

            /*super(itemView);*/

            logo = itemView.findViewById(R.id.logo);
        }

    }
}
