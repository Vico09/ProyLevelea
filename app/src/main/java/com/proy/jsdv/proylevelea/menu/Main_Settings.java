package com.proy.jsdv.proylevelea.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.proy.jsdv.proylevelea.AboutActivty;
import com.proy.jsdv.proylevelea.R;





public class Main_Settings extends Fragment {
    private Switch OppState;
    private Button btnAbout;



    public static final String ARG_SECTION_TITLE = "section_number";

    public static Main_Settings newInstance(String sectionTitle) {
        Main_Settings fragment = new Main_Settings();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public Main_Settings() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_main__settings, container, false);


        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        OppState = (Switch) view.findViewById(R.id.oppSta);

        OppState.setChecked(true);

        OppState.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getActivity().getApplicationContext(), "Active", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity().getApplicationContext(), "Inactive", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnAbout = (Button) view.findViewById(R.id.aboutApp);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),AboutActivty.class);
                startActivity(i);
            }
        });



    }






}

