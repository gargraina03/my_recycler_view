package com.example.android.my_recycler_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView faqRecyclerView;
    private FAQAdapter adapter;
    private ArrayList<FAQ> faqList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        faqRecyclerView = (RecyclerView) findViewById(R.id.faq_recycler_view);

        faqList.add(new FAQ("What's a Hack?", "Its the deal", R.drawable.ic_card_giftcard_white_48dp, R.drawable.ic_card_membership_white_48dp));
        faqList.add(new FAQ("What's a Heck?", "Its the deal", R.drawable.ic_card_giftcard_white_48dp, R.drawable.ic_card_membership_white_48dp));
        faqList.add(new FAQ("What's a Hick?", "Its the deal", R.drawable.ic_card_giftcard_white_48dp, R.drawable.ic_card_membership_white_48dp));
        faqList.add(new FAQ("What's a Hock?", "Its the deal", R.drawable.ic_card_giftcard_white_48dp, R.drawable.ic_card_membership_white_48dp));
        faqList.add(new FAQ("What's a Huck?", "Its the deal", R.drawable.ic_card_giftcard_white_48dp, R.drawable.ic_card_membership_white_48dp));
        faqList.add(new FAQ("What's a Hulk?", "Its the green guy", R.drawable.ic_card_giftcard_white_48dp, R.drawable.ic_card_membership_white_48dp));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        faqRecyclerView.setLayoutManager(layoutManager);
        faqRecyclerView.setHasFixedSize(true);

        adapter = new FAQAdapter(this, faqList);
        faqRecyclerView.setAdapter(adapter);

    }
}
