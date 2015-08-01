package com.proy.jsdv.proylevelea.presentation;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.proy.jsdv.proylevelea.R;
import com.proy.jsdv.proylevelea.presentation.DisplayAdapter;

import org.w3c.dom.Text;


public class MainSwiperLevelea extends ActionBarActivity {
    ViewPager paper;
    PagerTabStrip tab_strp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_main);

        DisplayAdapter<DisplayAdapter> dpaper = new DisplayAdapter<DisplayAdapter>(getSupportFragmentManager());
        paper = (ViewPager)findViewById(R.id.pager);

        paper.setAdapter(dpaper);
        tab_strp = (PagerTabStrip)findViewById(R.id.tab_strip);
        tab_strp.setTextColor(Color.WHITE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        // if (id == R.id.reload_page) {
        //     return true;
        // }
        return false;
        // return super.onOptionsItemSelected(item);
    }
}
