package com.jaimetoqu.myworld.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jaimetoqu.myworld.R;
import com.jaimetoqu.myworld.models.Job;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaime on 7/15/17.
 */

public class JobsAdapter extends RecyclerView.Adapter<JobsAdapter.ViewHolder> {

    private List<Job> jobList;
    private Context context;

    public JobsAdapter(List<Job> jobList, Context context) {
        this.jobList = jobList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_jobs, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.setJob(String.valueOf(jobList.get(position).getId()), jobList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return jobList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;

        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.titleTv);
            description = (TextView) itemView.findViewById(R.id.descriptionTv);

        }

        private void setJob(String name, String descrip) {
            title.setText(name);
            description.setText(descrip);
        }
    }
}
