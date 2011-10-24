package com.tailoredapps.fastscroll;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FastScrollActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.addHeaderView(getLayoutInflater().inflate(R.layout.view,null), null, false);
        
        List<String> items = new ArrayList<String>();
        for(int i = 0; i < 100; i++) {
        	items.add("Item " + i);
        }
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, items.toArray(new String[0])));
        
    }
    
    
}