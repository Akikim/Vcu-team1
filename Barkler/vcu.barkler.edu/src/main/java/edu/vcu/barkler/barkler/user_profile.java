package edu.vcu.barkler.barkler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class user_profile extends AppCompatActivity {

//    static JSONObject s;
    EditText usr;
    EditText bio;
//    private Socket client;

    @Override
    protected void onCreate(Bundle saveInstancestate) {
        super.onCreate(saveInstancestate);
        setContentView(R.layout.activity_user_profile);
        usr = (EditText) findViewById(R.id.editText);
        bio = (EditText) findViewById(R.id.editText2);

//        new Thread(new ClientThread()).start();
    }

    public void searchForDogs(View view) {
//        s = new JSONObject();
//        try {
//            s.put("lat", Home.latitude);
//            s.put("long", Home.longitude);
//            s.put("usr", usr.getText().toString());
//            s.put("bio", bio.getText().toString());
//            System.err.println("I tried to send it");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }


}