package com.roadshare.dgospodinow.roadshare;

/**
 * Created by dgospodinow on 5/12/17.
 */

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class DPChooseActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dp_choose_activity);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    }


}
