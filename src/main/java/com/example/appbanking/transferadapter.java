package com.example.appbanking;




import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

            public class transferadapter extends RecyclerView.Adapter<transferadapter.ViewHolder> {

                private transfer[] localDataSet;
                private TextView textView3;

                Context context;
                private OnRecyclerViewClickListener listener1;
                public interface OnRecyclerViewClickListener{
                    void OnItemClick(int position);
                }
                public void OnRecyclerViewClickListener (OnRecyclerViewClickListener listener1){
                    this.listener1=listener1;
                }

                /**
                 * Provide a reference to the type of views that you are using
                 * (custom ViewHolder).
                 */
                public static class ViewHolder extends RecyclerView.ViewHolder {
                    private final TextView textView;


                    public ViewHolder(View view,OnRecyclerViewClickListener listener1) {
                        super(view);
                        // Define click listener for the ViewHolder's View

                        textView = (TextView) view.findViewById(R.id.textView);
                        itemView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(listener1!=null&&getAdapterPosition()!=RecyclerView.NO_POSITION){
                                    listener1.OnItemClick(getAdapterPosition());
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
                public transferadapter(transfer[] dataSet, Context context) { localDataSet = dataSet;
                    this.context=context;
                }

                // Create new views (invoked by the layout manager)
                @Override
                public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
                    // Create a new view, which defines the UI of the list item
                    View view = LayoutInflater.from(viewGroup.getContext())
                            .inflate(R.layout.transfer_layout, viewGroup, false);
                    textView3=view.findViewById(R.id.textView3) ;


                    return new ViewHolder(view, listener1);
                }

                // Replace the contents of a view (invoked by the layout manager)
                @Override
                public void onBindViewHolder(ViewHolder viewHolder, final int position) {

                    // Get element from your dataset at this position and replace the
                    // contents of the view with that element
                    textView3.setText(localDataSet[position].name);



                }

                // Return the size of your dataset (invoked by the layout manager)
                @Override
                public int getItemCount() {

                    return localDataSet.length;
                }
            }

