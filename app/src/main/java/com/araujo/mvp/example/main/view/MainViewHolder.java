package com.araujo.mvp.example.main.view;

import com.araujo.mvp.BaseViewHolder;
import com.araujo.mvp.example.R;

import android.view.View;
import android.widget.TextView;

/**
 * Created by jorge.araujo on 1/1/2016.
 */
public class MainViewHolder implements BaseViewHolder {

	public TextView helloWorldText;

	@Override
	public int getLayout() {
		return R.layout.activity_main;
	}

	@Override
	public void generateViews(View view) {
		helloWorldText = (TextView) view.findViewById(R.id.hello_world);
	}
}
