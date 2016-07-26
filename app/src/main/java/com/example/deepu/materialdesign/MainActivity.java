package com.example.deepu.materialdesign;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar(((Toolbar) (findViewById(R.id.toolbar_real))));

        ViewPager vp = (ViewPager) findViewById(R.id.viewPager);
        vp.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar_real);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NavigationDrawerActivity.class);
                startActivity(i);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
            {
                Toast.makeText(MainActivity.this, "item1 pressed", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.item2:
            {
                Toast.makeText(MainActivity.this, "item2 pressed", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.item3:
            {
                Toast.makeText(MainActivity.this, "item3 pressed", Toast.LENGTH_SHORT).show();
                break;
            }
        }

        return true;
    }
}
