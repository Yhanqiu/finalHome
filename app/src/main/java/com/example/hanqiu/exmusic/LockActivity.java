package com.example.hanqiu.exmusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

public class LockActivity extends SwipeBackActivity implements View.OnClickListener {
    int[] play_pause = {R.drawable.pause, R.drawable.play};
    int abab = 0;

    private ImageButton pauseBt;
    private ImageButton prevBt;
    private ImageButton nextBt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD | WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);

        pauseBt = (ImageButton) findViewById(R.id.LPlayBt);
        prevBt = (ImageButton) findViewById(R.id.LPrevBt);
        nextBt = (ImageButton) findViewById(R.id.LNextBt);

        pauseBt.setImageResource(play_pause[abab++ % 2]);
        pauseBt.setOnClickListener(this);
        prevBt.setOnClickListener(this);
        nextBt.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.LPlayBt:
                pauseBt.setImageResource(play_pause[abab++ % 2]);
                break;
            case R.id.LPrevBt:
                break;
            case R.id.LNextBt:
                break;
            default:
        }
    }
}
