package com.example.student.e20180113a;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //82552225
    }

    public void click1(View v){
        Uri uri = Uri.parse ("http://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
        //顯示網頁
    }

    public void click2(View v){
        Uri uri = Uri.parse ("tel://0922702312");
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);
        //顯示撥號介面
    }

    public void click3(View v){
        Uri uri = Uri.parse ("geo:0.0?q=松山機場");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
        //顯示地圖
    }

    public void click4(View v){

        Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(it);
        //啟動相機
    }

    public void click5(View v){

        Intent it = new Intent(Intent.ACTION_SEND);
        //"text/plain"-->純文字
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT,"");
        startActivity(it);
        //傳送文字
    }

}
