package www.kelompok3.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import www.kelompok3.com.app.R;


public class Mulai extends AppCompatActivity {
    ImageView back;
    TextView tanya,hasil;
    Button ya,tidak;

    String h="";
    HashMap<String,String>gejala=new HashMap<String, String>();
    HashMap<String,String>penyakit=new HashMap<String, String>();
    ArrayList<String>data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        tanya   = (TextView) findViewById(R.id.txTanya);
        hasil   = (TextView) findViewById(R.id.txHasil);
        back    = (ImageView) findViewById(R.id.back);
        ya      = (Button) findViewById(R.id.BtnYa);
        tidak   = (Button) findViewById(R.id.btnTidak);

        gejala.put("G1","Apakah gusi bengkak?");
        gejala.put("G2","Apakah gusi berdarah?");
        gejala.put("G3","Apakah gusi sakit jika disentuh?");
        gejala.put("G4","Apakah mengalami radang pada gusi?");
        gejala.put("G5","Apakah gusi mengkilat?");
        gejala.put("G6","Apakah gigi berlubang?");
        gejala.put("G7","Apakah gigi nyeri?");
        gejala.put("G8","Apakah gigi ngilu?");
        gejala.put("G9","Apakah gigi patah?");
        gejala.put("G10","Apakah bau nafas tidak sedap?");
        gejala.put("G11","Apakah gigi sakit jika makan/minum panas atau dingin?");
        gejala.put("G12","Apakah mulut terasa pahit?");
        gejala.put("G13","Apakah gigi tersa goyang?");
        gejala.put("G14","Apakah nyeri saat melepaskan tekanan gigitan pada objek?");
        gejala.put("G15","Apakah ada benjolan pada gusi?");
        gejala.put("G16","Apakah sakit disekitaran sendi rahang?");
        gejala.put("G17","Apakah sakit disekitar telingan?");
        gejala.put("G18","Apakah kesulitan menelan makanan?");
        gejala.put("G19","Apakah sakit disekitar wajah?");
        gejala.put("G20","Apakah ada suara cliking ketika mengunyah makanan atau membuka mulut?");
        gejala.put("G21","Apakah rahang bagian mulut sulit dibuka atau ditutup?");
        gejala.put("G22","Apakah sakit disekitar kepala?");
        gejala.put("G23","Apakah gigitan tersa tidak pas?");
        gejala.put("G24","Apakah sakit dan membengkak pada leher?");
        gejala.put("G25","Apakah leher menjadi merah?");
        gejala.put("G26","Apakah badan menjadi demam?");
        gejala.put("G27","Apakah badan terasa lemah?");
        gejala.put("G28","Apakah badan terasa lesu?");
        gejala.put("G29","Apakah badan menjadi mudah capek?");
        gejala.put("G30","Apakah pikiran terasa bingung atau linglung?");
        gejala.put("G31","Apakah perubahan mental dan kesulitan bernafas?");
        gejala.put("G32","Apakah gusi merah terang atau keunguan?");
        gejala.put("G33","Apakah gusi terasa tebal ketika disentuh?");
        gejala.put("G34","Apakah gusi yang terdorong maju membuat gigi terlihat lebih panjang?");
        gejala.put("G35","Apakah ada jarak yang timbuh diantara gigi?");
        gejala.put("G36","Apakah tidak enak pada mulut?");
        gejala.put("G37","Apakah gigi tanggal?");
        gejala.put("G38","Apakah perubahan pada bentuk barisan gigi?");
        gejala.put("G39","Apakah mulut menjadi kering?");
        gejala.put("G40","Apakah adanya lapisan pada lidah?");

        penyakit.put("P1","Erosi Gigi");
        penyakit.put("P2","Ginggivitis");
        penyakit.put("P3","Pulpitis");
        penyakit.put("P4","Abses Gigi");
        penyakit.put("P5","Periodontitis");
        penyakit.put("P6","Karies Gigi");
        penyakit.put("P7","Halitosis");
        penyakit.put("P8","Sindrom Gigi Retak");
        penyakit.put("P9","Temporomandi Bular Joint");
        penyakit.put("P10","Angina Ludwig");

        tanya.setText(gejala.get("G10"));
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h += gejala.get("G10");
                tanya.setText(gejala.get("G7"));
                ya.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        h += "\n"+gejala.get("G7");
                        tanya.setText(gejala.get("G1"));
                        ya.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                h += "\n"+gejala.get("G1");
                                tanya.setText(gejala.get("G3"));
                                ya.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        h += "\n"+gejala.get("G3");
                                        tanya.setText(gejala.get("G13"));
                                        ya.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                h += "\n"+gejala.get("G13");
                                                intent(ha(h),penyakit.get("P1"));
                                            }
                                        });
                                        tidak.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                tanya.setText(gejala.get("G2"));
                                                ya.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        h += "\n"+gejala.get("G2");
                                                        tanya.setText(gejala.get("G5"));
                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                h += "\n"+gejala.get("G5");
                                                                tanya.setText(gejala.get("G4"));
                                                                ya.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        intent(ha(h),penyakit.get("P2"));
                                                                    }
                                                                });
                                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        intent(ha(h),penyakit.get("P2"));
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                intent(ha(h),penyakit.get("P2"));
                                                            }
                                                        });
                                                    }
                                                });
                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        intent(ha(h),penyakit.get("P1"));
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                                tidak.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        tanya.setText(gejala.get("G11"));
                                        ya.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                h += "\n"+gejala.get("G11");
                                                tanya.setText(gejala.get("G12"));
                                                ya.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        h += "\n"+gejala.get("G12");
                                                        intent(ha(h),penyakit.get("P4"));
                                                    }
                                                });
                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        intent(ha(h),penyakit.get("P3"));
                                                    }
                                                });
                                            }
                                        });
                                        tidak.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                tanya.setText(gejala.get("G36"));
                                                ya.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        h += "\n"+gejala.get("G36");
                                                        tanya.setText(gejala.get("G32"));
                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                h += "\n"+gejala.get("G32");
                                                                tanya.setText(gejala.get("G33"));
                                                                ya.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        h += "\n"+gejala.get("G33");
                                                                        tanya.setText(gejala.get("G34"));
                                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                h += "\n"+gejala.get("G34");
                                                                                tanya.setText(gejala.get("G35"));
                                                                                ya.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        h += "\n"+gejala.get("G35");
                                                                                        tanya.setText(gejala.get("G38"));
                                                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View view) {
                                                                                                h += "\n"+gejala.get("G38");
                                                                                                tanya.setText(gejala.get("G37"));
                                                                                                ya.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View view) {
                                                                                                        h += "\n"+gejala.get("G37");
                                                                                                        intent(ha(h),penyakit.get("P5"));
                                                                                                    }
                                                                                                });
                                                                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View view) {
                                                                                                        intent(ha(h),penyakit.get("P5"));
                                                                                                    }
                                                                                                });
                                                                                            }
                                                                                        });
                                                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View view) {
                                                                                                intent(ha(h),penyakit.get("P5"));
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        intent(ha(h),penyakit.get("P5"));
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                intent(ha(h),penyakit.get("P5"));
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        intent(ha(h),penyakit.get("P5"));
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                intent(ha(h),penyakit.get("P5"));
                                                            }
                                                        });
                                                    }
                                                });
                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        intent(ha(h),penyakit.get("P1"));
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        tidak.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                tanya.setText(gejala.get("G6"));
                                ya.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        h += "\n"+gejala.get("G6");
                                        tanya.setText(gejala.get("G9"));
                                        ya.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                h += "\n"+gejala.get("G9");
                                                intent(ha(h),penyakit.get("P6"));
                                            }
                                        });
                                        tidak.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                intent(ha(h),penyakit.get("P6"));
                                            }
                                        });
                                    }
                                });
                                tidak.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        intent(ha(h),penyakit.get("P1"));
                                    }
                                });
                            }
                        });
                    }
                });
                tidak.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tanya.setText(gejala.get("G36"));
                        ya.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                h += "\n"+gejala.get("G36");
                                tanya.setText(gejala.get("G40"));
                                ya.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        h += "\n"+gejala.get("G40");
                                        tanya.setText(gejala.get("G39"));
                                        ya.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                h += "\n"+gejala.get("G39");
                                                intent(ha(h),penyakit.get("P7"));
                                            }
                                        });
                                        tidak.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                intent(ha(h),penyakit.get("P7"));
                                            }
                                        });
                                    }
                                });
                                tidak.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        intent(ha(h),penyakit.get("P7"));
                                    }
                                });
                            }
                        });
                        tidak.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                intent(ha(h),penyakit.get("P1"));
                            }
                        });
                    }
                });
            }
        });

        tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tanya.setText(gejala.get("G8"));
                ya.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tanya.setText(gejala.get("G14"));
                        h += gejala.get("G8");
                        ya.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                tanya.setText(gejala.get("G15"));
                                h += "\n"+gejala.get("G14");
                                ya.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        ya.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                h += "\n"+gejala.get("G15");
                                                intent(ha(h),penyakit.get("P8"));
                                            }
                                        });
                                        tidak.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                intent(ha(h),penyakit.get("P8"));
                                            }
                                        });
                                    }
                                });
                                tidak.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        intent(ha(h),penyakit.get("P8"));
                                    }
                                });
                            }
                        });
                        tidak.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                intent(ha(h),penyakit.get("P8"));
                            }
                        });
                    }
                });
                tidak.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tanya.setText(gejala.get("G16"));
                        ya.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                h += gejala.get("G16");
                                tanya.setText(gejala.get("G17"));
                                ya.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        h += "\n"+gejala.get("G17");
                                        tanya.setText(gejala.get("G18"));
                                        ya.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                h += "\n"+gejala.get("G18");
                                                tanya.setText(gejala.get("G20"));
                                                ya.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        h += "\n"+gejala.get("G20");
                                                        tanya.setText(gejala.get("G21"));
                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                h += "\n"+gejala.get("G21");
                                                                tanya.setText(gejala.get("G23"));
                                                                ya.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        h += "\n"+gejala.get("G23");
                                                                        tanya.setText(gejala.get("G19"));
                                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                h += "\n"+gejala.get("G19");
                                                                                tanya.setText(gejala.get("G22"));
                                                                                ya.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        intent(ha(h),penyakit.get("P9"));
                                                                                    }
                                                                                });
                                                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        intent(ha(h),penyakit.get("P9"));
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                intent(ha(h),penyakit.get("P9"));
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        intent(ha(h),penyakit.get("P9"));
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                intent(ha(h),penyakit.get("P9"));
                                                            }
                                                        });
                                                    }
                                                });
                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        intent(ha(h),penyakit.get("P9"));
                                                    }
                                                });
                                            }
                                        });
                                        tidak.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                intent(ha(h),penyakit.get("P9"));
                                            }
                                        });
                                    }
                                });
                                tidak.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        intent(ha(h),penyakit.get("P9"));
                                    }
                                });
                            }
                        });
                        tidak.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                tanya.setText(gejala.get("G24"));
                                ya.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        h += gejala.get("G24");
                                        tanya.setText(gejala.get("G25"));
                                        ya.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                h += "\n"+gejala.get("G25");
                                                tanya.setText(gejala.get("G26"));
                                                ya.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        h += "\n"+gejala.get("G26");
                                                        tanya.setText(gejala.get("G27"));
                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                h += "\n"+gejala.get("G27");
                                                                tanya.setText(gejala.get("G28"));
                                                                ya.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        h += "\n"+gejala.get("G28");
                                                                        tanya.setText(gejala.get("G29"));
                                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                h += "\n"+gejala.get("G29");
                                                                                tanya.setText(gejala.get("G30"));
                                                                                ya.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        h += "\n"+gejala.get("G30");
                                                                                        tanya.setText(gejala.get("G31"));
                                                                                        ya.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View view) {
                                                                                                h += "\n"+gejala.get("G31");
                                                                                                intent(ha(h),penyakit.get("P10"));
                                                                                            }
                                                                                        });
                                                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View view) {
                                                                                                intent(ha(h),penyakit.get("P10"));
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View view) {
                                                                                        intent(ha(h),penyakit.get("P10"));
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                intent(ha(h),penyakit.get("P10"));
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        intent(ha(h),penyakit.get("P10"));
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        tidak.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                intent(ha(h),penyakit.get("P10"));
                                                            }
                                                        });
                                                    }
                                                });
                                                tidak.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        intent(ha(h),penyakit.get("P10"));
                                                    }
                                                });
                                            }
                                        });
                                        tidak.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                intent(ha(h),penyakit.get("P10"));
                                            }
                                        });
                                    }
                                });
                                tidak.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        intent(" Tidak ada gejala terdeteksi","-");
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Mulai.this,MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }
    String ha(String ha){
        String a=ha.replaceAll("Apakah ","~");
        String b=a.replace("?","");
        return b;
    }
    public void intent (String g,String p) {
        Intent intent = new Intent(Mulai.this, Hasil.class);
        intent.putExtra("pe", p);
        intent.putExtra("ge", g);
        startActivity(intent);
    }
}
