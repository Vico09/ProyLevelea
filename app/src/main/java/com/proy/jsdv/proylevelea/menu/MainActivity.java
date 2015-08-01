package com.proy.jsdv.proylevelea.menu;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.proy.jsdv.proylevelea.R;
import com.proy.jsdv.proylevelea.menu.Main_Feedback;
import com.proy.jsdv.proylevelea.menu.Main_Log_out;
import com.proy.jsdv.proylevelea.menu.Main_Message;
import com.proy.jsdv.proylevelea.menu.Main_Oportunity;
import com.proy.jsdv.proylevelea.menu.Main_Perfil;
import com.proy.jsdv.proylevelea.menu.Main_Search;
import com.proy.jsdv.proylevelea.menu.Main_Settings;
import com.proy.jsdv.proylevelea.presentation.DisplayAdapter;

public class MainActivity extends AppCompatActivity {
    /**
     * Instancia del drawer
     */
    private DrawerLayout drawerLayout;

    /**
     * Titulo inicial del drawer
     */
    private String drawerTitle;


    /**
     *
     * Para el swiper view
     */
    ViewPager paper;
    PagerTabStrip tab_strp;


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        /**
         * Llamar a los tabs
         */

        DisplayAdapter<DisplayAdapter> dpaper = new DisplayAdapter<DisplayAdapter>(getSupportFragmentManager());
         paper = (ViewPager)findViewById(R.id.pager);

         paper.setAdapter(dpaper);
         tab_strp = (PagerTabStrip)findViewById(R.id.tab_strip);
         tab_strp.setTextColor(Color.WHITE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        setToolbar(); // Setear Toolbar como action bar

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

        drawerTitle = getResources().getString(R.string.Perfil_item);
        if (savedInstanceState == null) {
            selectItem2(drawerTitle);
        }

    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            // Poner ícono del drawer toggle
            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // Marcar item presionado
                        menuItem.setChecked(true);
                        // Crear nuevo fragmento
                        String title = menuItem.getTitle().toString();
                        selectItem2(title);
                        return true;
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*private void selectItem(String title) {
        // Enviar título como arguemento del fragmento
        Bundle args = new Bundle();
        args.putString(PlaceholderFragment.ARG_SECTION_TITLE, title);

        Fragment fragment = PlaceholderFragment.newInstance(title);
        fragment.setArguments(args);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .replace(R.id.main_content, fragment)
                .commit();

        drawerLayout.closeDrawers(); // Cerrar drawer

        setTitle(title); // Setear título actual

    }*/

    private void selectItem2(String Item) {
        if (Item.equals("Perfil")) {
            Bundle args = new Bundle();
            args.putString(Main_Perfil.ARG_SECTION_TITLE, Item);

            Fragment fragment = Main_Perfil.newInstance(Item);
            fragment.setArguments(args);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.main_content, fragment)
                    .commit();
            drawerLayout.closeDrawers(); // Cerrar drawer
            setTitle(Item); // Setear título actual
        } else if (Item.equals("Setting")) {
            Bundle args = new Bundle();
            args.putString(Main_Settings.ARG_SECTION_TITLE, Item);

            Fragment fragment = Main_Settings.newInstance(Item);
            fragment.setArguments(args);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.main_content, fragment)
                    .commit();
            drawerLayout.closeDrawers(); // Cerrar drawer
            setTitle(Item); // Setear título actual
        }else if (Item.equals("Feedback")) {
            Bundle args = new Bundle();
            args.putString(Main_Feedback.ARG_SECTION_TITLE, Item);

            Fragment fragment = Main_Feedback.newInstance(Item);
            fragment.setArguments(args);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.main_content, fragment)
                    .commit();
            drawerLayout.closeDrawers(); // Cerrar drawer
            setTitle(Item); // Setear título actual
        }else if (Item.equals("Log_out")) {
            Bundle args = new Bundle();
            args.putString(Main_Log_out.ARG_SECTION_TITLE, Item);

            Fragment fragment = Main_Log_out.newInstance(Item);
            fragment.setArguments(args);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.main_content, fragment)
                    .commit();
            drawerLayout.closeDrawers(); // Cerrar drawer
            setTitle(Item); // Setear título actual
        }
        else if (Item.equals("Message")) {
            Bundle args = new Bundle();
            args.putString(Main_Message.ARG_SECTION_TITLE, Item);

            Fragment fragment = Main_Message.newInstance(Item);
            fragment.setArguments(args);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.main_content, fragment)
                    .commit();
            drawerLayout.closeDrawers(); // Cerrar drawer
            setTitle(Item); // Setear título actual
        }else if (Item.equals("Opportunity")) {
            Bundle args = new Bundle();
            args.putString(Main_Oportunity.ARG_SECTION_TITLE, Item);

            Fragment fragment = Main_Oportunity.newInstance(Item);
            fragment.setArguments(args);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.main_content, fragment)
                    .commit();
            drawerLayout.closeDrawers(); // Cerrar drawer
            setTitle(Item); // Setear título actual
        }else if (Item.equals("Search")) {
            Bundle args = new Bundle();
            args.putString(Main_Search.ARG_SECTION_TITLE, Item);

            Fragment fragment = Main_Search.newInstance(Item);
            fragment.setArguments(args);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.main_content, fragment)
                    .commit();
            drawerLayout.closeDrawers(); // Cerrar drawer
            setTitle(Item); // Setear título actual
        }
    }
}
