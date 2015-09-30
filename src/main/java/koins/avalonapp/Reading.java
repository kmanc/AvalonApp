package koins.avalonapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.WindowManager;

public class Reading extends ActionBarActivity implements View.OnClickListener {

    MediaPlayer audioPlayer;
    Button mainMenu;
    Button changeRoles;
    Button playAgain;
    int delayValue;
    int isMerlin;
    int isPercival;
    int isMordred;
    int isMorgana;
    int isOberon;
    int isLancelot1;
    int isLancelot2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle receive = this.getIntent().getExtras();
        int[] array = receive.getIntArray("key");
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        delayValue = array[0];
        isMerlin = array[1];
        isPercival = array[2];
        isMordred = array[3];
        isMorgana = array[4];
        isOberon = array[5];
        isLancelot1 = array[6];
        isLancelot2 = array[7];

        if ((isMerlin == 0) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(2);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(20);
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(2);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(9);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 0) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(39);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(20);
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 0) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(21);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(20);
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 0) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(21);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(29);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(30);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(2);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(9);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(3);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(10);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(39);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(13);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(21);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(31);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(21);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(31);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(29);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(30);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 0) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(25);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(20);
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 0) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(25);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(29);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(30);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 1) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(4);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(11);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(3);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(10);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(39);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(13);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(21);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(31);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(21);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(31);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(29);
                                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                    {
                                                                        @Override
                                                                        public void onCompletion(MediaPlayer mp)
                                                                        {
                                                                            SystemClock.sleep(delayValue * 1000);
                                                                            clipSetup(30);
                                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                            {
                                                                                @Override
                                                                                public void onCompletion(MediaPlayer mp)
                                                                                {
                                                                                    SystemClock.sleep(delayValue * 1000);
                                                                                    clipSetup(20);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(6);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(14);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(22);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(32);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(22);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(32);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(29);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(30);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(25);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(35);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(25);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(35);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(29);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(30);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 1) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(5);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(12);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 1) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(7);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(15);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 1) && (isOberon == 0) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(23);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(33);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 1) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(23);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(33);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(29);
                                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                    {
                                                                        @Override
                                                                        public void onCompletion(MediaPlayer mp)
                                                                        {
                                                                            SystemClock.sleep(delayValue * 1000);
                                                                            clipSetup(30);
                                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                            {
                                                                                @Override
                                                                                public void onCompletion(MediaPlayer mp)
                                                                                {
                                                                                    SystemClock.sleep(delayValue * 1000);
                                                                                    clipSetup(20);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(6);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(14);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(22);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(32);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(22);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(32);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(29);
                                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                    {
                                                                        @Override
                                                                        public void onCompletion(MediaPlayer mp)
                                                                        {
                                                                            SystemClock.sleep(delayValue * 1000);
                                                                            clipSetup(30);
                                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                            {
                                                                                @Override
                                                                                public void onCompletion(MediaPlayer mp)
                                                                                {
                                                                                    SystemClock.sleep(delayValue * 1000);
                                                                                    clipSetup(20);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(25);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(35);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(25);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(35);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(29);
                                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                    {
                                                                        @Override
                                                                        public void onCompletion(MediaPlayer mp)
                                                                        {
                                                                            SystemClock.sleep(delayValue * 1000);
                                                                            clipSetup(30);
                                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                            {
                                                                                @Override
                                                                                public void onCompletion(MediaPlayer mp)
                                                                                {
                                                                                    SystemClock.sleep(delayValue * 1000);
                                                                                    clipSetup(20);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(26);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(36);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(20);
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 0) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(26);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(36);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(29);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(30);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 1) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(8);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(30);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(16);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);

                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 1) && (isOberon == 0) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(24);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(34);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 1) && (isOberon == 0) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(24);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(34);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(29);
                                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                    {
                                                                        @Override
                                                                        public void onCompletion(MediaPlayer mp)
                                                                        {
                                                                            SystemClock.sleep(delayValue * 1000);
                                                                            clipSetup(30);
                                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                            {
                                                                                @Override
                                                                                public void onCompletion(MediaPlayer mp)
                                                                                {
                                                                                    SystemClock.sleep(delayValue * 1000);
                                                                                    clipSetup(20);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 1) && (isOberon == 1) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(27);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(37);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 0) && (isMorgana == 1) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(27);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(37);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(29);
                                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                    {
                                                                        @Override
                                                                        public void onCompletion(MediaPlayer mp)
                                                                        {
                                                                            SystemClock.sleep(delayValue * 1000);
                                                                            clipSetup(30);
                                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                            {
                                                                                @Override
                                                                                public void onCompletion(MediaPlayer mp)
                                                                                {
                                                                                    SystemClock.sleep(delayValue * 1000);
                                                                                    clipSetup(20);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(26);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(36);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 0) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(26);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(36);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(17);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(29);
                                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                    {
                                                                        @Override
                                                                        public void onCompletion(MediaPlayer mp)
                                                                        {
                                                                            SystemClock.sleep(delayValue * 1000);
                                                                            clipSetup(30);
                                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                            {
                                                                                @Override
                                                                                public void onCompletion(MediaPlayer mp)
                                                                                {
                                                                                    SystemClock.sleep(delayValue * 1000);
                                                                                    clipSetup(20);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 1) && (isOberon == 1) && (isLancelot1 == 1) && (isLancelot2 == 0)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(28);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(38);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(20);
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else if ((isMerlin == 1) && (isPercival == 1) && (isMordred == 1) && (isMorgana == 1) && (isOberon == 1) && (isLancelot1 == 0) && (isLancelot2 == 1)) {
            clipSetup(1);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    SystemClock.sleep(delayValue * 1000);
                    clipSetup(28);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                    {
                        @Override
                        public void onCompletion(MediaPlayer mp)
                        {
                            SystemClock.sleep(delayValue * 1000);
                            clipSetup(19);
                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                            {
                                @Override
                                public void onCompletion(MediaPlayer mp)
                                {
                                    SystemClock.sleep(delayValue * 1000);
                                    clipSetup(38);
                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                    {
                                        @Override
                                        public void onCompletion(MediaPlayer mp)
                                        {
                                            SystemClock.sleep(delayValue * 1000);
                                            clipSetup(19);
                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                            {
                                                @Override
                                                public void onCompletion(MediaPlayer mp)
                                                {
                                                    SystemClock.sleep(delayValue * 1000);
                                                    clipSetup(18);
                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                    {
                                                        @Override
                                                        public void onCompletion(MediaPlayer mp)
                                                        {
                                                            SystemClock.sleep(delayValue * 1000);
                                                            clipSetup(19);
                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                            {
                                                                @Override
                                                                public void onCompletion(MediaPlayer mp)
                                                                {
                                                                    SystemClock.sleep(delayValue * 1000);
                                                                    clipSetup(29);
                                                                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                    {
                                                                        @Override
                                                                        public void onCompletion(MediaPlayer mp)
                                                                        {
                                                                            SystemClock.sleep(delayValue * 1000);
                                                                            clipSetup(30);
                                                                            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                                                                            {
                                                                                @Override
                                                                                public void onCompletion(MediaPlayer mp)
                                                                                {
                                                                                    SystemClock.sleep(delayValue * 1000);
                                                                                    clipSetup(20);
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }

        else{
            clipSetup(40);
            audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp)
                {
                    GameSetup();
                }
            });
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
        mainMenu = (Button) findViewById(R.id.home);
        mainMenu.setOnClickListener(this);
        playAgain = (Button) findViewById(R.id.PlayAgain);
        playAgain.setOnClickListener(this);
        changeRoles = (Button) findViewById(R.id.ChangeSetup);
        changeRoles.setOnClickListener(this);
    }

    private void GameSetup() {
        audioPlayer.stop();
        startActivity(new Intent(".GameSetup"));
    }

    private void PlayAgain(){ Intent reading = new Intent (Reading.this, Reading.class);
        audioPlayer.stop();
        Bundle pass = new Bundle();
        pass.putIntArray("key", new int[]{delayValue, isMerlin, isPercival, isMordred, isMorgana, isOberon, isLancelot1, isLancelot2});
        reading.putExtras(pass);
        startActivity(reading);
    }

    private void MainMenu(){ Intent goBack = new Intent (Reading.this, MainActivity.class);
        audioPlayer.stop();
        goBack.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goBack);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ChangeSetup:
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                GameSetup();
                break;
        }
        switch (v.getId()){
            case R.id.PlayAgain:
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                PlayAgain();
                break;
        }
        switch (v.getId()){
            case R.id.home:
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                MainMenu();
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reading, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private MediaPlayer clipSetup(int i){
        switch (i) {
            case 1:
                audioPlayer = MediaPlayer.create(this, R.raw.one);
                audioPlayer.start();
                break;
            case 2:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.two);
                audioPlayer.start();
                break;
            case 3:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.three);
                audioPlayer.start();
                break;
            case 4:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.four);
                audioPlayer.start();
                break;
            case 5:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.five);
                audioPlayer.start();
                break;
            case 6:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.six);
                audioPlayer.start();
                break;
            case 7:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.seven);
                audioPlayer.start();
                break;
            case 8:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.eight);
                audioPlayer.start();
                break;
            case 9:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.nine);
                audioPlayer.start();
                break;
            case 10:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.ten);
                audioPlayer.start();
                break;
            case 11:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.eleven);
                audioPlayer.start();
                break;
            case 12:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twelve);
                audioPlayer.start();
                break;
            case 13:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.thirteen);
                audioPlayer.start();
                break;
            case 14:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.fourteen);
                audioPlayer.start();
                break;
            case 15:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.fifteen);
                audioPlayer.start();
                break;
            case 16:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.sixteen);
                audioPlayer.start();
                break;
            case 17:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.seventeen);
                audioPlayer.start();
                break;
            case 18:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.eighteen);
                audioPlayer.start();
                break;
            case 19:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.nineteen);
                audioPlayer.start();
                break;
            case 20:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twenty);
                audioPlayer.start();
                break;
            case 21:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentyone);
                audioPlayer.start();
                break;
            case 22:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentytwo);
                audioPlayer.start();
                break;
            case 23:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentythree);
                audioPlayer.start();
                break;
            case 24:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentyfour);
                audioPlayer.start();
                break;
            case 25:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentyfive);
                audioPlayer.start();
                break;
            case 26:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentysix);
                audioPlayer.start();
                break;
            case 27:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentyseven);
                audioPlayer.start();
                break;
            case 28:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentyeight);
                audioPlayer.start();
                break;
            case 29:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.twentynine);
                audioPlayer.start();
                break;
            case 30:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.thirty);
                audioPlayer.start();
                break;
            case 31:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.thirtyone);
                audioPlayer.start();
                break;
            case 32:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.thirtytwo);
                audioPlayer.start();
                break;
            case 33:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.thirtythree);
                audioPlayer.start();
                break;
            case 34:
                audioPlayer = MediaPlayer.create(Reading.this, R.raw.thirtyfour);
                audioPlayer.start();
                break;
            case 35:
                 audioPlayer = MediaPlayer.create(Reading.this, R.raw.thirtyfive);
                 audioPlayer.start();
                break;
            case 36:
                audioPlayer = MediaPlayer.create(this, R.raw.thirtysix);
                audioPlayer.start();
                break;
            case 37:
                audioPlayer = MediaPlayer.create(this, R.raw.thirtyseven);
                audioPlayer.start();
                break;
            case 38:
                audioPlayer = MediaPlayer.create(this, R.raw.thirtyeight);
                audioPlayer.start();
                break;
            case 39:
                audioPlayer = MediaPlayer.create(this, R.raw.thirtynine);
                audioPlayer.start();
                break;
            case 40:
                audioPlayer = MediaPlayer.create(this, R.raw.forty);
                audioPlayer.start();
                break;
        }
        return audioPlayer;
    }

    @Override
    public void onStop(){
        super.onStop();
        audioPlayer.stop();
    }
}