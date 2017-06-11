package com.example.dell.xmezhoukao1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.xmezhoukao1.adapter.BFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/6/10.
 */

public class BFragment extends Fragment {
    private List<InfoBean> list = new ArrayList<InfoBean>();
    private RecyclerView b_recy;
    private BFragmentAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bfragment,null);

        for (int i = 0;i<20;i++){
            InfoBean infoBean = new InfoBean();
            infoBean.setTitle("标题"+i);
            list.add(infoBean);
        }

        b_recy = (RecyclerView) view.findViewById(R.id.b_recy);



        adapter = new BFragmentAdapter(getContext(),list);
        b_recy.setAdapter(adapter);

        GridLayoutManager manager = new GridLayoutManager(getContext(),2);
        b_recy.setLayoutManager(manager);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        b_recy.setLayoutManager(staggeredGridLayoutManager);
        return view;

    }
}
