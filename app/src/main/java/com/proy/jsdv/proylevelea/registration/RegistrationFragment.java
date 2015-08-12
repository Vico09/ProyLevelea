package com.proy.jsdv.proylevelea.registration;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.proy.jsdv.proylevelea.R;
import com.proy.jsdv.proylevelea.menu.MainActivity;


public class RegistrationFragment extends Fragment {
    private static final String REGISTER_FRAGMENT_TAG = "register_fragment";
    private Button registerBtn;
    private Button cancelBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_registration, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        registerBtn = (Button) view.findViewById(R.id.bn_register);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }

        });
        cancelBtn = (Button) view.findViewById(R.id.bn_cancel2);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFragment();
            }
        });
    }

    private void toggleFragment() {
        Fragment f = getFragmentManager().findFragmentByTag(REGISTER_FRAGMENT_TAG);
        if (f != null) {
            getFragmentManager().popBackStack();
        } else {
            getFragmentManager().beginTransaction()
                    .setCustomAnimations(R.animator.slide_down,
                            R.animator.slide_up,
                            R.animator.slide_down,
                            R.animator.slide_up)
                    .add(R.id.register_fragment, RegistrationFragment
                                    .instantiate(getActivity(), RegistrationFragment.class.getName()),
                            REGISTER_FRAGMENT_TAG
                    )
                    .addToBackStack(null).commit();
        }
    }
}
