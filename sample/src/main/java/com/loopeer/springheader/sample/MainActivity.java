package com.loopeer.springheader.sample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    public static final String[] LABELS = new String[]{
            "SpringHeader",
            "Ptr",
            "Srl"
    };
    public static final Class<?>[] CLASSES = new Class[]{
            SpringHeaderActivity.class,
            PtrActivity.class,
            SrlActivity.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, LABELS));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        startActivity(new Intent(this, CLASSES[position]));
    }
}
