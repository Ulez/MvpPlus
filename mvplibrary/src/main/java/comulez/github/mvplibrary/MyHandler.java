package comulez.github.mvplibrary;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

/**
 * Created by Ulez on 2017/8/9.
 * Email：lcy1532110757@gmail.com
 */


public abstract class MyHandler<T extends Context> extends Handler {
    private WeakReference<T> reference;

    public MyHandler(T context) {
        reference = new WeakReference<>(context);
    }

    @Override
    public void handleMessage(Message msg) {
        T activity = reference.get();
        if (activity != null) {
            handleMessage(activity, msg);
        }
    }

    public abstract void handleMessage(T activity, Message msg);
}
