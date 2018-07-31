package com.mj.animals_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mj.animals_project.commutils.DividerGridItemDecoration;
import com.mj.animals_project.commutils.HomeAdapter;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  {
    ArrayList<String> mDatas;
    @BindView(R.id.id_recyclerview)
    RecyclerView idRecyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        idRecyclerview = findViewById(R.id.id_recyclerview);
        idRecyclerview.setLayoutManager(new GridLayoutManager(this,4));
        idRecyclerview.setAdapter(new HomeAdapter(MainActivity.this, mDatas,R.layout.item));
        //idRecyclerview.setAdapter();
//        idRecyclerview.setAdapter(mAdapter = new HomeAdapter(MainActivity.this, mDatas) {
//            @Override
//            protected void initViewHolder() {
//
//            }
//        });
        idRecyclerview.addItemDecoration(new DividerGridItemDecoration(this));
    }

    private void initData() {

        mDatas = new ArrayList<String>();
        for (int i = 'A'; i < 'z'; i++)
        {
            mDatas.add("" + (char) i);
        }
    }



}
