package comulez.github.mvpplus.model;

import android.os.SystemClock;

import comulez.github.mvplibrary.listener.DataListener;
import comulez.github.mvpplus.ResultBean;


/**
 * Created by Ulez on 2017/8/9.
 * Email：lcy1532110757@gmail.com
 */


public class MainModelIml implements MainModel {
    String TAG = "MainModelIml";
    boolean b = false;

    @Override
    public void getResult(DataListener listener) {
        try {
            ResultBean result;
            b = !b;
            SystemClock.sleep(1000);
            if (b) {
                result = new ResultBean(10, "result", "net");
            } else {
                result = new ResultBean(10 / 0, "error", "cache");
            }
            listener.onResult(result);
            return;
        } catch (Exception e) {
            listener.onError(e);
            e.printStackTrace();
            return;
        }
    }
}
