package pub.atropos.app.player.model.impl;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Audio.Media;

import java.util.ArrayList;
import java.util.List;

import pub.atropos.app.player.model.ISongModel;
import pub.atropos.app.player.presenter.ISongPresenter;

/**
 * Created by 980558 on 2017/3/29.
 */

public class SongModelImpl implements ISongModel {
    private ISongPresenter songPresenter;

    public SongModelImpl(ISongPresenter songPresenter) {
        this.songPresenter = songPresenter;
    }


    @Override
    public void searchInternetSong() {

    }
}
