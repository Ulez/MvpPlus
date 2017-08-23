package comulez.github.mvplibrary.base;

import android.os.Handler;
import android.util.Log;

import java.lang.ref.WeakReference;

/**
 * Created by Ulez on 2017/8/9.
 * Email：lcy1532110757@gmail.com
 */


public abstract class BasePresenter<T> {
    private String TAG = "BasePresenter";
    protected WeakReference<T> mViewRef;
    protected Handler handler;

    public void attachView(T view) {
        Log.i(TAG, "attachView");
        mViewRef = new WeakReference(view);
    }

    public T getView() {
        return mViewRef.get();
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView() {
        Log.i(TAG, "detachView");
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
        if (handler != null)
            handler.removeCallbacksAndMessages(null);
    }
}
