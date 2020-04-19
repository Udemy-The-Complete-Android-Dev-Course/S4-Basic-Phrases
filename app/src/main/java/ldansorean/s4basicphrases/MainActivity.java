package ldansorean.s4basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void phraseSelected(View view) {
        int audioFileId = getResources().getIdentifier(view.getTag().toString(),"raw", getPackageName());
        MediaPlayer mediaPlayer = MediaPlayer.create(this, audioFileId);
        mediaPlayer.start();
    }
}
