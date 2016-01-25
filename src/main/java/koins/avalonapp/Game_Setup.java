package koins.avalonapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Game_Setup extends AppCompatActivity implements View.OnClickListener {

    int isMerlin = 0;
    int isPercival = 0;
    int isMordred = 0;
    int isMorgana = 0;
    int isOberon = 0;
    int isLancelot1 = 0;
    int isLancelot2 = 0;
    int delayValue = 3;

    Button doneReading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__setup);
        switchHandling();
        picHandling();
        doneReading = (Button) findViewById(R.id.done_reading);
        doneReading.setOnClickListener(this);
    }

     private void buttonClick() {
         Bundle pass = new Bundle();
         pass.putIntArray("key", new int[]{delayValue, isMerlin, isPercival, isMordred, isMorgana, isOberon, isLancelot1, isLancelot2});
         Intent reading = new Intent(getApplicationContext(), Reading.class);
         reading.putExtras(pass);
         startActivity(reading);
     }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.done_reading:
                buttonClick();
                break;
        }
    }

    private void picHandling(){
        ImageView merlinImage;
        ImageView percivalImage;
        ImageView mordredImage;
        ImageView morganaImage;
        ImageView oberonImage;
        ImageView badLancelotImage;

        merlinImage = (ImageView) findViewById(R.id.merlinPic);
        merlinImage.setImageResource(R.drawable.merlin);

        percivalImage = (ImageView) findViewById(R.id.percivalPic);
        percivalImage.setImageResource(R.drawable.percival);

        mordredImage = (ImageView) findViewById(R.id.mordredPic);
        mordredImage.setImageResource(R.drawable.mordred);

        morganaImage = (ImageView) findViewById(R.id.morganaPic);
        morganaImage.setImageResource(R.drawable.morgana);

        oberonImage = (ImageView) findViewById(R.id.oberonPic);
        oberonImage.setImageResource(R.drawable.oberon);

        badLancelotImage = (ImageView) findViewById(R.id.lancelot1Pic);
        badLancelotImage.setImageResource(R.drawable.badlancelot);

        badLancelotImage = (ImageView) findViewById(R.id.lancelot2Pic);
        badLancelotImage.setImageResource(R.drawable.badlancelot);
    }
    private void switchHandling(){
        final ToggleButton merlinSwitch = (ToggleButton) findViewById(R.id.togglemerlin);
        final ToggleButton percivalSwitch = (ToggleButton) findViewById(R.id.togglepercival);
        final ToggleButton mordredSwitch = (ToggleButton) findViewById(R.id.togglemordred);
        final ToggleButton morganaSwitch = (ToggleButton) findViewById(R.id.togglemorgana);
        final ToggleButton oberonSwitch = (ToggleButton) findViewById(R.id.toggleoberon);
        final ToggleButton lancelot1Switch = (ToggleButton) findViewById(R.id.togglelancelot1);
        final ToggleButton lancelot2Switch = (ToggleButton) findViewById(R.id.togglelancelot2);
        final Button plusButton = (Button) findViewById(R.id.plusButton);
        final Button minusButton = (Button) findViewById(R.id.minusButton);
        final TextView delay = (TextView) findViewById(R.id.pauseValue);

        merlinSwitch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (merlinSwitch.isChecked()) {
                    isMerlin = 1;
                }
                else {
                    isMerlin = 0;
                }
            }
        });

        percivalSwitch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (percivalSwitch.isChecked()){
                    isPercival = 1;
            }
                else {
                    isPercival = 0;
                }
            }
        });

        mordredSwitch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (mordredSwitch.isChecked()) {
                    isMordred = 1;
                }
                else {
                    isMordred = 0;
                }
            }
        });

        morganaSwitch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (morganaSwitch.isChecked()) {
                    isMorgana = 1;
                }
                else {
                    isMorgana = 0;
                }
            }
        });

        oberonSwitch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (oberonSwitch.isChecked()) {
                    isOberon = 1;
                }
                else {
                    isOberon = 0;
                }
            }
        });

        lancelot1Switch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (lancelot1Switch.isChecked()) {
                    isLancelot1 = 1;
                }
                else {
                    isLancelot1 = 0;
                }
            }
        });

        lancelot2Switch.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (lancelot2Switch.isChecked()) {
                    isLancelot2 = 1;
                }
                else {
                    isLancelot2 = 0;
                }
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (delayValue < 10) {
                    delayValue++;
                    delay.setText(String.valueOf((float) delayValue / 2));
                }
                else {
                    delayValue = 10;
                    delay.setText(String.valueOf((float)delayValue/2));
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (delayValue > 1) {
                    delayValue--;
                    delay.setText(String.valueOf((float)delayValue/2));
                }
                else {
                    delayValue = 1;
                    delay.setText(String.valueOf((float)delayValue/2));
                }
            }
        });

        delay.setText(String.valueOf((float)delayValue/2));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game__setup, menu);
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



}
