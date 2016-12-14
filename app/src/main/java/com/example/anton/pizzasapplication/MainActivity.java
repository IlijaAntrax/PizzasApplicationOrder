package com.example.anton.pizzasapplication;

import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.anton.pizzasapplication.fragments.LoginFragment;
import com.example.anton.pizzasapplication.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static int CONTAINER_FRAGMENT_ID = R.id.fragment_menu_context;
    private FragmentTransaction m_fragmentTransaction;
    private FragmentManager m_fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        m_fragmentManager = getFragmentManager();
        showMenuFragment();
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
        getMenuInflater().inflate(R.menu.main, menu);
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

        if (id == R.id.navigation_profile) {
            showLoginFragment();
        } else if (id == R.id.navigation_menu) {
            showMenuFragment();
        } else if (id == R.id.navigation_orders) {

        } else if (id == R.id.navigation_extra) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void showMenuFragment() {
        MenuFragment menuFragment = new MenuFragment();

        m_fragmentTransaction = m_fragmentManager.beginTransaction();
        m_fragmentTransaction.replace(CONTAINER_FRAGMENT_ID,menuFragment);
        m_fragmentTransaction.commit();
    }
    public void showLoginFragment() {
        LoginFragment loginFragment = new LoginFragment();

        m_fragmentTransaction = m_fragmentManager.beginTransaction();
        m_fragmentTransaction.replace(CONTAINER_FRAGMENT_ID,loginFragment);
        m_fragmentTransaction.commit();
    }
}
