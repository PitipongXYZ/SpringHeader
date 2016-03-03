package com.loopeer.springheader.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.loopeer.springheader.RefreshHeader;
import com.loopeer.springheader.SimpleRefreshHeader;

public class SpringHeaderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_header);

        final SimpleRefreshHeader header = (SimpleRefreshHeader) findViewById(R.id.header);
        header.setOnRefreshListener(new RefreshHeader.OnRefreshListener() {
            @Override
            public void onRefresh() {
                header.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        header.setRefreshing(false);
                    }
                }, 2000);
            }
        });
    }
}
