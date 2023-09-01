package com.example.recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recview.model.Item;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items;
    RecyclerView recyclerViewData;
    Adaptor adaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<Item>();
        recyclerViewData = findViewById(R.id.rvData);
        adaptor = new Adaptor(items);
        recyclerViewData.setAdapter(adaptor);

        loadData();

        recyclerViewData.addOnItemTouchListener(new Gesture(getApplicationContext(), recyclerViewData, new Gesture.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Toast.makeText(getApplicationContext(),items.get(position).getName(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(getApplicationContext(),items.get(position).getDescription(),Toast.LENGTH_SHORT).show();
            }
        })
        );





        recyclerViewData.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        //recyclerViewData.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.VERTICAL,false));




    }

    void loadData(){
        //country name and description

        /*items.add(new Item("India","India is a country in South Asia. It is the second-most populous country, the seventh-largest country by land area, and the most populous democracy in the world.",R.drawable.india));
        items.add(new Item("China","China, officially the People's Republic of China, is a country in East Asia. It is the world's most populous country, with a population of around 1.4 billion in 2019.",R.drawable.china));
        items.add(new Item("USA","The United States of America, commonly known as the United States or America, is a country mostly located in central North America, between Canada and Mexico.",R.drawable.usa));
        items.add(new Item("Japan","Japan is an island country in East Asia, located in the northwest Pacific Ocean. It is bordered on the west by the Sea of Japan, and extends from the Sea of Okhotsk in the north toward the East China Sea and Taiwan in the south.",R.drawable.japon));
        */

        items.add(new Item("India", "South Asian country, populous democracy.", R.drawable.india));
        items.add(new Item("China", "East Asian nation, most populous.", R.drawable.china));
        items.add(new Item("USA", "Central North American country.", R.drawable.usa));
        items.add(new Item("Japan", "Pacific island nation.", R.drawable.japon));

    }


}