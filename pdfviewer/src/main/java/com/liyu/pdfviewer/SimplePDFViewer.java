package com.liyu.pdfviewer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.view.ContextThemeWrapper;

import java.lang.reflect.Method;

/**
 * Created by liyu on 2018/7/26.
 */
public class SimplePDFViewer {

    /**
     * 直接加载 PDF 文件，针对本地和允许跨域访问的情况
     *
     * @param context 上下文
     * @param pdfUrl  PDF 文件路径
     */
    public static void show(Context context, String pdfUrl) {
        Intent intent = new Intent(context, PdfViewerActivity.class);
        intent.putExtra("file", pdfUrl);
        context.startActivity(intent);
    }

    /**
     * 直接加载 PDF 文件，同时设置阅读器主题
     *
     * @param context    上下文
     * @param pdfUrl     PDF 文件路径
     * @param themeResId 主题资源 ID
     */
    public static void showWithTheme(Context context, String pdfUrl, int themeResId) {
        Intent intent = new Intent(context, PdfViewerActivity.class);
        intent.putExtra("file", pdfUrl);
        intent.putExtra("theme", themeResId);
        context.startActivity(intent);
    }

}
