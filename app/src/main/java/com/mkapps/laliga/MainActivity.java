package com.mkapps.laliga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Clubs> clubs = new ArrayList<Clubs>();


        customAdapter adapter = new customAdapter(clubs);

        ListView listView = (ListView) findViewById(R.id.clubListView);
    }
    public class customAdapter extends BaseAdapter {
        ArrayList<Clubs> clubs = new ArrayList<Clubs>();
        customAdapter(ArrayList<Clubs> clubs){
            this.clubs = clubs;
        }
        @Override
        public int getCount() {

            return clubs.size();
        }

        @Override
        public Object getItem(int i) {

            return clubs.get(i);
        }

        @Override
        public long getItemId(int i) {

            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
        LayoutInflater myInflater = getLayoutInflater();
        View myView = myInflater.inflate(R.layout.list_view,null);
        TextView textName = (TextView) myView.findViewById(R.id.clubName);
        TextView textPosition = (TextView) myView.findViewById(R.id.clubPostion);
        TextView textPoints = (TextView) myView.findViewById(R.id.clubPoints);
        ImageView imageEmblem = (ImageView) myView.findViewById(R.id.clubEmblem);

        Clubs temp = clubs.get(i);

        textName.setText(temp.name);
        textPosition.setText(temp.position);
        textPoints.setText(temp.points);
        imageEmblem.setImageResource(temp.emblem);

    }

}
