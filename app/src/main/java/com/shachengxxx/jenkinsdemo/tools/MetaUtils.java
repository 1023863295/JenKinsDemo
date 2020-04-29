package com.shachengxxx.jenkinsdemo.tools;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * Author:liul1
 * Date:2020/4/29
 */
public class MetaUtils {
    public static String getMetaValue(Context context,String keyName) {
        String keyValue = "";
        ApplicationInfo appInfo;
        try {
            appInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            keyValue = appInfo.metaData.getString(keyName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return keyValue;
    }
}
