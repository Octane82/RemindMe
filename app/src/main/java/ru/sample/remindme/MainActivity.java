package ru.sample.remindme;


import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;       // !!!!!!!!!!!!
import android.view.MenuItem;


//import android.support.v7.app.ActionBarActivity;


/**
 * Created by ITS on 04.06.2015.
 * http://habrahabr.ru/post/259429/
 *
 * http://www.youtube.com/channel/UCORRUYUmW1pffMgLPzU0XCA  -   devColibri youTube
 * https://github.com/google/material-design-icons
 */
public class MainActivity extends Activity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
    }

    // Initiate toolbar
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void initToolbar(){
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        toolbar.inflateMenu(R.menu.menu);
    }


}
