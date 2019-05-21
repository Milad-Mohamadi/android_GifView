package com.example.lococoder.gifview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  LGIFView img_defult;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    img_defult = (LGIFView) findViewById(R.id.img_defult);
    img_defult.loadGIFResource(this, R.drawable.loading);

  }
}
