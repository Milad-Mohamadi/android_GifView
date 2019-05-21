# android_GifView
Custom view for show any gif file

1-add .gif file to drawable

2-create LGIFView class

3-use LGIFView in XML file
 
    <com.example.lococoder.gifview.LGIFView
    android:id="@+id/img_defult"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_centerHorizontal="true"
    android:src="@drawable/loading"
    app:layout_constraintTop_toTopOf="parent"/>


    
4-MainActivity.java:

    img_defult = (LGIFView) findViewById(R.id.img_defult);
    img_defult.loadGIFResource(this, R.drawable.loading);
    


