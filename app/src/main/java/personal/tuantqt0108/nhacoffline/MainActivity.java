package personal.tuantqt0108.nhacoffline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import personal.tuantqt0108.nhacoffline.provider.SongProvider;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TuanTeo: Set display toolbar*/
        setSupportActionBar((androidx.appcompat.widget.Toolbar)findViewById(R.id.toolbar));

        ActionBar actionBar = getSupportActionBar();
        /*TuanTeo: Enable to show navigation button*/
        actionBar.setDisplayHomeAsUpEnabled(true);
        /*TuanTeo: Set navigation button*/
        actionBar.setHomeAsUpIndicator(R.drawable.ic_navigation_button);

        Log.d("TAG", "onCreate: So bai hat" + SongProvider.getInstance(this).getListAllSongs().size());

        initComponent();
    }

    private void initComponent() {
        mDrawerLayout = findViewById(R.id.all_screen_drawer_layout);
        mNavigationView = findViewById(R.id.navigation_view);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.nav_listen_now:
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.nav_favorite_songs:
                        //todo inflate fragment danh sách bài hát yêu thích
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.nav_all_songs:
                        //todo inflate fragment danh sách tất cả bài hát
                        mDrawerLayout.closeDrawers();

                        break;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            /*TuanTeo: Set su kien click vao navigation view*/
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
        }
        return super.onOptionsItemSelected(item);
    }
}