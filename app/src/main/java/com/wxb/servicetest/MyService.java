package com.wxb.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    private DownloadBinder mBinder=new DownloadBinder();
    class DownloadBinder  extends Binder{
        public  void startDownload(){
            Toast.makeText(MyService.this,"开始下载",Toast.LENGTH_SHORT).show();
        }

        public int getProgress(){
            Toast.makeText(MyService.this,"正在下载......",Toast.LENGTH_SHORT).show();
            return 0;
        }


    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"onCreated",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Toast.makeText(this,"onStartCommnd",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
    }
}
