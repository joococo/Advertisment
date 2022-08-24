package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private AdView MadView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });

        MadView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        MadView.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.FULL_BANNER); //광고 사이즈는 배너 사이즈로 설정
        adView.setAdUnitId("\n" + "ca-app-pub-3940256099942544/6300978111");
    }
}