package com.mobile.stockr.stockr_android;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;



import org.w3c.dom.Text;

import java.io.IOException;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




    }
    Thread thread = new Thread(new Runnable()
    {

        @Override
        public void run() {
            try
            {
                EditText txtUserInput = (EditText) findViewById(R.id.txtUserInput);
                TextView lblValueDisplay = (TextView) findViewById(R.id.lblValueDisplay);
                String stkvalue = YahooFinance.get(txtUserInput.getText().toString().toUpperCase()).toString();
                lblValueDisplay.setText(stkvalue);
            }
            catch (Exception e)
            {
                e.printStackTrace();

            }

        }
    });

    @Override
    public void onClick(View v) {
        Button btnSearch = (Button) v;





    }
}
