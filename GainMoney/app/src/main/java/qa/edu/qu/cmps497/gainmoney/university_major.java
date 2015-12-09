package qa.edu.qu.cmps497.gainmoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class university_major extends AppCompatActivity {

    final static String TAG ="GainMoney";
    private static TextView major;
    private static TextView state;
    private static Button nextButton;
    private static Spinner majors;
    private static Spinner states;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_major);
        major       = (TextView)findViewById(R.id.major);
        state       = (TextView)findViewById(R.id.state);
        nextButton  = (Button)findViewById(R.id.nextButton);
        majors      = (Spinner)findViewById(R.id.major_spinner);
        states      = (Spinner)findViewById(R.id.state_spinner);

    }
}
