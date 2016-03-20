package dkolodzey.tracktask1;

import android.graphics.Color;
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
        public View itemLayoutView;
        public ViewHolder(View v) {
            super(v);
            this.itemLayoutView = v;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_list_item, parent, false);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String myColor = ((position + 1) % 2 == 0) ? "#aaaaaa" : "#ffffff"; //position + 1 = starting from 1, not from 0
        holder.itemLayoutView.setBackgroundColor(Color.parseColor(myColor));
        TextView mTextView = (TextView) holder.itemLayoutView.findViewById(R.id.text);
        mTextView.setText(getContent(position));
    }

    @Override
    public int getItemCount() {
        return 1000000;
    }

    private String getContent(Integer position) {
        return position.toString() + " элемент списка";
    }

}
