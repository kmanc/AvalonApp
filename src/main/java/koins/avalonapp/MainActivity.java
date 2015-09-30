package koins.avalonapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button begButton = (Button) findViewById(R.id.BeginnerButton);
        final Button advButton = (Button) findViewById(R.id.AdvancedButton);
        begButton.setOnClickListener(this);
        advButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.BeginnerButton:
                directions();
                break;
            case R.id.AdvancedButton:
                setup();
                break;
        }
    }

    private void directions() {
        Intent directions = new Intent(getApplicationContext(), Directions.class);
        startActivity(directions);
    }

    private void setup() {
        Intent setup = new Intent(getApplicationContext(), Game_Setup.class);
        startActivity(setup);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
