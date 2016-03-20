package dkolodzey.tracktask1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by DKolodzey on 20.03.16.
 */
public class MyAdapter extends android.support.v7.widget.RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_list_item, parent, false);
        return new ViewHolder((TextView)v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(getContent(position));
    }

    @Override
    public int getItemCount() {
        return 1000000;
    }

    private String getContent(Integer position) {
        return position.toString();
    }

}
