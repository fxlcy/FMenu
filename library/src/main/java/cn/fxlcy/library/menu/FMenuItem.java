package cn.fxlcy.library.menu;

import android.content.res.ColorStateList;
import android.support.annotation.DrawableRes;
import android.widget.TextView;

/**
 * Created by fxlcy on 2017/5/20.
 */

final class FMenuItem {
    @DrawableRes
    int background = -1;
    @DrawableRes
    int icon = -1;
    ColorStateList textColor;
    int textSize = -1;
    String text;
}
