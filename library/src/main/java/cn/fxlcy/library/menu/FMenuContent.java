package cn.fxlcy.library.menu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fxlcy on 2017/5/20.
 */

public class FMenuContent<T> {
    private Context mContext;
    private RecyclerView mRecyclerView;
    private List<T> mItems;

    public FMenuContent(Context context, List<T> data) {
        mContext = context;
        mRecyclerView = new RecyclerView(context);
        mItems = data;
    }

    void setDefaultAdapter() {
        mRecyclerView.setAdapter(new RecyclerView.Adapter<FMenuItemDefaultViewHolder>() {
            @Override
            public FMenuItemDefaultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View itemView = LayoutInflater.from(mContext).inflate(viewType, parent, false);
                return new FMenuItemDefaultViewHolder(itemView, viewType);
            }

            @Override
            public void onBindViewHolder(FMenuItemDefaultViewHolder holder, int position) {
                FMenuItem item = (FMenuItem) mItems.get(position);

                final TextView text = holder.text;
                text.setText(item.text);

                if (item.textColor != null) {
                    text.setTextColor(item.textColor);
                }
                if (item.textSize != -1) {
                    text.setTextSize(item.textSize);
                }
                if (item.background != -1) {
                    text.setBackgroundResource(item.background);
                }

                if (item.icon != -1) {
                    final ImageView icon = holder.icon;
                    icon.setImageResource(item.icon);
                }
            }

            @Override
            public int getItemCount() {
                return mItems.size();
            }

            @Override
            public int getItemViewType(int position) {
                FMenuItem item = (FMenuItem) mItems.get(position);
                return item.icon == -1 ? R.layout.item_context_menu_text : R.layout.item_context_menu_text_and_image;
            }
        });
    }

    public <VH extends RecyclerView.ViewHolder> void setMenuAdapter(RecyclerView.Adapter<VH> adapter) {
        mRecyclerView.setAdapter(adapter);
    }


    /**
     * 默认视图的ViewHolder
     */
    private final static class FMenuItemDefaultViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView icon;

        FMenuItemDefaultViewHolder(View itemView, int itemType) {
            super(itemView);

            if (itemType == R.layout.item_context_menu_text) {
                text = (TextView) itemView;

            } else if (itemType == R.layout.item_context_menu_text_and_image) {
                icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                text = (TextView) itemView.findViewById(R.id.tv_content);

            }
        }
    }
}
