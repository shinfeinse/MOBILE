package umn.ac.id.w11_32927;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    ArrayList<RetrofitModel> posts;

    public PostAdapter(ArrayList<RetrofitModel> posts){ this.posts = posts; }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.tvTitle.setText(posts.get(position).getTitle());
        holder.tvBody.setText(posts.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvBody;

        public PostViewHolder(@NonNull View itemView){
            super(itemView);

            tvBody = itemView.findViewById(R.id.tvBody);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }
    }
}

