package com.shachengxxx.jenkinsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.shachengxxx.jenkinsdemo.tools.MetaUtils;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.text);
        Log.i("test",this.getPackageName());
        Log.i("test", MetaUtils.getMetaValue(this,"GOOGLE_SERVER_CLIENT_ID"));
        textView.setText(MetaUtils.getMetaValue(this,"APP_ID")+"");
    }
}
