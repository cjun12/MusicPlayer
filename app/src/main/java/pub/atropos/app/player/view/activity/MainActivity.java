package pub.atropos.app.player.view.activity;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pub.atropos.app.player.R;
import pub.atropos.app.player.view.adapter.ViewsAdapter;
import pub.atropos.app.player.view.fragment.HomeFragment;
import pub.atropos.app.player.view.fragment.MusicLibraryFragment;

public class MainActivity extends BaseActivity {

    Toolbar toolbar;
    TextInputEditText tiet_search;
    DrawerLayout drawer;
    TabLayout tab;
    ViewPager views;
    List<Fragment> viewList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        initDrawer();
        initSearch();
        loadViews();
    }

    private void initToolbar(){
//        设置Toolbar为ActionBar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        移除Title
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initSearch(){
//        设置搜索框可以用fontawesome字体
        tiet_search = (TextInputEditText) findViewById(R.id.search);
        Typeface fontawesome = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        tiet_search.setTypeface(fontawesome);
    }

    private void initDrawer(){
//        设置弹出导航的按钮
        drawer = (DrawerLayout) findViewById(R.id.root);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void loadViews(){
        viewList.add(new HomeFragment());
        viewList.add(new MusicLibraryFragment());
        List<String> titles= new ArrayList<String>();
        titles.add(getString(R.string.tab_home_title));
        titles.add(getString(R.string.tab_music_library_title));

        ViewsAdapter viewsAdapter = new ViewsAdapter(getSupportFragmentManager(),viewList,titles) ;
        tab = (TabLayout) findViewById(R.id.container_tab);
        views = (ViewPager) findViewById(R.id.views);
        views.setAdapter(viewsAdapter);
        tab.setupWithViewPager(views);

    }
}
