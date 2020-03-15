package www.kelompok3.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import www.kelompok3.com.app.R;

public class SplasScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen);


        Thread splahs = new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep(3*1000);
                    Intent i = new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);
                    finish();


                }catch (Exception e){

                }
            }
        };
        splahs.start();
    }
}
