package com.mj.animals_project.commutils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mj.animals_project.R;

import java.util.List;


/**
 * Created by kim on 2018/7/31.
 */

public  class HomeAdapter  extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private Context context;
    private List mDatas;
    private int layoutID;
    public HomeAdapter(Context context, List mDatas,int layoutID){
        this.context=context;
        this.mDatas=mDatas;
        this.layoutID=layoutID;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(layoutID, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText((String) mDatas.get(position));
    }


    @Override
    public int getItemCount()
    {
        return mDatas.size();
    }

  class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView tv;

        MyViewHolder(View view)
        {
            super(view);
           tv = (TextView) view.findViewById(R.id.id_num);

        }
    }


}

