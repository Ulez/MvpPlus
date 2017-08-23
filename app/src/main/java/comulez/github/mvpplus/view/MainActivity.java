package comulez.github.mvpplus.view;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import comulez.github.mvplibrary.base.MvpBaseActivity;
import comulez.github.mvpplus.R;
import comulez.github.mvpplus.ResultBean;
import comulez.github.mvpplus.presenter.MainPresenter;

public class MainActivity extends MvpBaseActivity<MainView, MainPresenter> implements MainView, View.OnClickListener {

    public TextView tvMsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMsg = (TextView) findViewById(R.id.tv);
        tvMsg.setOnClickListener(this);
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void showResult(ResultBean result) {
        tvMsg.setText(result.toString());
    }

    @Override
    public void showLoading() {
        tvMsg.setText("loading...");
    }

    @Override
    public void onError(String msg) {
        tvMsg.setText(msg);
    }

    @Override
    public void onClick(View v) {
        mPresenter.getResult();
    }
}
