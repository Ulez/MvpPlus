package comulez.github.mvpplus.view;

import comulez.github.mvpplus.ResultBean;

/**
 * Created by Ulez on 2017/8/9.
 * Email：lcy1532110757@gmail.com
 */


public interface MainView {

    void showResult(ResultBean result);

    void showLoading();

    void onError(String msg);

}
