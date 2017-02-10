package com.example.jon_thornburg.traillocator.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.jon_thornburg.traillocator.R;

/**
 * Created by jon_thornburg on 2/10/17.
 */

public class InitialFragment extends Fragment {

    public static final String TAG = InitialFragment.class.getSimpleName();

    private View mView;
    private RecyclerView mRecyclerView;
    private EditText mEditText;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.initial_fragment, container, false);

        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public static final InitialFragment createNew() {
        InitialFragment frag = new InitialFragment();
        return frag;
    }
}
