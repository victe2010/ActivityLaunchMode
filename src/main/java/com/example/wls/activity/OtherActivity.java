package com.example.wls.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class OtherActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Log.e("TAG","********OtherActivity***onCreate***********");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG","********OtherActivity***onStart***********");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG","********OtherActivity***onResume***********");
    }

    public void loadclick(View v){
        startActivity(new Intent(OtherActivity.this,MainActivity.class));
    }
}
