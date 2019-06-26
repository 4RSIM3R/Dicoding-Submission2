package com.studio.suku.submission2;

import android.app.Service;
import android.content.Intent;
import android.provider.Settings;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.page);
        //Buat Adapeter Untuk ViewPager nya
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FilmFragment(), getString(R.string.titleTab1));
        adapter.AddFragment(new TvFragment(), getString(R.string.titleTab2));
        //Kita Set ke view pager nya
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.change){
            Intent pindah = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(pindah);
        }
        return super.onOptionsItemSelected(item);
    }
}
