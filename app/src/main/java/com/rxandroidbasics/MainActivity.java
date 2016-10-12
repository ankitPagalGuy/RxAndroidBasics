package com.rxandroidbasics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import rx.Observable;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {


  Observable.OnSubscribe observableAction = new Observable.OnSubscribe<String>() {
    @Override
    public void call(Subscriber<? super String> subscriber) {
      subscriber.onNext("Hello, World!");
      subscriber.onCompleted();
    }
  };

  
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


  }
}
