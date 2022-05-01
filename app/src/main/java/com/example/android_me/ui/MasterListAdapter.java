package com.example.android_me.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

//Custom adapter class that displays a list if Android-Me images in a GridView
public class MasterListAdapter extends BaseAdapter {

    //Keeps track of the context and list of images to display
    private Context mContext;
    private List<Integer> mImagesId;

    //Constructor
    public MasterListAdapter(Context mContext, List<Integer> mImagesId){
        this.mContext=mContext;
        this.mImagesId=mImagesId;
    }

    @Override
    public int getCount() {
        return mImagesId.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view==null){
            //If the view is not recycled, this creates a new ImageView to hold an image
            imageView=new ImageView(mContext);
            //Define the layout parameters
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else{
            imageView=(ImageView) view;
        }
        //Set the image and return the newly created ImageView
        imageView.setImageResource(mImagesId.get(i));
        return imageView;
    }
}
