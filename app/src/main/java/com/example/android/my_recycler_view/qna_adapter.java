package com.example.android.my_recycler_view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.media.CamcorderProfile.get;

/**
 * Created by Raina on 17-10-2017.
 */

public class qna_adapter {

    private Context mContext;
    private List<qna> qnaList;

    @Override
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView qText,aText;
        public ImageView aIcon,qIcon;

        public MyViewHolder(View view) {
            super(view);
            qText = (TextView) view.findViewById(R.id.questionText);
            aText = (TextView) view.findViewById(R.id.answerText);
            aIcon = (ImageView) view.findViewById(R.id.ansIcon);
            qIcon = (ImageView) view.findViewById(R.id.quesIcon);
        }
    }


    public qna_adapter(Context mContext, List<qna> albumList) {
        this.mContext = mContext;
        this.qnaList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.qna_card_front, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.qna_card_back, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        qna qnaobj = qnaList.get(position);
        holder.qText.setText(qna.getQuestion());
        holder.aText.setText(qna.getAnswer());

    }

}
