package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import qa.edu.qu.cmps497.gainmoney.R;

/**
 * Created by Abeer on 12/3/2015.
 */
public class CompanyFragment extends Fragment{
    String CompanyName;

    public static CompanyFragment newInstance(String CN) {
        CompanyFragment companyFragment = new CompanyFragment();
        Bundle bundle = new Bundle();

        bundle.putString("CompanyName", CN);

        companyFragment.setArguments(bundle);
        return companyFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            CompanyName = getArguments().getString("CompanyName");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_company, container, false);
        TextView cn = (TextView)view.findViewById(R.id.companyName);
        cn.setText(CompanyName);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
