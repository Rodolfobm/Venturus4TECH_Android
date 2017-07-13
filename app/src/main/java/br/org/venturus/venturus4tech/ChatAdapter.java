package br.org.venturus.venturus4tech;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vntguca on 12/07/17.
 */

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private String[] mData = {"Oi, tudo bem?", "Nossa, o app tá ficando legal!", "Podemos melhorar mais ainda?", "Alguem tem alguma sugestão???"};

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public TextView mUserInitial;
        public TextView mUsername;
        public TextView mMessage;
        public TextView mTime;


        public ViewHolder(View v) {
            super(v);
            itemView = v;
            mUserInitial = (TextView) v.findViewById(R.id.userInitial);
            mUsername = (TextView) v.findViewById(R.id.user);
            mMessage = (TextView) v.findViewById(R.id.message);
            mTime = (TextView) v.findViewById(R.id.time);
        }
    }

    public ChatAdapter() {
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mMessage.setText(mData[position]);

    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

}
