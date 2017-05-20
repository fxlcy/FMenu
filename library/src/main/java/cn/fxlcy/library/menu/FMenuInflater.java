package cn.fxlcy.library.menu;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.support.annotation.MenuRes;
import android.support.annotation.XmlRes;

/**
 * Created by fxlcy on 2017/5/20.
 */

public class FMenuInflater {
    private Context mContext;

    public static FMenuInflater from(Context context) {
        FMenuInflater inflater = new FMenuInflater();
        inflater.mContext = context;

        return inflater;
    }

    public FMenuBase inflater(@XmlRes int menuRes) {
        XmlResourceParser parser = mContext.getResources().getXml(menuRes);

        return null;
    }
}
