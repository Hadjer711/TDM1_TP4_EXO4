package com.example.tp4_exo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fiche_enseignant_activity.*
import kotlinx.android.synthetic.main.fragment_enseignant_detail.*

class Fiche_enseignant_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiche_enseignant_activity)

        enseignant_nom.text = getIntent().getStringExtra("Enseignant")
        enseignant_grade.text = getIntent().getStringExtra("gradeEnseignant")
        enseignant_module.text = getIntent().getStringExtra("moduleEnseignant")
    }
}
