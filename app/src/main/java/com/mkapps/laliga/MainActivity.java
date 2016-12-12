package com.mkapps.laliga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lV = (ListView) findViewById(R.id.listView);
        LayoutInflater myInflater = getLayoutInflater();
        View myView = myInflater.inflate(R.layout.list_view,(ViewGroup)findViewById(R.id.clubViews));
    }
    public class customAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }

        ArrayList<Clubs> clubses = new ArrayList<Clubs>();

    }

}
