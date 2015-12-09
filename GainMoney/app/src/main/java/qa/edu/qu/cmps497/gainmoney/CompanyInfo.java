package qa.edu.qu.cmps497.gainmoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CompanyInfo extends AppCompatActivity {

    final static String TAG = "GainMoney";
    private static Button newCV ;
    private static Button upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_info);

        newCV = (Button)findViewById(R.id.button1);
        upload= (Button)findViewById(R.id.button4);

        newCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "New CV button selected");

                intent.setClass(CompanyInfo.this, NewCV.class);// I don't have nay idea whay it work with this
                startActivity(intent);
            }
        });

    }
}
