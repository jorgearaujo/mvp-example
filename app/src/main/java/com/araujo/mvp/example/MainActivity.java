package com.araujo.mvp.example;

import com.araujo.mvp.OneFragmentActivity;
import com.araujo.mvp.example.main.view.MainFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		OneFragmentActivity.startActivity(this, MainFragment.class);
		finish();
	}
}
