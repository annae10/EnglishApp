package com.ann.englishapp.model;

public class Channel {
    int id;
    String color, img1, title1, img2, title2, img3, title3, img4, title4, img5, title5,
            channelText1, channelText2, channelText3, channelImage1, channelImage2, channelImage3;

    public Channel(int id, String color, String img1, String title1, String img2, String title2,
                   String img3, String title3, String img4, String title4, String img5, String title5,
                   String channelImage1, String channelText1, String channelImage2, String channelText2, String channelImage3, String channelText3) {
        this.id = id;
        this.img1 = img1;
        this.color=color;
        this.title1 = title1;
        this.img2 = img2;
        this.title2 = title2;
        this.img3 = img3;
        this.title3 = title3;
        this.img4 = img4;
        this.title4 = title4;
        this.img5 = img5;
        this.title5 = title5;
        this.channelImage1=channelImage1;
        this.channelText1=channelText1;
        this.channelImage2=channelImage2;
        this.channelText2=channelText2;
        this.channelImage3=channelImage3;
        this.channelText3=channelText3;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getTitle4() {
        return title4;
    }

    public void setTitle4(String title4) {
        this.title4 = title4;
    }

    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5;
    }

    public String getTitle5() {
        return title5;
    }

    public void setTitle5(String title5) {
        this.title5 = title5;
    }

    public String getImg_p1() { return channelImage1; }

    public void setImg_p1(String img_p1) {
        this.channelImage1 = img_p1;
    }

    public String getText1() {
        return channelText1;
    }

    public void setText1(String text1) { this.channelText1 = text1; }

    public String getImg_p2() {
        return channelImage2;
    }

    public void setImg_p2(String img_p2) {
        this.channelImage2 = img_p2;
    }

    public String getText2() {
        return channelText2;
    }

    public void setText2(String text2) { this.channelText2 = text2; }

    public String getText3() {
        return channelText3;
    }

    public void setText3(String text3) {
        this.channelText3 = text3;
    }

    public String getImg_p3() {
        return channelImage3;
    }

    public void setImg_p3(String img_p3) {
        this.channelImage3 = img_p3;
    }

    public String getColor() { return color; }

    public void setColor(String color){this.color=color;}
}
