package kr.ac.cnu.computer.mp3;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    TextView titleView;
    ImageButton playButton;
    // 음악 탐색바
    SeekBar seekBar ;
    Thread1 thread1=new Thread1();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar=findViewById(R.id.seekBar);
        // 음악 제목


        // Play 버튼. 다시 누르면 Pause 버튼으로 변경
        playButton = findViewById(R.id.playButton);

        // MediaPlayer 음악 재생 관련 객체
        player = MediaPlayer.create(this, R.raw.old_pop);

    }

    /**
     * 이 버튼을 누르면 현재 위치에서 5초 뒤로 이동한다.
     * @param view
     */
    public void rewindAction(View view) {
        player.seekTo(player.getCurrentPosition() - 5000);
    }

    /**
     * 재생 중이 아니면 음악을 재생하고, 재생중이면 음악을 중지한다.
     * @param view
     */
    public void playAction(View view) {
        seekBar.setMax(player.getDuration());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    player.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        if (!player.isPlaying()) {
            player.start();
            thread1.start();
            playButton.setImageResource(R.drawable.ic_pause);
        } else {
            player.pause();
            playButton.setImageResource(R.drawable.ic_play_arrow);
        }

    }

    /**
     * 이 버튼을 누르면 현재 위치에서 5초 앞으로 이동한다.
     * @param view
     */
    public void forwardAction(View view) {
        player.seekTo(player.getCurrentPosition() + 5000);
    }

    class Thread1 extends Thread{
        @Override
        public void run() {
            while (player.isPlaying()){
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                seekBar.setProgress(player.getCurrentPosition()) ;
            }                        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        player.stop();
    }
}
