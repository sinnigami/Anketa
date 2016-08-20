package com.example.akbar.anketa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void sendData(View v) {
        EditText fio = (EditText) findViewById(R.id.editText);
        EditText name = (EditText) findViewById(R.id.name);
        EditText age = (EditText) findViewById(R.id.editText3);
        EditText email = (EditText) findViewById(R.id.email);

        String f = fio.getText().toString();
        String n = name.getText().toString();
        String a = age.getText().toString();
        String e = email.getText().toString();
        f = f + " " + n; //> "Соболев Дмитрий"
        if (f.equals("") || a.equals("") || e.equals("")) {
            Toast.makeText(MainActivity.this, "Заполните форму", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(MainActivity.this, UserActivity.class);//Вызов новой активити(дочерней)
            i.putExtra("fio", f);//putExtra - функция для передачи данных в другую активити
            i.putExtra("age", a);//putExtra - функция для передачи данных в другую активити
            i.putExtra("email", e);//putExtra - функция для передачи данных в другую активити
            startActivity(i);//вторая строка для вызова новой активити(дочерней)
        }
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

