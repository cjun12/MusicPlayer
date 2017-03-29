package pub.atropos.app.player.presenter.impl;

import android.database.Cursor;
import android.provider.MediaStore;

import java.util.ArrayList;
import java.util.List;

import pub.atropos.app.player.presenter.ISongListPresenter;
import pub.atropos.app.player.view.ISongListView;

/**
 * Created by cjun on 2017/3/30.
 */

public class SongListPresenterImpl implements ISongListPresenter {
    private ISongListView view;

    public SongListPresenterImpl(ISongListView view) {
        this.view = view;
    }

    @Override
    public void loadLocalSongList() {
        List<String> names = new ArrayList<>();
        Cursor cursor = view.getContext().getContentResolver()
                .query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, null, null, null, null);
        while (cursor.moveToNext()) {
            String name = cursor.getString(
                    cursor.getColumnIndex(MediaStore.Audio.Media.DISPLAY_NAME));
            names.add(name);
        }
    }
}
