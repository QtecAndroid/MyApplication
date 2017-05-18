package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by shaojun on 17-5-18.
 */

public class ToastUtils {

    /**
     * 显示Toast
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
