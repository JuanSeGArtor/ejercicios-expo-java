package com.example.pestanas;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        // Pestaña 1
        TabHost.TabSpec tab1 = tabHost.newTabSpec("Tab 1");
        tab1.setIndicator("Tab 1");
        tab1.setContent(R.id.tab1);

        // Pestaña 2
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Tab 2");
        tab2.setIndicator("Tab 2");
        tab2.setContent(R.id.tab2);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);

    }
}
