package com.araujo.mvp.example;

import com.araujo.mvp.OneFragmentActivity;
import com.araujo.mvp.example.main.view.IMainView;
import com.araujo.mvp.example.main.view.MainFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

	@Inject IMainView mainFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		OneFragmentActivity.startActivity(this, mainFragment.getClass());
		finish();
	}
}
