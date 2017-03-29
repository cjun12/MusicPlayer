package pub.atropos.app.player.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import pub.atropos.app.player.R;
import pub.atropos.app.player.presenter.IHomePresenter;
import pub.atropos.app.player.presenter.impl.HomePresenterImpl;
import pub.atropos.app.player.view.IHomeView;

/**
 * Created by 980558 on 2017/3/29.
 */

public class HomeFragment extends Fragment implements IHomeView, View.OnClickListener {
    private View view;
    private LinearLayout llt_localMusic;
    private Context context;
    private ImageButton btn_localMusic;
    private IHomePresenter songPresenter;
    TextView tv_cnt_localMusic;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home, container, false);
        songPresenter = new HomePresenterImpl(this);
        initControl();
        songPresenter.changeLocalSongCount();
        return view;
    }

    public void initControl() {
        tv_cnt_localMusic = (TextView) view.findViewById(R.id.local_music_count);
        btn_localMusic = (ImageButton) view.findViewById(R.id.btn_local_music);
        btn_localMusic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_local_music:
                break;
            default:
                break;
        }
    }

    @Override
    public void changeLocalSongCount(int cnt) {
        tv_cnt_localMusic.setText(cnt + "首");
    }

}
