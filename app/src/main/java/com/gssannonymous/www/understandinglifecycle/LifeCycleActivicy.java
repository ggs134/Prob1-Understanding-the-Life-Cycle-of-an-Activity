package com.gssannonymous.www.understandinglifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class LifeCycleActivicy extends Activity {

    String tag="LifeCycle";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_activicy);
        Log.d(tag, "onCreate 이벤트 발생시");
    }
    public void onStart() {
        super.onStart();
        Log.d(tag, "onStart 발생 시");
    }
    public void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart 발생 시");
    }
    public void onResume(){
        super.onResume();
        Log.d(tag, "onResume 발생 시");
    }
    public void onPause(){
        super.onPause();
        Log.d(tag,"onPause 발생 시");
    }
    public void onStop(){
        super.onStop();
        Log.d(tag,"onStop 발생 시");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.d(tag,"onDestroy 발생 시");
    }


}
