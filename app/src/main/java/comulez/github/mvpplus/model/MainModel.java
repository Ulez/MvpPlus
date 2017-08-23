package comulez.github.mvpplus.model;


import comulez.github.mvplibrary.listener.DataListener;

/**
 * Created by Ulez on 2017/8/9.
 * Email：lcy1532110757@gmail.com
 */


public interface MainModel<T> {
    void getResult(DataListener listener);
}
