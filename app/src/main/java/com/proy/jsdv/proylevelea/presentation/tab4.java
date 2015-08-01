package com.proy.jsdv.proylevelea.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.proy.jsdv.proylevelea.R;
import com.proy.jsdv.proylevelea.menu.MainActivity;


public class tab4 extends Fragment {
    Button btnReg;
    Button btnLogIn;
    Button continueBtn;
    EditText txtName;
    EditText txtLastName;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_logreg, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnLogIn = (Button)view.findViewById(R.id.BtnLogin);
        btnReg = (Button)view.findViewById(R.id.BtnRegister);
        continueBtn = (Button)view.findViewById(R.id.continue_btn);
        txtName=(EditText) view.findViewById(R.id.TextName);
        txtLastName=(EditText) view.findViewById(R.id.TextLastName);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName.setVisibility(View.VISIBLE);
                txtLastName.setVisibility(View.VISIBLE);
                continueBtn.setVisibility(View.VISIBLE);
            }
        });
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
            }
        });
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}