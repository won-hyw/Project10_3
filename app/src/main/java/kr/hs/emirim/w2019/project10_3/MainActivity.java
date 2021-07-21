package kr.hs.emirim.w2019.project10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Activity Life Cycle : ", "onCreate() 호출");

        Button btnCall = findViewById(R.id.btn_call);
        Button btnFinish = findViewById(R.id.btn_finish);

        btnCall.setOnClickListener(btnListener);
        btnFinish.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_call:
                    Uri uri = Uri.parse("tel:01033355557");
                    Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                    startActivity(intent);
                    break;
                case R.id.btn_finish:
                    finish();
                    break;
            }
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity Life Cycle : ", "onDestroy() 호출");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity Life Cycle : ", "onRestart() 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity Life Cycle : ", "onResume() 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity Life Cycle : ", "onPause() 호출");
    }
}