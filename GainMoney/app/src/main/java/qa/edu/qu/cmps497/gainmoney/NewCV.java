package qa.edu.qu.cmps497.gainmoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class NewCV extends AppCompatActivity {

    final static String TAG ="GainMoney";
    private static Button nextButton;
    private static Button saveButton;

    private static TextView fn;
    private static EditText firstName;

    private static TextView mn;
    private static EditText middleName;

    private static TextView ln;
    private static EditText lastName;

    private static TextView gender;
    private static RadioButton female;
    private static RadioButton male;

    private static TextView pob;
    private static EditText placeOfBirth;

    private static TextView nationality;
    private static Spinner Nationality;

    private static TextView adress1;
    private static EditText address1;

    private static TextView mobile;
    private static EditText mobileNum;

    private static TextView email;
    private static EditText emailAddress;

    private static TextView pobox;
    private static EditText poBox;

    private static TextView extraInfo;
    private static MultiAutoCompleteTextView multiAutoCompleteTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_cv);

        nextButton = (Button)findViewById(R.id.button5);
        saveButton = (Button)findViewById(R.id.button6);

        fn          = (TextView)findViewById(R.id.fn);
        firstName   = (EditText)findViewById(R.id.firstName);

        mn          = (TextView)findViewById(R.id.mn);
        middleName  = (EditText)findViewById(R.id.middleName);

        ln          = (TextView)findViewById(R.id.ln);
        lastName    = (EditText)findViewById(R.id.lastName);

        gender      = (TextView)findViewById(R.id.gender);
        female      = (RadioButton)findViewById(R.id.female);
        male        = (RadioButton)findViewById(R.id.male);

        pob         = (TextView)findViewById(R.id.pob);
        placeOfBirth= (EditText)findViewById(R.id.placeOfBirth);

        nationality = (TextView)findViewById(R.id.nationality);
        Nationality = (Spinner)findViewById(R.id.Nationality);

        adress1     = (TextView)findViewById(R.id.adress1);
        address1    = (EditText)findViewById(R.id.address1);

        mobile      = (TextView)findViewById(R.id.mobile);
        mobileNum   = (EditText)findViewById(R.id.mobileNum);

        email       = (TextView)findViewById(R.id.email);
        emailAddress= (EditText)findViewById(R.id.emailAddress);

        pobox       = (TextView)findViewById(R.id.pobox);
        poBox       = (EditText)findViewById(R.id.poBox);

        extraInfo   = (TextView)findViewById(R.id.extraInfo);
        multiAutoCompleteTextView=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Next button select");

                fn.setVisibility(View.GONE);
                firstName.setVisibility(View.GONE);

                mn.setVisibility(View.GONE);
                middleName.setVisibility(View.GONE);

                ln.setVisibility(View.GONE);
                lastName.setVisibility(View.GONE);

                gender.setVisibility(View.GONE);
                female.setVisibility(View.GONE);
                male.setVisibility(View.GONE);

                pob.setVisibility(View.GONE);
                placeOfBirth.setVisibility(View.GONE);

                Nationality.setVisibility(View.GONE);
                nationality.setVisibility(View.GONE);

                nextButton.setVisibility(View.GONE);

                adress1.setVisibility(View.VISIBLE);
                address1.setVisibility(View.VISIBLE);

                mobile.setVisibility(View.VISIBLE);
                mobileNum.setVisibility(View.VISIBLE);

                email.setVisibility(View.VISIBLE);
                emailAddress.setVisibility(View.VISIBLE);

                pobox.setVisibility(View.VISIBLE);
                poBox.setVisibility(View.VISIBLE);

                extraInfo.setVisibility(View.VISIBLE);
                multiAutoCompleteTextView.setVisibility(View.VISIBLE);

                saveButton.setVisibility(View.VISIBLE);

            }
        });
    }
}
