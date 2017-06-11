package com.example.dell.xmezhoukao1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.dell.xmezhoukao1.AFragment;
import com.example.dell.xmezhoukao1.InfoBean;
import com.example.dell.xmezhoukao1.R;

import java.util.List;

/**
 * Created by DELL on 2017/6/10.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<InfoBean> list;
    private LayoutInflater inflater;
    private OnItemClickListener listener;

    public MyAdapter(Context context,List<InfoBean> list){
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item,null);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.item_title.setText(list.get(position).getTitle());
        holder.item_data.setText(list.get(position).getData());
        holder.item_title.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                listener.onItemClickListener(v,position);
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }




    class ViewHolder extends RecyclerView.ViewHolder{

        TextView item_title;
        TextView item_data;
        public ViewHolder(View itemView) {
            super(itemView);

            item_title = (TextView) itemView.findViewById(R.id.item_title);
            item_data = (TextView) itemView.findViewById(R.id.item_data);

        }
    }

    public interface OnItemClickListener{
        void onItemClickListener(View view,int position);
        void onItemLongClickListener(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener ;
    }
}
