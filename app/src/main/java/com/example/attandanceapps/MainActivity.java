package com.example.attandanceapps;

//NAIVULUNGUTI EDDY
//2017/BIT/138/PS
//MOBILE ATTENDANCE MANAGEMENT SYSTEM
//ANDROID PROGRAMMING
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.attandanceapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView button=findViewById(R.id.btnSelection);

        registerForContextMenu( button);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Select Account Type");
        menu.add("Student");
        menu.add("Lecture");
        menu.add("Administrator");

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        String x=(String) item.getTitle().toString();
        switch (x){
            case "Student":
                Intent integerStudent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(integerStudent);
                return true;
            case "Lecture":
                Toast.makeText(getApplicationContext(),"Lecture",Toast.LENGTH_SHORT).show();
                return true;
            case "Administartor":
                Toast.makeText(getApplicationContext(),"Adminstrator",Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
}
