package com.ann.englishapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChannelPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel_page);
/*
        ConstraintLayout channelBg = findViewById(R.id.channelPageBg);

        ImageView channelImage1 = findViewById(R.id.channelPageImage1);
        ImageView channelImage2 = findViewById(R.id.channelPageImage2);
        ImageView channelImage3 = findViewById(R.id.channelPageImage3);

        TextView channelText1 = findViewById(R.id.channelPageText1);
        TextView channelText2 = findViewById(R.id.channelPageText2);
        TextView channelText3 = findViewById(R.id.channelPageText3);

        channelBg.setBackgroundColor(getIntent().getIntExtra("channelBg",0));

        channelImage1.setImageResource(getIntent().getIntExtra("channelImage1",0));
        channelImage2.setImageResource(getIntent().getIntExtra("channelImage2",0));
        channelImage3.setImageResource(getIntent().getIntExtra("channelImage3",0));

        channelText1.setText(getIntent().getStringExtra("channelText1"));
        channelText2.setText(getIntent().getStringExtra("channelText2"));
        channelText3.setText(getIntent().getStringExtra("channelText3"));*/
    }
}