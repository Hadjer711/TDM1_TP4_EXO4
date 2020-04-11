package com.example.tp4_exo4

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.content.res.Configuration.SCREENLAYOUT_SIZE_LARGE
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_enseignant_detail.*
import kotlinx.android.synthetic.main.fragment_seance_detail.*


class MainActivity : AppCompatActivity(), SeanceAdapter.OnLivreListener {

    private lateinit var seanceAdapter: SeanceAdapter
    private lateinit var seanceLundiAdapter: SeanceAdapter
    private lateinit var seanceMardiAdapter: SeanceAdapter
    private lateinit var seanceMercrediAdapter: SeanceAdapter
    private lateinit var seanceJeudiAdapter: SeanceAdapter
    private lateinit var seanceDimancheAdapter: SeanceAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycleView()
        addDataSet()
        if (checkIsTablet(applicationContext)) {


            listDimanche.layoutManager= LinearLayoutManager(this@MainActivity)
            seanceDimancheAdapter= SeanceAdapter(this@MainActivity)
            listDimanche.adapter=seanceDimancheAdapter


            listLundi.layoutManager= LinearLayoutManager(this@MainActivity)
            seanceLundiAdapter= SeanceAdapter(this@MainActivity)
            listLundi.adapter=seanceLundiAdapter


            listMardi.layoutManager= LinearLayoutManager(this@MainActivity)
            seanceMardiAdapter= SeanceAdapter(this@MainActivity)
            listMardi.adapter=seanceMardiAdapter

            listMercredi.layoutManager= LinearLayoutManager(this@MainActivity)
            seanceMercrediAdapter= SeanceAdapter(this@MainActivity)
            listMercredi.adapter=seanceMercrediAdapter

            listJeudi.layoutManager= LinearLayoutManager(this@MainActivity)
            seanceJeudiAdapter= SeanceAdapter(this@MainActivity)
            listJeudi.adapter=seanceJeudiAdapter
            addDayDataSet()



        }
    }

    private fun addDataSet(){
        var data= DataSource.createDataSet(0)

        seanceAdapter.submitList(data)

    }

    private fun addDayDataSet(){
        var dataDimanche= DataSource.createDataSet(1)
        var dataLundi= DataSource.createDataSet(2)
        var dataMardi= DataSource.createDataSet(3)
        var dataMercredi= DataSource.createDataSet(4)
        var dataJeudi= DataSource.createDataSet(5)

        seanceDimancheAdapter.submitList(dataDimanche)
        seanceLundiAdapter.submitList(dataLundi)
        seanceMardiAdapter.submitList(dataMardi)
        seanceMercrediAdapter.submitList(dataMercredi)
        seanceJeudiAdapter.submitList(dataJeudi)

    }

    private fun initRecycleView(){

            recycleview. apply {
                layoutManager= LinearLayoutManager(this@MainActivity)
                val topSpacingItemDecoration= TopSpacingItemDecoration(30)
                addItemDecoration(topSpacingItemDecoration)

                seanceAdapter= SeanceAdapter(this@MainActivity)
                adapter= seanceAdapter
            }








    }

    fun checkIsTablet(ctx: Context): Boolean {
        return ctx.getResources()
            .getConfiguration().screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK >= SCREENLAYOUT_SIZE_LARGE
    }

    override fun onLivreClick(seance: Seance, position: Int) {
        Toast.makeText(this, seance.intitule, Toast.LENGTH_SHORT).show()
        if (checkIsTablet(applicationContext)) {

            seance_intitule.setText(seance.intitule)
            seance_duree.setText(seance.duree)
            seance_enseignant.setText(seance.enseignant.nom)

            enseignant_grade.setText(seance.enseignant.grade)
            enseignant_nom.setText(seance.enseignant.nom)
            enseignant_module.setText(seance.enseignant.module)





        } else {
            val intent= Intent(this, Seance_detail_activity::class.java)
            intent.putExtra("intitule", "Intitule du module : "+seance.intitule)
            intent.putExtra("Enseignant", "Enseignant : " +seance.enseignant.nom)
            intent.putExtra("gradeEnseignant", "Grade de l'Enseignant : " +seance.enseignant.grade)
            intent.putExtra("moduleEnseignant", "Les Modules enseignés : " +seance.enseignant.module)
            intent.putExtra("duree", "Duree du module : "+seance.duree)

            startActivity(intent)


        }


    }
}
