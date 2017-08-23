package comulez.github.mvpplus.presenter;

import android.os.Handler;
import android.os.Looper;

import comulez.github.mvplibrary.base.BasePresenter;
import comulez.github.mvplibrary.listener.DataListener;
import comulez.github.mvpplus.ResultBean;
import comulez.github.mvpplus.model.MainModel;
import comulez.github.mvpplus.model.MainModelIml;
import comulez.github.mvpplus.view.MainView;

/**
 * Created by Ulez on 2017/8/9.
 * Email：lcy1532110757@gmail.com
 */


public class MainPresenter extends BasePresenter<MainView> {
    private MainModel mainModelIml;
    private String TAG = "MainPresenter";


    public MainPresenter() {
        mainModelIml = new MainModelIml();
    }

    public void getResult() {
        getView().showLoading();
        handler = new Handler(Looper.getMainLooper());
        new Thread(new Runnable() {
            @Override
            public void run() {
                mainModelIml.getResult(new DataListener<ResultBean>() {
                    @Override
                    public void onResult(ResultBean result) {
                        doInMain(result);
                    }

                    @Override
                    public void onError(Throwable e) {
                        doInMainError(e.getClass().getName() + ":" + e.getMessage());
                    }
                });
            }
        }).start();
    }

    private void doInMainError(final String error) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                getView().onError(error);
            }
        });
    }

    private void doInMain(final ResultBean result) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                getView().showResult(result);
            }
        });
    }
}
