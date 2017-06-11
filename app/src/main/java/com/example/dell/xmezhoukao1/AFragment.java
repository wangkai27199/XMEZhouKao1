package com.example.dell.xmezhoukao1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.xmezhoukao1.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/6/10.
 */

public class AFragment extends Fragment implements MyAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private List<InfoBean> list = new ArrayList<InfoBean>();
    private LinearLayoutManager manager;
    private MyAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.afragment,null);

        for (int i = 0;i<20;i++){
            InfoBean infoBean = new InfoBean();
            infoBean.setTitle("新闻标题"+i);
            infoBean.setData("123456789"+i);
            list.add(infoBean);
        }
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_id);

        manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        adapter = new MyAdapter(getContext(),list);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClickListener(View view, int position) {
        Intent intent = new Intent(getActivity(),SecondActivity.class);
        intent.putExtra("title",list.get(position).getTitle());
        intent.putExtra("data",list.get(position).getData());
        startActivity(intent);
    }

    @Override
    public void onItemLongClickListener(View view, int position) {

    }
}
