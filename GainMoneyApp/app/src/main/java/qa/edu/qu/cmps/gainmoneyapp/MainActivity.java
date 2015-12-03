

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

package qa.edu.qu.cse.cmps497.gainmoney;

        import android.app.AlertDialog;
        import android.app.DatePickerDialog;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.DatePicker;

        import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    final static String TAG ="GainMoney";
    private static Button newCvButton;
    private static Button hDButton;
    private static Button uDButton;
    private static Button uploadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newCvButton = (Button)findViewById(R.id.button1);
        hDButton    = (Button)findViewById(R.id.button2);
        uDButton    = (Button)findViewById(R.id.button3);
        uploadButton= (Button)findViewById(R.id.button4);
        newCvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "New CV buttoen select");
                Intent intent = new Intent();
                intent.setClass(MainActivity.this ,NewCV.class);// I don't have nay idea whay it work with this
                startActivity(intent);
            }
        });
        // onClickButtonListener();
    }

    public void onClickButtonListener(){

       /* hDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("qa.edu.qu.cmps.project.NewCV");
                startActivity(intent);
            }
        });
        uDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("qa.edu.qu.cmps.project.NewCV");
                startActivity(intent);
            }
        });
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("qa.edu.qu.cmps.project.NewCV");
                startActivity(intent);
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Log.i(TAG,"in onOptionsItemSelected item ="+item.getTitle());
        switch (item.getItemId()) {
            case R.id.about_menu:
                launchAboutDialog();
                return true;
            case R.id.help_menu:
                launchHelpDialog();
                return true;
            default: return false;
        }
    }

    private void launchAboutDialog() {
        AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(this);
        LayoutInflater LI2 = getLayoutInflater();
        alertDialog2.setView(LI2.inflate(R.layout.about_layout, null));
        alertDialog2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.i(TAG, "OK is clicked in about");
            }
        });
        alertDialog2.show();
    }

    private void launchHelpDialog() {
        AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(this);
        LayoutInflater LI = getLayoutInflater();
        alertDialog1.setView(LI.inflate(R.layout.help_layout, null));
        alertDialog1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.i(TAG, "OK is clicked in help");
            }
        });

        alertDialog1.show();
    }



    private void launchApplyDialog(){
        AlertDialog.Builder alertDialog3 = new AlertDialog.Builder(this);
        LayoutInflater LI = getLayoutInflater();
        alertDialog3.setView(LI.inflate(R.layout.apply_layout, null));
        alertDialog3.show();
    }

    public void datePickerDialogClicked(View view) {
        Calendar c = Calendar.getInstance();

        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            }
        }, c.get(Calendar.YEAR),c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        dialog.show();
    }
}
