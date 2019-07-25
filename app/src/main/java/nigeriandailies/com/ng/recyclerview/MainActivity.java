package nigeriandailies.com.ng.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//logt
    private static final String TAG = "MainActivity";

//    variables
    private ArrayList<String> mNames = new ArrayList<>();
    private  ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started. ");

        initImageBitmaps();

    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps. ");
        mImageUrls.add("https://images.unsplash.com/photo-1496203695688-3b8985780d6a?ixlib=rb-1.2.1&auto=format&fit=crop&w=641&q=80");
        mNames.add("Rose");
        mImageUrls.add("https://unsplash.com/photos/YRgPxwbvY0E");
        mNames.add("Mabel");

        mImageUrls.add("https://unsplash.com/photos/C6CVXJMXwqs");
        mNames.add("Lily");

        mImageUrls.add("https://unsplash.com/photos/40hkGAlW0Wo");
        mNames.add("Tna");

        mImageUrls.add("https://unsplash.com/photos/sycOtFg3SBc");
        mNames.add("Kul");

        mImageUrls.add("https://unsplash.com/photos/lIHuN0IgE_k");
        mNames.add("Rea");

        mImageUrls.add("https://unsplash.com/photos/WBpr_yH0Frg");
        mNames.add(" Red Rose");

        mImageUrls.add("https://unsplash.com/photos/NOcaza8sIBg");
        mNames.add("Reg");

        mImageUrls.add("https://unsplash.com/photos/Fj1YrTXNodk");
        mNames.add("Titan");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG,"initRecyclerView: init recyclerview. ");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



}
