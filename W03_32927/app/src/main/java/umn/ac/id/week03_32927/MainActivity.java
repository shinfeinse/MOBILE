package umn.ac.id.week03_32927;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity
{

    private final LinkedList<String> mDaftarKata = new LinkedList<>();
//    @Override

    private RecyclerView mRecyclerView;
    private DaftarKataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int jumlahKata = mDaftarKata.size() ;
                mDaftarKata.addLast("Kata " + (jumlahKata + 1) + " telah ditambahkan");
                Objects.requireNonNull
                        (mRecyclerView.getAdapter()).notifyItemInserted(jumlahKata);
                mRecyclerView.smoothScrollToPosition(jumlahKata);
            }
        });

        for (int i = 0; i < 21; i++)
        {
            mDaftarKata.add("Kata " + i);
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new DaftarKataAdapter(this, mDaftarKata);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}