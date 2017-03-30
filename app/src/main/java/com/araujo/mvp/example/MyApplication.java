package com.araujo.mvp.example;

import com.araujo.lightinject.di.BindingConfiguration;
import com.araujo.mvp.example.main.presenter.IMainPresenter;
import com.araujo.mvp.example.main.presenter.MainPresenter;
import com.araujo.mvp.example.main.view.IMainView;
import com.araujo.mvp.example.main.view.Main2Fragment;
import com.araujo.mvp.example.main.view.MainFragment;

import android.app.Application;

/**
 * Created by jorge.araujo on 3/30/2017.
 */

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		new BindingConfiguration() {
			@Override
			public void configure() {
				from(IMainView.class).to(MainFragment.class).add();
				//from(IMainView.class).to(Main2Fragment.class).add();
				from(IMainPresenter.class).to(MainPresenter.class).add();
			}
		}.configure();
	}
}
