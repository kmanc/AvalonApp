package koins.avalonapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;


public class Directions extends ActionBarActivity implements View.OnClickListener {
    TextView moreMerlin;
    TextView morePercival;
    TextView moreAssassin;
    TextView moreMordred;
    TextView moreMorgana;
    TextView moreOberon;
    TextView moreLancelot;
    TextView moreVoting;
    TextView moreMissions;
    TextView moreLady;
    TextView moreExcalibur;
    Animation slideDown;
    Animation slideUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);
        final Button goToGame = (Button) findViewById(R.id.Play);
        final Button goHome = (Button) findViewById(R.id.home);
        goToGame.setOnClickListener(this);
        goHome.setOnClickListener(this);
        moreMerlin = (TextView) findViewById(R.id.merlinExplanation);
        moreMerlin.setVisibility(View.GONE);
        morePercival = (TextView) findViewById(R.id.percivalExplanation);
        morePercival.setVisibility(View.GONE);
        moreAssassin = (TextView) findViewById(R.id.assassinExplanation);
        moreAssassin.setVisibility(View.GONE);
        moreMordred = (TextView) findViewById(R.id.mordredExplanation);
        moreMordred.setVisibility(View.GONE);
        moreMorgana = (TextView) findViewById(R.id.morganaExplanation);
        moreMorgana.setVisibility(View.GONE);
        moreOberon = (TextView) findViewById(R.id.oberonExplanation);
        moreOberon.setVisibility(View.GONE);
        moreLancelot = (TextView) findViewById(R.id.lancelotExplanation);
        moreLancelot.setVisibility(View.GONE);
        moreVoting = (TextView) findViewById(R.id.votingExplanation);
        moreVoting.setVisibility(View.GONE);
        moreMissions = (TextView) findViewById(R.id.missionExplanation);
        moreMissions.setVisibility(View.GONE);
        moreLady = (TextView) findViewById(R.id.ladyExplanation);
        moreLady.setVisibility(View.GONE);
        moreExcalibur = (TextView) findViewById(R.id.excaliburExplanation);
        moreExcalibur.setVisibility(View.GONE);
        slideDown = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
        slideUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
        switchHandling();
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.Play:
                play();
                break;
            case R.id.home:
                home();
                break;
        }
    }

    private void switchHandling(){
        final ToggleButton showMerlin = (ToggleButton) findViewById(R.id.showMore1);
        final ToggleButton showPercival = (ToggleButton) findViewById(R.id.showMore2);
        final ToggleButton showAssassin = (ToggleButton) findViewById(R.id.showMore3);
        final ToggleButton showMordred = (ToggleButton) findViewById(R.id.showMore11);
        final ToggleButton showMorgana = (ToggleButton) findViewById(R.id.showMore4);
        final ToggleButton showOberon = (ToggleButton) findViewById(R.id.showMore5);
        final ToggleButton showLancelot = (ToggleButton) findViewById(R.id.showMore6);
        final ToggleButton showVoting = (ToggleButton) findViewById(R.id.showMore7);
        final ToggleButton showMissions = (ToggleButton) findViewById(R.id.showMore8);
        final ToggleButton showLady = (ToggleButton) findViewById(R.id.showMore9);
        final ToggleButton showExcalibur = (ToggleButton) findViewById(R.id.showMore10);

        showMerlin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showMerlin.isChecked()) {
                    //moreMerlin.startAnimation(slideDown);
                    moreMerlin.setVisibility(View.VISIBLE);
                }
                else {
                    //moreMerlin.startAnimation(slideUp);
                    moreMerlin.setVisibility(View.GONE);
                }
            }
        });

        showPercival.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showPercival.isChecked()) {
                    //morePercival.startAnimation(slideDown);
                    morePercival.setVisibility(View.VISIBLE);
                }
                else {
                    //morePercival.startAnimation(slideUp);
                    morePercival.setVisibility(View.GONE);
                }
            }
        });

        showAssassin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showAssassin.isChecked()) {
                    //moreAssassin.startAnimation(slideDown);
                    moreAssassin.setVisibility(View.VISIBLE);
                }
                else {
                    //moreMordred.startAnimation(slideUp);
                    moreMordred.setVisibility(View.GONE);
                }
            }
        });

        showMordred.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showMordred.isChecked()) {
                    //moreMordred.startAnimation(slideDown);
                    moreMordred.setVisibility(View.VISIBLE);
                }
                else {
                    //moreMordred.startAnimation(slideUp);
                    moreMordred.setVisibility(View.GONE);
                }
            }
        });

        showMorgana.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showMorgana.isChecked()) {
                    //moreMorgana.startAnimation(slideDown);
                    moreMorgana.setVisibility(View.VISIBLE);
                }
                else {
                    //moreMorgana.startAnimation(slideUp);
                    moreMorgana.setVisibility(View.GONE);
                }
            }
        });

        showOberon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showOberon.isChecked()) {
                    //moreOberon.startAnimation(slideDown);
                    moreOberon.setVisibility(View.VISIBLE);
                }
                else {
                    //moreOberon.startAnimation(slideUp);
                    moreOberon.setVisibility(View.GONE);
                }
            }
        });

        showLancelot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showLancelot.isChecked()) {
                    //moreLancelot.startAnimation(slideDown);
                    moreLancelot.setVisibility(View.VISIBLE);
                }
                else {
                    //moreLancelot.startAnimation(slideUp);
                    moreLancelot.setVisibility(View.GONE);
                }
            }
        });

        showVoting.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showVoting.isChecked()) {
                    //moreLancelot.startAnimation(slideDown);
                    moreVoting.setVisibility(View.VISIBLE);
                }
                else {
                    //moreLancelot.startAnimation(slideUp);
                    moreVoting.setVisibility(View.GONE);
                }
            }
        });

        showMissions.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showMissions.isChecked()) {
                    //moreLancelot.startAnimation(slideDown);
                    moreMissions.setVisibility(View.VISIBLE);
                }
                else {
                    //moreLancelot.startAnimation(slideUp);
                    moreMissions.setVisibility(View.GONE);
                }
            }
        });

        showLady.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showLady.isChecked()) {
                    //moreLancelot.startAnimation(slideDown);
                    moreLady.setVisibility(View.VISIBLE);
                }
                else {
                    //moreLancelot.startAnimation(slideUp);
                    moreLady.setVisibility(View.GONE);
                }
            }
        });

        showExcalibur.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (showExcalibur.isChecked()) {
                    //moreLancelot.startAnimation(slideDown);
                    moreExcalibur.setVisibility(View.VISIBLE);
                }
                else {
                    //moreLancelot.startAnimation(slideUp);
                    moreExcalibur.setVisibility(View.GONE);
                }
            }
        });
    }

    private void play() {
        Intent goPlay = new Intent(getApplicationContext(), Game_Setup.class);
        startActivity(goPlay);
    }

    private void home() {
        Intent goHome = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(goHome);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_directions, menu);
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
