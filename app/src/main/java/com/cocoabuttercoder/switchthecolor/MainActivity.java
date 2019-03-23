package com.cocoabuttercoder.switchthecolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchTheColor(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        String hexCode = editText.getText().toString();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        relativeLayout.setBackgroundColor(Color.rgb(Integer.parseInt(hexCode.substring(0, 2), 16), Integer.parseInt(hexCode.substring(2, 4), 16), Integer.parseInt(hexCode.substring(4), 16)));

    }
}
