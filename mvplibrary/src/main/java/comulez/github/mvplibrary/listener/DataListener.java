package comulez.github.mvplibrary.listener;

/**
 * Created by Ulez on 2017/8/9.
 * Email：lcy1532110757@gmail.com
 */


public interface DataListener<T> {
    void onResult(T result);

    void onError(Throwable e);
}
