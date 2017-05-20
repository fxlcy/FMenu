package cn.fxlcy.library.menu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by fxlcy on 2017/5/20.
 */

public class FMenuContent {
    private Context mContext;
    private RecyclerView mRecyclerView;

    public FMenuContent(Context context) {
        mContext = context;
        mRecyclerView = new RecyclerView(context);
    }

    void setDefaultAdapter() {
        mRecyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            }

            @Override
            public int getItemCount() {
                return 0;
            }
        });
    }

    public <VH extends RecyclerView.ViewHolder> void setMenuAdapter(RecyclerView.Adapter<VH> adapter) {
        mRecyclerView.setAdapter(adapter);
    }


    final static class FMenuItemDefaultViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;

        public FMenuItemDefaultViewHolder(View itemView) {
            super(itemView);

        }
    }
}
