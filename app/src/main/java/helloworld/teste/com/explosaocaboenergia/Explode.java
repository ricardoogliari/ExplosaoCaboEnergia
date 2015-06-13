package helloworld.teste.com.explosaocaboenergia;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;

/**
 * Created by ricardo on 06/06/2015.
 */
public class Explode extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer mp = MediaPlayer.create(context, R.drawable.explosao);
        mp.start();
    }
}
