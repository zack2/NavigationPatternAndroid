package imbcomgo.com.navigationpatternandroid;


import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeuxiemeFragment extends Fragment {
    private static final String TAG = DeuxiemeFragment.class.getSimpleName();

    public DeuxiemeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deuxieme, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.tv);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String message = bundle.getString("argument");
            textView.setText(message);
        }

        view.findViewById(R.id.btn_f2).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.fragment_3));
    }
}
