package com.kshitiz.samachar24.util;

import android.content.Context;
import android.widget.Toast;


public class ToastMsg {

    public static void shortMsg(Context context, String msg) {
        Toast.makeText(context, "" + msg, Toast.LENGTH_SHORT).show();
    }

    public static void longMsg(Context context, String msg) {
        Toast.makeText(context, "" + msg, Toast.LENGTH_LONG).show();
    }
}

