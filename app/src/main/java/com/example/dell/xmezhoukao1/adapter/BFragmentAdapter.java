package com.example.dell.xmezhoukao1.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dell.xmezhoukao1.InfoBean;
import com.example.dell.xmezhoukao1.R;

import java.util.List;
import java.util.Random;

/**
 * Created by DELL on 2017/6/10.
 */

public class BFragmentAdapter extends RecyclerView.Adapter<BFragmentAdapter.BViewHolder> {

    private List<InfoBean> list;
    private Context context;

    public BFragmentAdapter(Context context,List<InfoBean> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public BViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.b_fragment_item,null);
        BViewHolder bViewHolder = new BViewHolder(view);
        return bViewHolder;
    }

    @Override
    public void onBindViewHolder(BViewHolder holder, int position) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) holder.b_item_text.getLayoutParams();
        Random random = new Random();
        params.height = random.nextInt(300);
        holder.b_item_text.setLayoutParams(params);

        if(position % 2 == 0){
            holder.b_item_text.setBackgroundColor(Color.GRAY);
        } else{
            holder.b_item_text.setBackgroundColor(Color.BLUE);
        }
        holder.b_item_text.setText(list.get(position).getTitle());

    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    class BViewHolder extends RecyclerView.ViewHolder{
        TextView b_item_text;
        ImageView b_item_image;
        public BViewHolder(View itemView) {
            super(itemView);
            b_item_text = (TextView) itemView.findViewById(R.id.b_item_text);
            b_item_image = (ImageView) itemView.findViewById(R.id.b_item_image);
        }
    }
}
