package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener {

        TextView txtVwNom, txtVwApe;
        EditText edTxtNom, edTxtApe;
        RadioGroup rdGrpIdioma;
        RadioButton rdBtnEs, rdBtnIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwApe = findViewById(R.id.txtVwApe);

        edTxtNom = findViewById(R.id.edTextNon);
        edTxtApe = findViewById(R.id.edTxtApe);
        rdGrpIdioma = findViewById(R.id.rdGrpIdioma);
        rdBtnEs = findViewById(R.id.rdBtnEs);
        rdBtnIn = findViewById(R.id.rdBtnIn);

        rdGrpIdioma.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(i == R.id.rdBtnEs){
        txtVwNom.setText(R.string.txt_vw_nom);
        edTxtNom.setHint(R.string.edt_txt_vw_nom);
        txtVwApe.setText(R.string.txt_vw_ape);
        edTxtApe.setHint(R.string.edt_txt_vw_ape);

        rdBtnEs.setText(R.string.rd_btn_es);
        rdBtnIn.setText(R.string.rd_btn_in);
        }else{

            txtVwNom.setText(R.string.txt_vw_nom_en);
            edTxtNom.setHint(R.string.edt_txt_vw_nom_en);
            txtVwApe.setText(R.string.txt_vw_ape_en);
            edTxtApe.setHint(R.string.edt_txt_vw_ape_en);

            rdBtnEs.setText(R.string.rd_btn_es_en);
            rdBtnIn.setText(R.string.rd_btn_in_en);

        }

    }
}