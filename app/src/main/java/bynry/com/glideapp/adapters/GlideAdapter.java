package bynry.com.glideapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;

import java.util.ArrayList;

import bynry.com.glideapp.R;
import bynry.com.glideapp.models.ImageUrls;

import static android.media.CamcorderProfile.get;

public class GlideAdapter extends RecyclerView.Adapter<GlideAdapter.GlideHolder> {

    private Context mContext;
    private ArrayList<ImageUrls> mUrls;
    private RequestManager glide;


    public GlideAdapter(Context context, ArrayList<ImageUrls> imageurls, RequestManager glide) {
        this.mContext = context;
        this.mUrls = imageurls;
        this.glide = glide;
    }
    @NonNull
    @Override
    public GlideHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_image, null);
        GlideAdapter.GlideHolder viewHolder = new GlideAdapter.GlideHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GlideHolder glideHolder, int i) {

        ImageUrls imageUrls = mUrls.get(i);
        glide.load(imageUrls.imgUri).into(glideHolder.imgView);

    }

    @Override
    public int getItemCount() {
        return mUrls.size();
    }

    public class GlideHolder extends RecyclerView.ViewHolder {

        ImageView imgView;
        public GlideHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.img_view);
        }
    }
}
