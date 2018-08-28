package com.example.hp.sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class verification extends AppCompatActivity {
String recievedOtp;
EditText OtpTyped;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
     //   Intent intent=getIntent();
         Bundle bundle=getIntent().getExtras();
         recievedOtp= String.valueOf(bundle.getInt("OTP"));

        Toast.makeText(this,"dfcgf"+recievedOtp,Toast.LENGTH_SHORT).show();
         OtpTyped= (EditText)findViewById(R.id.otp);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.verify)
    public void verify()
    {
        String otpEntered=OtpTyped.getText().toString();
     //   Toast.makeText(this,"msg"+otp,Toast.LENGTH_SHORT).show();
       // Toast.makeText(this,"Successfully registered"+otpEntered,Toast.LENGTH_SHORT).show();
       if(recievedOtp.equals(otpEntered))
        {
            Toast.makeText(this,"Successfully registered",Toast.LENGTH_SHORT).show();
        }else
       {
           Toast.makeText(this,"Wrong Otp",Toast.LENGTH_SHORT).show();
       }
    }
}
