package www.kelompok3.com;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import www.kelompok3.com.app.R;

public class Hasil extends AppCompatActivity {
    ImageView back;
    TextView Penyakit,Gejala,Solusi;
    Button Home,Detail;
    String solusi,http;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        Solusi = (TextView) findViewById(R.id.txSolusi);
        Gejala = (TextView) findViewById(R.id.txHasilGejala);
        Penyakit= (TextView) findViewById(R.id.txHasilPenya);
        back    = (ImageView) findViewById(R.id.back);
        Home    = (Button) findViewById(R.id.btHome);
        Detail  = (Button) findViewById(R.id.btDetail);

        String gejala = getIntent().getStringExtra("ge");
        String penyakit = getIntent().getStringExtra("pe");

        if(penyakit.equalsIgnoreCase("Erosi Gigi")){
            solusi = "1. Berkumur air hangat untuk mengeluarkan sisa makanan yang tersangkut pada lubang. Gunakan benang gigi untuk mengangkat makanan yang tersangkut pada lubang atau pada sela-sela gigi."+
                    "\n \n 2. Jangan meletakkan aspirin pada gigi yang sakit atau jaringan gusi.";
            http = "https://hellosehat.com/kesehatan/penyakit/penyakit-erosi-gigi/";
        }else if(penyakit.equalsIgnoreCase("Ginggivitis")){
            solusi = "1. Rajin menyikat gigi dua kali sehari dan sebelum tidur malam"+
                    "\n \n 2. Bersihkan sela-sela gigi dengan dental floss."+
                    "\n\n 3. Berkumur dengan obat kumur antiseptik (atas anjuran dokter gigi)."+
                    "\n\n 4. Rutin memeriksakan diri ke dokter gigi.";
            http = "https://doktersehat.com/gingivitis/";
        }else  if(penyakit.equalsIgnoreCase("Pulpitis")){
            solusi = "1. Hindari makanan yang terlalu panas atau dingin."+
                    "\n\n 2. Tingkatkan kebersihan mulut dengan menyikat gigi setelah makan, namun jangan menggosok gigi terlalu keras sebab bisa berdampak buruk.";
            http = "https://hellosehat.com/kesehatan/penyakit/pulpitis-adalah/";
        }else if(penyakit.equalsIgnoreCase("Abses Gigi")){
            solusi = "1. Sikat gigi 2 kali sehari dengan pasta gigi yang mengandung fluoride."+
                    "\n\n 2. Gunakan benang gigi atau dental floss untuk membersihkan sela-sela gigi setiap hari."+
                    "\n\n 3. Ganti sikat gigi secara rutin setiap 3 bulan sekali."+
                    "\n\n 4. Hindari menggunakan obat kumur setelah menyikat gigi karena dapat menghilangkan manfaat pasta gigi.";
            http = "https://www.alodokter.com/abses-gigi";
        }else if(penyakit.equalsIgnoreCase("Periodontitis")){
            solusi = "1. Menjaga kebersihan gigi agar terbebas dari bakteri yang menyebabkannya."+
                    "\n\n 2. Gosoklah gigi tiap selesai makan atau paling tidak 2 kali sehari, yaitu di waktu pagi hari dan malam hari menjelang tidur. "+
                    "\n\n 3. Gunakan sikat gigi yang lembut, dan ganti sikat gigi setelah dipakai selama 3-4 bulan.";
            http = "https://www.alodokter.com/periodontitis";
        }else if(penyakit.equalsIgnoreCase("Karies Gigi")){
            solusi = "1. Menyikat gigi dan menggunakan benang gigi"+
                    "\n\n 2. Berkumur menggunakan air garam"+
                    "\n\n 3. Kurangi konsumsi camilan dan minuman selain air putih"+
                    "\n\n 4. Konsumsi makanan yang menyehatkan gigi";
            http = "https://www.alodokter.com/jangan-sampai-terlambat-cegah-karies-gigi-sekarang-juga";
        }else if(penyakit.equalsIgnoreCase("Halitosis")){
            solusi = "1. Perhatikan pola dan menu makan."+
                    "\n\n 2. Bersihkan mulut secara rutin. Jaga kebersihan mulut dengan rajin menggosok gigi. Lakukan juga pembersihan pada lidah untuk menghilangkan bakteri yang ada pada permukaannya."+
                    "\n\n 3. Lakukan pemeriksaan rutin ke dokter gigi, terutama bagi yang memasang gigi palsu atau kawat gigi."+
                    "\n\n 4. Berhenti merokok dan mengonsumsi alkohol.";
            http = "https://www.alodokter.com/bau-mulut-halitosis";
        }else if(penyakit.equalsIgnoreCase("Sindrom Gigi Retak")){
            solusi = "1. Tambal gigi"+
                    "\n\n 2. Pemasangan crown gigi"+
                    "\n\n 3. Cabut gigi";
            http = "https://www.alodokter.com/kenali-beragam-penyebab-gigi-retak-dan-cara-mengatasinya";
        }else if(penyakit.equalsIgnoreCase("Temporomandi Bular Joint")){
            solusi = "1. Pilihlah makanan yang lunak. Potong makanan agar menjadi lebih kecil."+
                    "\n\n 2. Gunakan es batu atau air hangat untuk mengompres bagian yang sakit."+
                    "\n\n 3. Kurangi konsumsi kafein, baik teh maupun kopi."+
                    "\n\n 4. Menghindari konsumsi makanan yang kenyal atau lengket seperti permen karet.";
            http = "https://www.alodokter.com/berbagai-penyebab-sakit-rahang-dan-cara-mengatasinya";
        }else if (penyakit.equalsIgnoreCase("Angina Ludwig")){
            solusi = "1. Jangan lupa untuk rutin menggosok gigi setiah hari dua kali sehari, pada pagi hari setelah makan dan malam hari sebelum tidur."+
                    "\n\n 2. Kurangi makanan yang bisa melukai gigi, gusi, lidah, atau mulut, misalnya makanan terlalu panas atau terlalu keras dan kasar."+
                    "\n\n 3. Penuhi kebutuhan vitamin C yang melindungi Anda dari sariawan sekaligus meningkatkan sistem kekebalan tubuh terhadap bakteri dan virus. Kemudian, cek gigi ke dokter gigi secara rutin minimal 6 bulan sekali.";
            http = "https://hellosehat.com/hidup-sehat/fakta-unik/benjolan-berisi-nanah-di-leher/";
        }



        Gejala.setText(gejala);
        Penyakit.setText(penyakit);
        Solusi.setText(solusi);

        Detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(http));
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hasil.this,MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hasil.this,MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }
}
