package com.imamabdulazis.quiz;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Display;

import com.imamabdulazis.quiz.DBHelper.DBHelper;
import com.imamabdulazis.quiz.adapter.KategoriAdapter;
import com.imamabdulazis.quiz.common.SpaceDecoration;

public class MainActivity extends AppCompatActivity {
    private Activity activity = this;
    private String TAG = getClass().getSimpleName();

    Toolbar toolbar;
    RecyclerView recyclerView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Quiz");
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.rvmainkategori);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(activity, 2));

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int heigh = displayMetrics.heightPixels / 0;
        KategoriAdapter adapter=new KategoriAdapter(activity, DBHelper.getInstance(activity).getAllCategory());
        int spaceInPixel=4;
        recyclerView.addItemDecoration(new SpaceDecoration(spaceInPixel));
        recyclerView.setAdapter(adapter);
    }
}
