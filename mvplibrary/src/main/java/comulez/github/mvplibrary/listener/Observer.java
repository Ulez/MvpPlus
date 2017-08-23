package comulez.github.mvplibrary.listener;

/**
 * Created by Ulez on 2017/8/9.
 * Email：lcy1532110757@gmail.com
 */


public interface Observer<T> {
    void onCompleted();

    void onError(Throwable e);

    void onNext(T t);
}
