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


public class LogInFragment extends Fragment {
    private static final String LOG_IN_FRAGMENT_TAG = "log_in_frag";
    private Button logInBtn;
    private Button cancelBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_log_in, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        logInBtn = (Button) view.findViewById(R.id.bn_log_in);
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }

        });
        cancelBtn = (Button) view.findViewById(R.id.bn_cancel1);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleCancelLogInFragment();
            }
        });
    }

    private void toggleCancelLogInFragment() {
        Fragment f = getFragmentManager().findFragmentByTag(LOG_IN_FRAGMENT_TAG);
        if (f != null) {
            getFragmentManager().popBackStack();
        } else {
            getFragmentManager().beginTransaction()
                    .setCustomAnimations(R.animator.slide_down,
                            R.animator.slide_up,
                            R.animator.slide_down,
                            R.animator.slide_up)
                    .add(R.id.log_in_frag, LogInFragment
                                    .instantiate(getActivity(), LogInFragment.class.getName()),
                            LOG_IN_FRAGMENT_TAG
                    ).addToBackStack(null).commit();
        }
    }
}
