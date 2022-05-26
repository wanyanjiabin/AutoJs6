package com.stardust.util;

import androidx.annotation.NonNull;

/**
 * Created by SuperMonster003 on May 4, 2022.
 * Mainly for JavaScript modules.
 */
public class JavaUtils {

    @NonNull
    public static Class<?> getClass(@NonNull Class<?> Clazz) {
        return Clazz;
    }

    @NonNull
    public static Class<?> getClass(@NonNull Object o) {
        return o.getClass();
    }

    @NonNull
    public static String getClassName(@NonNull Class<?> Clazz) {
        return Clazz.getName();
    }

    @NonNull
    public static String getClassName(@NonNull Object o) {
        return o.getClass().getName();
    }

}
