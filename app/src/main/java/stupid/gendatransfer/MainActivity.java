package stupid.gendatransfer;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static final String tag = "main activity 主界面";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag, "on Create method start");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "on Create method done, begin wait for 5 second");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            Log.d(tag, "interrupted exception while proceed Thread.sleep");
        }
        Log.d(tag, "on Create method end");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "on start method start");
        Log.d(tag, "on start method done, begin wait for 5 second");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            Log.d(tag, "interrupted exception while proceed Thread.sleep");
        }
        Log.d(tag, "on start method end");
    }
}
