package com.example.appbanking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Contact[] localDataSet;
    private TextView textView12;
    private TextView textView13;
    private TextView textView14;
    Context context;
    private OnRecyclerViewClickListener listener;
    public interface OnRecyclerViewClickListener{
        void OnItemClick(int position);
    }
    public void OnRecyclerViewClickListener (OnRecyclerViewClickListener listener){
        this.listener=listener;
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;


        public ViewHolder( View view,OnRecyclerViewClickListener listener) {
            super(view);
            // Define click listener for the ViewHolder's View

            textView = (TextView) view.findViewById(R.id.textView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null&&getAdapterPosition()!=RecyclerView.NO_POSITION){
                        listener.OnItemClick(getAdapterPosition());
                    }
                }
            });
        }

        public TextView getTextView() {
            return textView;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     *                by RecyclerView.
     */
    public CustomAdapter(Contact[] dataSet, Context context) { localDataSet = dataSet;
  this.context=context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);
        textView12=view.findViewById(R.id.textView12) ;
        textView13=view.findViewById(R.id.textView13);
        textView14=view.findViewById(R.id.textView14);

        return new ViewHolder(view,listener);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder( ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        final Contact temp=localDataSet[position];
        textView12.setText(localDataSet[position].name);
        textView13.setText(localDataSet[position].email_id);
        textView14.setText(localDataSet[position].current_balance);


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {

        return localDataSet.length;
    }
}

