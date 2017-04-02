package lossnn.app.android.apphacetiempo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import lossnn.app.android.apphacetiempo.R;

public class TwoFragment extends Fragment {
    TextView textView;
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        textView = (TextView) rootView.findViewById(R.id.texto);
        textView.setText("SEGUNDO FRAGMENT");

        return rootView;
    }

}
