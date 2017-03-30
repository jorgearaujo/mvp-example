package com.araujo.mvp.example.main.presenter;

import com.araujo.mvp.BasePresenter;
import com.araujo.mvp.example.main.view.IMainView;

/**
 * Created by jorge.araujo on 1/2/2016.
 */
public class MainPresenter extends BasePresenter<IMainView> implements IMainPresenter {

	@Override
	public void onResume() {
		getView().setHelloWorldText("Hola mundo!");
	}

}
