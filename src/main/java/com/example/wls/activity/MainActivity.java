package com.example.wls.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @InjectView(R.id.button_my)
    Button buttonMy;
    @InjectView(R.id.button2_other)
    Button button2Other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        Log.e("TAG","***********onCreate***********");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG","***********onStart***********");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG","***********onResume***********");
    }

    @OnClick({R.id.button_my, R.id.button2_other})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_my:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity.class);
                startActivity(intent);

                break;
            case R.id.button2_other:
                startActivity(new Intent(MainActivity.this,OtherActivity.class));
                break;
        }
    }
}
