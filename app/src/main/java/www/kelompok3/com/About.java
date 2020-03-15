package www.kelompok3.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import www.kelompok3.com.app.R;


public class About extends AppCompatActivity {
    ImageView back;
    TextView text;
    private String isi="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        text = (TextView) findViewById(R.id.textisi);
        back = (ImageView) findViewById(R.id.back);

        isi += "\n Aplikasi Sistem Pakar Penyakit pada Gigi";
        isi += "\n Metode Forward Chaining ";
        isi += "\n";
        isi += "\n Di Persembahkan oleh Kelompok 3";
        isi += "\n Arie Samsudin";
        isi += "\n Moh. Deni Slamet";
        isi += "\n Hafis Yusuf";
        isi += "\n Putri Haryani";
        isi += "\n Asep Widiyotomo";
        isi += "\n";
        isi += "\n Untuk Tugas Terakhir Mata Kuliah";
        isi += "\n Sistem Berbasih Pengetahuan";
        isi += "\n Universitas Indraprasta PGRI";
        text.setText(isi);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(About.this,MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }
}
