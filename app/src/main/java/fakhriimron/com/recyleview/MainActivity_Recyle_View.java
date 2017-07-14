package fakhriimron.com.recyleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_Recyle_View extends AppCompatActivity {

    public  EditText name;
    public EditText email;
    public EditText address;
    public TextView taruh;
    public  Button btn1;
    public  TextView Tampilan;
    public static final String HIU ="hiu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__recyle__view);

    name = (EditText)findViewById(R.id.tv_name);
    email = (EditText)findViewById(R.id.tv_email);
    address = (EditText)findViewById(R.id.tv_address);
        taruh = (TextView) findViewById(R.id.tv_taruh);

        String getname = name.getText().toString();
        String getemail = email.getText().toString();
        String getaddress = address.getText().toString();
    }


    public void tampil (View v){
        Tampil tampilan = new Tampil();
        taruh.setText(tampilan.getName());
//        String getname = name.getText().toString();
//        String getemail = email.getText().toString();
//        String getaddress = address.getText().toString();



    }
}
