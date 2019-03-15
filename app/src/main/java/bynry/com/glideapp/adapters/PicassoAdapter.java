package bynry.com.glideapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import bynry.com.glideapp.R;
import bynry.com.glideapp.models.ImageUrls;

public class PicassoAdapter extends RecyclerView.Adapter<PicassoAdapter.PicassoHolder> {

    private Context mContext;
    private ArrayList<ImageUrls> mUrls;
    private Picasso picasso;


    public PicassoAdapter(Context context, ArrayList<ImageUrls> imageurls, Picasso picasso) {
        this.mContext = context;
        this.mUrls = imageurls;
        this.picasso = picasso;
    }

    @NonNull
    @Override
    public PicassoAdapter.PicassoHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_image, null);
        PicassoAdapter.PicassoHolder viewHolder = new PicassoAdapter.PicassoHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PicassoAdapter.PicassoHolder picassoHolder, int i) {

        ImageUrls imageUrls = mUrls.get(i);
        Picasso picasso = Picasso.with(mContext);
        picasso.load(imageUrls.imgUri).into(picassoHolder.imgView);

    }

    @Override
    public int getItemCount() {
        return mUrls.size();
    }

    public class PicassoHolder extends RecyclerView.ViewHolder {
        private ImageView imgView;

        public PicassoHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.img_view);
        }
    }
}
