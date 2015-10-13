package com.lanou3g.tablayout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by dllo on 15/9/24.
 */
public class MainActivity1 extends Activity {
    private Button button;
    private int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sssss);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i -1;
                Log.e("sss",i +"");
            }
        });
    }
}
