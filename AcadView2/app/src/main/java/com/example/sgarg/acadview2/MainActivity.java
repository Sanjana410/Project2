package com.example.sgarg.acadview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mylist = (ListView)findViewById(R.id.listview);
        final ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=1;i<=15;i++)
        {
            num.add(i);
        }
        ArrayAdapter<Integer> adapt = new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,num);
        mylist.setAdapter(adapt);
        mylist.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Log.i("Clicked",String.valueOf(i));
                if(i==14)
                {
                    Intent indent = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(indent);

                }
                else if(i==1)
                {
                    Intent in = new Intent(getApplicationContext(),Main3Activity.class);
                    startActivity(in);

                }
                else
                {
                    Toast.makeText(getBaseContext(),"HELLO",Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
