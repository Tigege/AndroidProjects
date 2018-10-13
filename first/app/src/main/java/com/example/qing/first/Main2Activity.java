package com.example.qing.first;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends Activity {
    private String[] data={"apple","Banna","orange","watermelo","pear","apple","Banna","orange","watermelo","pear"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_list_item_1,data);

        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

}
