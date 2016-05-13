package com.mobile.stockr.stockr_android;

import java.io.IOException;

import yahoofinance.YahooFinance;

/**
 * Created by DeanF on 5/10/2016.
 */
public class GetQuote extends HomeActivity {

        static Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    System.out.println(YahooFinance.get("TSLA").toString());

                }
                catch (Exception e)
                {
                    e.printStackTrace();

                }

            }
        });


}
