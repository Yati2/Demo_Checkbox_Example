package sg.edu.rp.c346.id20028056.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled=findViewById(R.id.cbDiscount);
        btnCheck=findViewById(R.id.btnCheck);
        tvShow=findViewById(R.id.tvShow);



//            btnCheck.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    String msg;
//                if(cbEnabled.isChecked())
//                {
//                    msg="The discount is given";
//                }
//                else
//                {
//                    msg="The discount is not given";
//                }
//                    tvShow.setText(msg);
//
//                }
//            });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //content: getApplicationContex(),. getBaseContext(), this
                Toast.makeText(MainActivity.this,"Button Click",Toast.LENGTH_LONG).show();
                Log.w("MyActivity","Inside onClick()");

                if(cbEnabled.isChecked()) {


                    double pay=calcPay(100,20);
                    tvShow.setText("The discount is given. You need to pay "+pay);
                }
                else {
                    double pay = calcPay(100, 0);
                    tvShow.setText("The discount is not given. You need to pay " + pay);
                }



            }
        });


    }
    private double calcPay(double price, double discount)
    {
        double pay=price*(1-discount/100);
        return pay;
    }
}