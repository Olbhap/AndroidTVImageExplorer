package com.energysystem.videoexplorerTV.leanback;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.energysystem.videoexplorerTV.R;

public class PlayerActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT || keyCode == KeyEvent.KEYCODE_DPAD_RIGHT || keyCode == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE) {
            ((TVPlayerFragment) getFragmentManager().findFragmentById(R.id.player_fragment)).onKeyDown(keyCode);
        }

        return super.onKeyDown(keyCode, event);
    }

}
