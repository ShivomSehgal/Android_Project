package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DataStructures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

        ArrayList<DsaSubclass> dsaList = new ArrayList<DsaSubclass>();

        dsaList.add(new DsaSubclass("Dynamic Programming", "Advanced", "4/60"));
        dsaList.add(new DsaSubclass("Binary Tree", "Advanced", "5/35"));
        dsaList.add(new DsaSubclass("Linked List", "Advanced", "0/36"));
        dsaList.add(new DsaSubclass("Graph", "Intermediate", "0/44"));
        dsaList.add(new DsaSubclass("Array", "Advanced", "1/36"));
        dsaList.add(new DsaSubclass("String", "Intermediate", "0/43"));
        dsaList.add(new DsaSubclass("Stacks and Queues", "Intermediate", "2/38"));
        dsaList.add(new DsaSubclass("Searching and Sorting", "Intermediate", "0/36"));
        dsaList.add(new DsaSubclass("Heap", "Beginner", "0/18"));
        dsaList.add(new DsaSubclass("Bit manipulation", "Beginner","0/10"));
        dsaList.add(new DsaSubclass("Trie", "Beginner","0/6"));
        dsaList.add(new DsaSubclass("Backtracking", "Intermediate","1/19"));
        dsaList.add(new DsaSubclass("Greedy", "Beginner","0/35"));
        dsaList.add(new DsaSubclass("Binary Search Tree", "Intermediate","0/22"));
        dsaList.add(new DsaSubclass("Matrix", "Beginner","0/10"));

        ListView lv = (ListView)findViewById(R.id.listDsa);

        DsaAdapter nameAdapter = new DsaAdapter(this, dsaList);

        lv.setAdapter(nameAdapter);

    }
}