package com.example.tp4_exo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.fragment_seance_detail.*

class Seance_detail_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seance_detail_activity)


        seance_intitule.text = getIntent().getStringExtra("intitule")
        seance_duree.text = getIntent().getStringExtra("duree")
        seance_enseignant.text = getIntent().getStringExtra("Enseignant")


        seance_enseignant.setOnClickListener(){

            val intent2= Intent(this, Fiche_enseignant_activity::class.java)
            intent2.putExtra("Enseignant",  getIntent().getStringExtra("Enseignant"))
            intent2.putExtra("gradeEnseignant", getIntent().getStringExtra("gradeEnseignant"))
            intent2.putExtra("moduleEnseignant", getIntent().getStringExtra("moduleEnseignant"))


            startActivity(intent2)

        }
    }
}
