package com.example.influentialpeople;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPeople;
    private Button btnShareInfo;
    private Button btnDetailInfo;
    private ArrayList<PeopleModel> listTeam = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShareInfo = findViewById(R.id.shareinfo);
        btnDetailInfo = findViewById(R.id.detailinfo);
       /* btnShareInfo.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent moveIntent = new Intent();
            moveIntent.setAction(Intent.ACTION_SEND);
            moveIntent.putExtra(Intent.EXTRA_TEXT, "Come study about History!");
            moveIntent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(moveIntent, null);
            startActivity(shareIntent);
        }
        });*/
        rvPeople = findViewById(R.id.ip_list);
        rvPeople.setHasFixedSize(true);
        listTeam.addAll(PeopleData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvPeople.setLayoutManager(new LinearLayoutManager(this));
        PeopleAdapter personAdapter = new PeopleAdapter(this);
        personAdapter.setPeopleModels(listTeam);
        rvPeople.setAdapter(personAdapter);
    }
}