package com.liyu.pdfviewer;

import android.content.Context;
import android.content.Intent;

/**
 * Created by liyu on 2018/7/26.
 */
public class SimplePDFViewer {

    /**
     * 直接加载 PDF 文件，针对本地和允许跨域访问的情况
     *
     * @param context
     * @param pdfUrl
     */
    public static void show(Context context, String pdfUrl) {
        Intent intent = new Intent(context, PdfViewerActivity.class);
        intent.putExtra("file", pdfUrl);
        context.startActivity(intent);
    }

}
