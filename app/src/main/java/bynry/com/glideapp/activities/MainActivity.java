package bynry.com.glideapp.activities;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import bynry.com.glideapp.R;
import bynry.com.glideapp.adapters.GlideAdapter;
import bynry.com.glideapp.models.ImageUrls;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ImageUrls> mUrls;
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        mUrls = new ArrayList<>();
       mUrls.add(new ImageUrls("https://images.idgesg.net/images/article/2018/05/ios11-app-store-icon-100759773-large.jpg"));
        mUrls.add(new ImageUrls("https://kfa.co.uk/wp-content/uploads/User-Interface.png"));
        mUrls.add(new ImageUrls("https://cdn.lynda.com/course/578080/578080-636447067313434671-16x9.jpg"));
        mUrls.add(new ImageUrls("https://www.oracle.com/us/assets/cw22-oracle-cloud-applications-3558872.jpg"));
        mUrls.add(new ImageUrls("https://visualstudio.microsoft.com/wp-content/uploads/2016/06/Mobile_Apps-3-562x309@2x-op-1.png"));
        mUrls.add(new ImageUrls("https://support.apple.com/content/dam/edam/applecare/images/en_US/appleapps/content-link-icon-clips_2x.jpg"));
        mUrls.add(new ImageUrls("https://images.idgesg.net/images/article/2018/05/ios11-app-store-icon-100759773-large.jpg"));
        mUrls.add(new ImageUrls("https://kfa.co.uk/wp-content/uploads/User-Interface.png"));
        mUrls.add(new ImageUrls("https://cdn.lynda.com/course/578080/578080-636447067313434671-16x9.jpg"));
        mUrls.add(new ImageUrls("https://www.oracle.com/us/assets/cw22-oracle-cloud-applications-3558872.jpg"));
        mUrls.add(new ImageUrls("https://visualstudio.microsoft.com/wp-content/uploads/2016/06/Mobile_Apps-3-562x309@2x-op-1.png"));
        mUrls.add(new ImageUrls("https://support.apple.com/content/dam/edam/applecare/images/en_US/appleapps/content-link-icon-clips_2x.jpg"));
        recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext);
        recyclerView.setLayoutManager(layoutManager);
        GlideAdapter glideAdapter = new GlideAdapter(mContext, mUrls,Glide.with(mContext));
        recyclerView.setAdapter(glideAdapter);





        /*Glide.with(this)
                .load(mUrls)
                .into(imgView);*/
    }
}
