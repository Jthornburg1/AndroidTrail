package com.example.jon_thornburg.traillocator.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jon_thornburg on 2/10/17.
 */

public class InitialFragmentAdapter extends RecyclerView.Adapter<InitialFragmentAdapter.TrailViewHolder> {

    @Override
    public InitialFragmentAdapter.TrailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(InitialFragmentAdapter.TrailViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class TrailViewHolder extends RecyclerView.ViewHolder {

        private TextView titleTextView;
        private TextView cityStateTextView;
        private TextView descriptionTextView;

        public TrailViewHolder(View itemView) {
            super(itemView);
        }
    }
}
