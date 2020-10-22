package com.midterm1.mandeepmidterm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.content.SharedPreferences;
import android.content.Context;
public class RegisterActivity extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefers";
    public static  final String Name = "Name";
    public static  final String Password = "password";
    public static final  String ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onReturnClick(View view) {
        //Using intent to relaunch my main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void toastMsg(String msg){
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
    public static boolean isPasswordValid(String password){
        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
    //Add some method to check input type
    public void onCommitClick (View view) {
        //Do something when COMMIT button is tapped for now just showing the toast only
        toastMsg("Commited");
    }
}