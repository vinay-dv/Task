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

public class child extends AppCompatActivity {
    private ImageView button;
    String[] sex = new String[]{"Male","Female"};
    String[] states = new String[]{"Delhi","Haryana","Punjab","Goa"};
    String[] districts = new String[]{"North","South","East","West"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(child.this);
                View mView = getLayoutInflater().inflate(R.layout.dailog_children,null);
                final EditText sex = mView.findViewById(R.id.editTextchild2_Dailog);
                final EditText state = mView.findViewById(R.id.editTextchild6_Dailog);
                final EditText districts = mView.findViewById(R.id.editTextchild7_Dailog);

                Button submit = mView.findViewById(R.id.submit_button);

                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!state.getText().toString().isEmpty())
                        {
                            Toast.makeText(child.this,"Children is Added",Toast.LENGTH_SHORT).show();
                            dialog.cancel();
                        }
                        else
                        {
                            Toast.makeText(child.this,"Please Enter all Details",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });

    }

    public void openhome() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}