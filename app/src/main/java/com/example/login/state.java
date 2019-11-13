package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class state extends AppCompatActivity {
   private ImageView button;
    String[] states = new String[]{"Delhi","Haryana","Punjab","Goa",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        button = findViewById(R.id.arrow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });

        FloatingActionButton mShowDialog = findViewById(R.id.plus);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(state.this);
                View mView = getLayoutInflater().inflate(R.layout.dailog,null);
                final AutoCompleteTextView state = mView.findViewById(R.id.editText_Dailog);
                state.setAdapter(new ArrayAdapter<>(state.this,android.R.layout.simple_expandable_list_item_1,states));
                Button submit = mView.findViewById(R.id.submit_button);

                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!state.getText().toString().isEmpty())
                        {
                            Toast.makeText(state.this,"State is Added",Toast.LENGTH_SHORT).show();
                            dialog.cancel();
                        }
                        else
                        {
                            Toast.makeText(state.this,"Please Enter the State",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });

    }


    public void openhome()
    {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}
