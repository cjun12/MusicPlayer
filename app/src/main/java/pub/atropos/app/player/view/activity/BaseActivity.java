package pub.atropos.app.player.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import pub.atropos.app.player.R;

/**
 * Created by 980558 on 2017/3/29.
 */

public class BaseActivity extends AppCompatActivity {
    private WindowManager windowManager;
    private FrameLayout rootContainer;
    private View floatView;
    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup decorView = (ViewGroup) getWindow().getDecorView();
        Log.d(TAG, "onCreate: "+decorView);
        rootContainer = (FrameLayout) ((ViewGroup) decorView.getChildAt(0)).getChildAt(1);
        Log.d(TAG, "onCreate: "+rootContainer);
        floatView = LayoutInflater.from(getBaseContext()).inflate(R.layout.float_music_player, null);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.
                LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity= Gravity.BOTTOM;
        rootContainer.addView(floatView,layoutParams);
    }
    protected void onStart(){
        super.onStart();
    }
    @Override
    public void startActivity(Intent intent) {
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        super.startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
