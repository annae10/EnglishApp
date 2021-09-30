package com.ann.englishapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ann.englishapp.adapter.CategoryAdapter;
import com.ann.englishapp.adapter.ChannelAdapter;
import com.ann.englishapp.model.Category;
import com.ann.englishapp.model.Channel;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, channelRecycler;
    CategoryAdapter categoryAdapter;
    ChannelAdapter channelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Movies"));
        categoryList.add(new Category(2, "Trips"));
        categoryList.add(new Category(3, "Comedy"));
        categoryList.add(new Category(4, "Serials"));

        setCategoryRecycler(categoryList);

        List<Channel> channelList = new ArrayList<>();
        channelList.add(new Channel(1,  "white","tourism", "Tourism",
                "transport", "Transport", "science", "Science",
                "art","Art","sport","Sport", "tourism1_text","tourism2_text",
                "abc", "tourism1", "tourism2", "tourism3" ));
        channelList.add(new Channel(2, "white","nature","Nature",
                "food","Food","cinema","Cinema",
                "music","Music","profession","Profession", "cinema","art","food",
                "tourism1","tourism2","tourism3"));

        setChannelRecycler(channelList);
    }
    private void setChannelRecycler(List<Channel> channelList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        channelRecycler = findViewById(R.id.channelRecycler);
        channelRecycler.setLayoutManager(layoutManager);

        channelAdapter = new ChannelAdapter(this, channelList);
        channelRecycler.setAdapter(channelAdapter);

    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this,categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}