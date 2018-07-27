package com.liyu.simplepdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.liyu.pdfviewer.SimplePDFViewer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){
        String file = "http://api.caoliyu.cn/AndroidTips.pdf";
        SimplePDFViewer.show(this, file);
    }

}
