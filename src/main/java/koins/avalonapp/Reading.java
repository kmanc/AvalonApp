package koins.avalonapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Reading extends AppCompatActivity implements View.OnClickListener {

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
    int voicePack;
    int playerCode = 0;
    List<Integer> clipList = new ArrayList<Integer>();
    int clip;

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
        voicePack = array[8];
        if (isMerlin == 1)
            playerCode += 1;
        if (isPercival == 1)
            playerCode += 2;
        if (isMordred == 1)
            playerCode += 4;
        if (isMorgana == 1)
            playerCode += 8;
        if (isOberon == 1)
            playerCode += 16;
        if (isLancelot1 == 1)
            playerCode += 32;
        if (isLancelot2 == 1)
            playerCode += 64;


        if (playerCode == 0) {
            // No special roles

            clipList.add(1);
            clipList.add(2);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 1) {
            // Merlin

            clipList.add(1);
            clipList.add(2);
            clipList.add(30);
            clipList.add(9);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 16) {
            // Oberon

            clipList.add(1);
            clipList.add(39);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 32) {
            // Lancelot 1

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 64) {
            // Lancelot 2

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 3) {
            // Merlin and Percival

            clipList.add(1);
            clipList.add(2);
            clipList.add(30);
            clipList.add(9);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 5) {
            // Merlin and Mordred

            clipList.add(1);
            clipList.add(3);
            clipList.add(30);
            clipList.add(10);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 17) {
            //Merlin and Oberon

            clipList.add(1);
            clipList.add(39);
            clipList.add(30);
            clipList.add(13);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 33) {
            // Merlin and Lancelot 1

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(31);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 65) {
            // Merlin and Lancelot 2

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(31);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 48) {
            // Oberon and Lancelot 1

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 80) {
            // Oberon and Lancelot 2

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 11) {
            // Merlin, Percival, Morgana

            clipList.add(1);
            clipList.add(4);
            clipList.add(30);
            clipList.add(11);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 7) {
            // Merlin, Percival, Mordred

            clipList.add(1);
            clipList.add(3);
            clipList.add(30);
            clipList.add(10);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 19) {
            // Merlin, Percival, Oberon

            clipList.add(1);
            clipList.add(39);
            clipList.add(30);
            clipList.add(13);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 35) {
            // Merlin, Percival, Lancelot 1

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(31);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 67) {
            // Merlin, Percival, Lancelot 2

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(31);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 21) {
            // Merlin, Mordred, Oberon

            clipList.add(1);
            clipList.add(6);
            clipList.add(30);
            clipList.add(14);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 37) {
            // Merlin, Mordred, Lancelot 1

            clipList.add(1);
            clipList.add(22);
            clipList.add(19);
            clipList.add(32);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 69) {
            // Merlin, Mordred, Lancelot 2

            clipList.add(1);
            clipList.add(22);
            clipList.add(19);
            clipList.add(32);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 49) {
            // Merlin, Oberon, Lancelot 1

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(35);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 81) {
            // Merlin, Oberon, Lancelot 2

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(35);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 15) {
            // Merlin, Percival, Mordred, Morgana

            clipList.add(1);
            clipList.add(5);
            clipList.add(30);
            clipList.add(12);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 27) {
            // Merlin, Percival, Morgana, Oberon

            clipList.add(1);
            clipList.add(7);
            clipList.add(30);
            clipList.add(15);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 43) {
            // Merlin, Percival, Morgana, Lancelot 1

            clipList.add(1);
            clipList.add(23);
            clipList.add(19);
            clipList.add(33);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 75) {
            // Merlin, Percival, Morgana, Lancelot 2

            clipList.add(1);
            clipList.add(23);
            clipList.add(19);
            clipList.add(33);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 23) {
            // Merlin, Percival, Mordred, Oberon

            clipList.add(1);
            clipList.add(6);
            clipList.add(30);
            clipList.add(14);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 39) {
            // Merlin, Percival, Mordred, Lancelot 1

            clipList.add(1);
            clipList.add(22);
            clipList.add(19);
            clipList.add(32);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 71) {
            // Merlin, Percival, Mordred, Lancelot 2

            clipList.add(1);
            clipList.add(22);
            clipList.add(19);
            clipList.add(32);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 51) {
            // Merlin, Percival, Oberon, Lancelot 1

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(35);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 83) {
            // Merlin, Percival, Oberon, Lancelot 2

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(35);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 53) {
            // Merlin, Mordred, Oberon, Lancelot 1

            clipList.add(1);
            clipList.add(26);
            clipList.add(19);
            clipList.add(36);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 85) {
            // Merlin, Mordred, Oberon, Lancelot 2

            clipList.add(1);
            clipList.add(26);
            clipList.add(19);
            clipList.add(36);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 31) {
            // Merlin, Percival, Mordred, Morgana, Oberon

            clipList.add(1);
            clipList.add(8);
            clipList.add(30);
            clipList.add(16);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 47) {
            // Merlin, Percival, Mordred, Morgana, Lancelot 1

            clipList.add(1);
            clipList.add(24);
            clipList.add(19);
            clipList.add(34);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 79) {
            // Merlin, Percival, Mordred, Morgana, Lancelot 2

            clipList.add(1);
            clipList.add(24);
            clipList.add(19);
            clipList.add(34);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 59) {
            // Merlin, Percival, Morgana, Oberon, Lancelot 1

            clipList.add(1);
            clipList.add(27);
            clipList.add(19);
            clipList.add(37);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 91) {
            // Merlin, Percival, Morgana, Oberon, Lancelot 2

            clipList.add(1);
            clipList.add(27);
            clipList.add(19);
            clipList.add(37);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 55) {
            // Merlin, Percival, Mordred, Oberon, Lancelot 1

            clipList.add(1);
            clipList.add(26);
            clipList.add(19);
            clipList.add(36);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 87) {
            // Merlin, Percival, Mordred, Oberon, Lancelot 2

            clipList.add(1);
            clipList.add(26);
            clipList.add(19);
            clipList.add(36);
            clipList.add(19);
            clipList.add(17);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

        }

        else if (playerCode == 63) {
            // Merlin, Percival, Mordred, Morgana, Oberon, Lancelot 1

            clipList.add(1);
            clipList.add(28);
            clipList.add(19);
            clipList.add(38);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(20);

        }

        else if (playerCode == 85) {
            // Merlin, Percival, Mordred, Morgana, Oberon, Lancelot 2

            clipList.add(1);
            clipList.add(28);
            clipList.add(19);
            clipList.add(38);
            clipList.add(19);
            clipList.add(18);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);
        }

        else {

            clipList.add(40);
        }

        playClip(clipList);
        getWindow().clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
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

    private void PlayAgain(){
        Intent reading = new Intent (Reading.this, Reading.class);
        audioPlayer.stop();
        Bundle pass = new Bundle();
        pass.putIntArray("key", new int[]{delayValue, isMerlin, isPercival, isMordred, isMorgana, isOberon, isLancelot1, isLancelot2, voicePack});
        reading.putExtras(pass);
        startActivity(reading);
    }

    private void MainMenu(){
        Intent goBack = new Intent (Reading.this, MainActivity.class);
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
        int recording;
        String audioFileName = "";
        switch (i) {
            case 1:
                audioFileName = "one";
                break;
            case 2:
                audioFileName = "two";
                break;
            case 3:
                audioFileName = "three";
                break;
            case 4:
                audioFileName = "four";
                break;
            case 5:
                audioFileName = "five";
                break;
            case 6:
                audioFileName = "six";
                break;
            case 7:
                audioFileName = "seven";
                break;
            case 8:
                audioFileName = "eight";
                break;
            case 9:
                audioFileName = "nine";
                break;
            case 10:
                audioFileName = "ten";
                break;
            case 11:
                audioFileName = "eleven";
                break;
            case 12:
                audioFileName = "twelve";
                break;
            case 13:
                audioFileName = "thirteen";
                break;
            case 14:
                audioFileName = "fourteen";
                break;
            case 15:
                audioFileName = "fifteen";
                break;
            case 16:
                audioFileName = "sixteen";
                break;
            case 17:
                audioFileName = "seventeen";
                break;
            case 18:
                audioFileName = "eighteen";
                break;
            case 19:
                audioFileName = "nineteen";
                break;
            case 20:
                audioFileName = "twenty";
                break;
            case 21:
                audioFileName = "twentyone";
                break;
            case 22:
                audioFileName = "twentytwo";
                break;
            case 23:
                audioFileName = "twentythree";
                break;
            case 24:
                audioFileName = "twentyfour";
                break;
            case 25:
                audioFileName = "twentyfive";
                break;
            case 26:
                audioFileName = "twentysix";
                break;
            case 27:
                audioFileName = "twentyseven";
                break;
            case 28:
                audioFileName = "twentyeight";
                break;
            case 29:
                audioFileName = "twentynine";
                break;
            case 30:
                audioFileName = "thirty";
                break;
            case 31:
                audioFileName = "thirtyone";
                break;
            case 32:
                audioFileName = "thirtytwo";
                break;
            case 33:
                audioFileName = "thirtythree";
                break;
            case 34:
                audioFileName = "thirtyfour";
                break;
            case 35:
                audioFileName = "thirtyfive";
                break;
            case 36:
                audioFileName = "thirtysix";
                break;
            case 37:
                audioFileName = "thirtyseven";
                break;
            case 38:
                audioFileName = "thirtyeight";
                break;
            case 39:
                audioFileName = "thirtynine";
                break;
            case 40:
                audioFileName = "forty";
                break;
        }
        if (voicePack == 1)
            audioFileName += "vpone";
        recording = this.getResources().getIdentifier(audioFileName, "raw", this.getPackageName());
        audioPlayer = MediaPlayer.create(this, recording);
        audioPlayer.start();
        return audioPlayer;
    }

    @Override
    public void onStop(){
        super.onStop();
        audioPlayer.stop();
    }

    public void playClip(final List clipList) {

        new Thread(new Runnable() {
            public void run() {
                if(!clipList.isEmpty()) {
                    clip = (int) clipList.remove(0);
                }
                else{
                    return;
                }
                clipSetup(clip);
                    audioPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            SystemClock.sleep(delayValue * 500);
                            playClip(clipList);
                        }
                    });
            }
        }).start();
    }
}