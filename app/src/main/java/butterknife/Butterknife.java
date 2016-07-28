package butterknife;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import java.io.File;
import java.lang.reflect.Field;

import butterknife.annotation.BindView;

/**
 * @Author linyong
 * @Date 2016/7/28
 * @Time 10:42
 * <p>
 * 1 . 遍历出来
 * 2 . 赋值
 */
public class Butterknife {
    /**
     * 绑定
     *
     * @param obj
     */
    public static void bind(Object obj) {
        Class clazz = obj.getClass();
        Field[] files = clazz.getDeclaredFields();
        for (Field field : files) {
            if (field.isAnnotationPresent(BindView.class)) {
                BindView bindView = field.getAnnotation(BindView.class);
                if (obj instanceof Activity) {
                    Activity activity = (Activity) obj;
                    int id = bindView.id();
                    Object view = activity.findViewById(id);
                    field.setAccessible(true);
                    try {
                        field.set(obj,view);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * @param obj
     * @param view
     */
    public static void bind(Object obj, View view) {

    }

}
