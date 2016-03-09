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
        // Gonna try to clean up the Reading code
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

            playClip(clipList);

        }

        else if (playerCode == 1) {
            // Merlin

            clipList.add(1);
            clipList.add(2);
            clipList.add(30);
            clipList.add(9);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

        }

        else if (playerCode == 16) {
            // Oberon

            clipList.add(1);
            clipList.add(39);
            clipList.add(30);
            clipList.add(20);

            playClip(clipList);
        }

        else if (playerCode == 32) {
            // Lancelot 1

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);
        }

        else if (playerCode == 64) {
            // Lancelot 2

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

            playClip(clipList);

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

            playClip(clipList);

        }

        else if (playerCode == 5) {
            // Merlin and Mordred

            clipList.add(1);
            clipList.add(3);
            clipList.add(30);
            clipList.add(10);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

        }

        else if (playerCode == 17) {
            //Merlin and Oberon

            clipList.add(1);
            clipList.add(39);
            clipList.add(30);
            clipList.add(13);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

        }

        else if (playerCode == 33) {
            // Merlin and Lancelot 1

            clipList.add(1);
            clipList.add(21);
            clipList.add(19);
            clipList.add(31);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

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

            playClip(clipList);

        }

        else if (playerCode == 48) {
            // Oberon and Lancelot 1

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

        }

        else if (playerCode == 80) {
            // Oberon and Lancelot 2

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(29);
            clipList.add(30);
            clipList.add(20);

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

        }

        else if (playerCode == 21) {
            // Merlin, Mordred, Oberon

            clipList.add(1);
            clipList.add(6);
            clipList.add(30);
            clipList.add(14);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

        }

        else if (playerCode == 37) {
            // Merlin, Mordred, Lancelot 1

            clipList.add(1);
            clipList.add(22);
            clipList.add(19);
            clipList.add(32);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

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

            playClip(clipList);

        }

        else if (playerCode == 49) {
            // Merlin, Oberon, Lancelot 1

            clipList.add(1);
            clipList.add(25);
            clipList.add(19);
            clipList.add(35);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

        }

        else if (playerCode == 53) {
            // Merlin, Mordred, Oberon, Lancelot 1

            clipList.add(1);
            clipList.add(26);
            clipList.add(19);
            clipList.add(36);
            clipList.add(19);
            clipList.add(20);

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);

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

            playClip(clipList);
        }

        else{

            clipList.add(40);

            playClip(clipList);
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

    private void PlayAgain(){
        Intent reading = new Intent (Reading.this, Reading.class);
        audioPlayer.stop();
        Bundle pass = new Bundle();
        pass.putIntArray("key", new int[]{delayValue, isMerlin, isPercival, isMordred, isMorgana, isOberon, isLancelot1, isLancelot2});
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

    public void playClip(final List clipList) {
        if(!clipList.isEmpty()) {
            clip = (int) clipList.remove(0);
        }
        else{
            getWindow().clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
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
}