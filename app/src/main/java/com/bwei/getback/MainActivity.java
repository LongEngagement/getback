package com.bwei.getback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TitleView mTitleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitleBar = (TitleView) findViewById(R.id.title_bar);

        mTitleBar.setLeftButtonListener(new View.OnClickListener() {

                                 @Override
                         public void onClick(View v) {
                                 Toast.makeText(MainActivity.this, "点击了返回按钮", Toast.LENGTH_SHORT)
                                         .show();
                                 finish();
                            }
        });
    }
}
