package com.liyu.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.File;

public class PdfViewerActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int theme = getIntent().getIntExtra("theme", 0);

        if (theme != 0) {
            setTheme(theme);
        }
        
        setContentView(R.layout.activity_pdf_viewer);

        String file = getIntent().getStringExtra("file");

        if (TextUtils.isEmpty(file)) {
            this.finish();
            return;
        }

        Toolbar toolbar = findViewById(R.id.toolbar);

        if (getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        } else {
            toolbar.setVisibility(View.GONE);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle(parseSuffix(file));

        webView = findViewById(R.id.web_view);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);

        webView.loadUrl("file:///android_asset/web/viewer.html?file=" + file);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private String parseSuffix(String url) {
        if (TextUtils.isEmpty(url)) {
            return url;
        }

        int filePosi = url.lastIndexOf(File.separator);
        return (filePosi == -1) ? url : url.substring(filePosi + 1);
    }
}
