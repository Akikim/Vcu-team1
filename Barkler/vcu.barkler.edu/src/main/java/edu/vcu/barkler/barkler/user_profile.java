package edu.vcu.barkler.barkler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class user_profile extends AppCompatActivity {

    static JSONObject s;
    EditText usr;
    EditText bio;
    private Socket client;

    @Override
    protected void onCreate(Bundle saveInstancestate) {
        super.onCreate(saveInstancestate);
        setContentView(R.layout.activity_user_profile);
        usr = (EditText) findViewById(R.id.editText);
        bio = (EditText) findViewById(R.id.editText2);

        new Thread(new ClientThread()).start();
        System.out.println("started thread");
    }

    public void searchForDogs(View view) {
        Intent intent = new Intent(this, ClientThread.class);
        startActivity(intent);
        s = new JSONObject();
        try {
            s.put("lat", Home.latitude);
            s.put("long", Home.longitude);
            s.put("usr", usr.getText().toString());
            s.put("bio", bio.getText().toString());
            System.err.println("I tried to send it");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    class ClientThread implements Runnable {

        @Override
        public void run() {
            try {
                s = new JSONObject().put("", 42);
                System.out.println("hello");
                InetAddress serverAddr = InetAddress.getByName("40.121.85.166");
                client = new Socket(serverAddr, 8080);
                PrintWriter out = new PrintWriter(client.getOutputStream());
                out.print(s);
            } catch (UnknownHostException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}