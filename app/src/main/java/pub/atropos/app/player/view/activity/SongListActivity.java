package pub.atropos.app.player.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import pub.atropos.app.player.R;
import pub.atropos.app.player.presenter.ISongListPresenter;
import pub.atropos.app.player.presenter.impl.SongListPresenterImpl;
import pub.atropos.app.player.view.ISongListView;

/**
 * Created by cjun on 2017/3/30.
 */

public class SongListActivity extends BaseActivity implements ISongListView{

    //controls
    private Toolbar toolbar;

    //members
    private ISongListPresenter songListPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        initToolbar();
        songListPresenter = new SongListPresenterImpl(this);
        songListPresenter.loadLocalSongList();
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.tb_songList);
        setSupportActionBar(toolbar);
    }

    @Override
    public void showSongList() {

    }

    @Override
    public Context getContext() {
        return this;
    }
}
