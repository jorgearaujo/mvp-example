package com.araujo.mvp.example.main.view;

import com.araujo.mvp.BaseFragment;
import com.araujo.mvp.example.main.presenter.IMainPresenter;

/**
 * Created by jorge.araujo on 1/1/2016.
 */
public class Main2Fragment extends BaseFragment<Main2ViewHolder, IMainPresenter> implements IMainView {

    @Override
    public void setHelloWorldText(String text) {
        getViewHolder().helloWorldText.setText(text);
    }

}
