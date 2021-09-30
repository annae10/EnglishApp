package com.ann.englishapp.adapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ann.englishapp.ChannelPage;
import com.ann.englishapp.MainActivity;
import com.ann.englishapp.R;
import com.ann.englishapp.Start;
import com.ann.englishapp.model.Channel;

import java.util.List;

public class ChannelAdapter extends RecyclerView.Adapter<ChannelAdapter.ChannelViewHolder>{

    Context context;
    List<Channel> channels;

    public ChannelAdapter(Context context, List<Channel> channels) {
        this.context = context;
        this.channels = channels;
    }

/*
public ChannelAdapter(MainActivity mainActivity, List<Channel> channelList) {

    }

    public Context getContext() {
        return context;
    }

    public List<Channel> getChannels() {
        return channels;
    }
*/
    @NonNull
    @Override
    public ChannelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View channelItems = LayoutInflater.from(context).inflate(R.layout.channel_item, parent, false);
        return  new ChannelAdapter.ChannelViewHolder(channelItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ChannelViewHolder holder, @SuppressLint("RecyclerView") int position) {
       /* holder.channelBg.setBackgroundColor((Color.parseColor(channels.get(position).getColor())));*/

        int imageId1 = context.getResources().getIdentifier(channels.get(position).getImg1(), "drawable", context.getPackageName());
        holder.image1.setImageResource(imageId1);
        holder.text1.setText(channels.get(position).getTitle1());

        int imageId2 = context.getResources().getIdentifier(channels.get(position).getImg2(), "drawable", context.getPackageName());
        holder.image2.setImageResource(imageId2);
        holder.text2.setText(channels.get(position).getTitle2());

        int imageId3 = context.getResources().getIdentifier(channels.get(position).getImg3(), "drawable", context.getPackageName());
        holder.image3.setImageResource(imageId3);
        holder.text3.setText(channels.get(position).getTitle3());

        int imageId4 = context.getResources().getIdentifier(channels.get(position).getImg4(), "drawable", context.getPackageName());
        holder.image4.setImageResource(imageId4);
        holder.text4.setText(channels.get(position).getTitle4());

        int imageId5 = context.getResources().getIdentifier(channels.get(position).getImg5(), "drawable", context.getPackageName());
        holder.image5.setImageResource(imageId5);
        holder.text5.setText(channels.get(position).getTitle5());
//////////////////////////////////////
        /*int imagePId1 = context.getResources().getIdentifier(channels.get(position).getImg_p1(), "drawable", context.getPackageName());
        holder.channelImage1.setImageResource(imagePId1);
        holder.channelText1.setText(channels.get(position).getText1());

        int imagePId2 = context.getResources().getIdentifier(channels.get(position).getImg_p2(), "drawable", context.getPackageName());
        holder.channelImage2.setImageResource(imagePId2);
        holder.channelText2.setText(channels.get(position).getText2());

        int imagePId3 = context.getResources().getIdentifier(channels.get(position).getImg_p3(), "drawable", context.getPackageName());
        holder.channelImage3.setImageResource(imagePId3);
        holder.channelText3.setText(channels.get(position).getText3());*/

       /**/ holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(context, ChannelPage.class);

               /* ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(
                        (Activity) context,
                        new Pair<View,String>(holder.channelImage1, "channelImage1")
                );*/

                intent1.putExtra("channelBg", Color.parseColor(channels.get(position).getColor()));
                context.startActivity(intent1/*, options.toBundle()*/);


                /*intent.putExtra("image1",imageId1);
                 intent.putExtra("text1",channels.get(position).getTitle1());
                intent.putExtra("image2",imageId2);
                intent.putExtra("text2",channels.get(position).getTitle2());
                intent.putExtra("image3",imageId3);
                intent.putExtra("text3",channels.get(position).getTitle3());
                intent.putExtra("image4",imageId4);
                intent.putExtra("text4",channels.get(position).getTitle4());
                intent.putExtra("image5",imageId5);
                intent.putExtra("text5",channels.get(position).getTitle5());*/

                /*intent.putExtra("channelImage1", imagePId1);
                intent.putExtra("channelText1", channels.get(position).getText1());
                intent.putExtra("channelImage2", imagePId2);
                intent.putExtra("channelText2", channels.get(position).getText2());
                intent.putExtra("channelImage3", imagePId3);
                intent.putExtra("channelText3", channels.get(position).getText3());

                */
            }
        });
       /******* holder.logo.setOnClickListener(new View.OnClickListener(){

           public void onClick(View view){
               Intent intent2 = new Intent(context, Start.class);

               intent2.putExtra("channelBg", Color.parseColor(channels.get(position).getColor()));
               context.startActivity(intent2);
           }
       });*******/

    }

    @Override
    public int getItemCount() { return channels.size(); }

    public  static final class ChannelViewHolder extends RecyclerView.ViewHolder{

        /*LinearLayout*/ CardView channelBg;
        ImageView image1, image2, image3, image4, image5, logo, channelImage1,channelImage2,channelImage3;
        TextView text1, text2, text3, text4, text5, channelText1, channelText2, channelText3;
        View channel1, channel2, channel3, channel4, channel5;

        public ChannelViewHolder(@NonNull View itemView) {

            super(itemView);

          /*  channelBg = itemView.findViewById(R.id.channelBg);*/
            image1 = itemView.findViewById(R.id.image1);
            text1 = itemView.findViewById(R.id.text1);
            image2 = itemView.findViewById(R.id.image2);
            text2 = itemView.findViewById(R.id.text2);
            image3 = itemView.findViewById(R.id.image3);
            text3 = itemView.findViewById(R.id.text3);
            image4 = itemView.findViewById(R.id.image4);
            text4 = itemView.findViewById(R.id.text4);
            image5 = itemView.findViewById(R.id.image5);
            text5 = itemView.findViewById(R.id.text5);
            /*logo = itemView.findViewById(R.id.logo);*/
            /*channel1=itemView.findViewById(R.id.channel1);
            channel2=itemView.findViewById(R.id.channel2);
            channel3=itemView.findViewById(R.id.channel3);
            channel4=itemView.findViewById(R.id.channel4);
            channel5=itemView.findViewById(R.id.channel5);*/
           /* channelImage1=itemView.findViewById(R.id.channelPageImage1);
            channelText1=itemView.findViewById(R.id.channelPageText1);
            channelImage2=itemView.findViewById(R.id.channelPageImage2);
            channelText2=itemView.findViewById(R.id.channelPageText2);
            channelImage3=itemView.findViewById(R.id.channelPageImage3);
            channelText3=itemView.findViewById(R.id.channelPageText3);*/

        }
    }
}
