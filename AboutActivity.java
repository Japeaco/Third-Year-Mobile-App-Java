package com.example.admin.easyeats;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    MainActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_favourites) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    FavouritesActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_all) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    AllActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_category) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    CategoryActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_search) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    SearchActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_breakfast) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    BreakfastActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_lunch) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    LunchActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_dinner) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    DinnerActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_dessert) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    DessertActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_vegetarian) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    VegetarianActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_about) {
            // Start NewActivity.class
            Intent myIntent = new Intent(AboutActivity.this,
                    AboutActivity.class);
            startActivity(myIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
