package com.example.tp4_exo4

data class Seance(
    var intitule: String,

    var duree: String,

    var enseignant: Enseignant,
    var journee: Int

){
    override fun toString(): String {
        return "Livre(intitule='$intitule', duree='$duree', auteur='$enseignant', journee='$journee')"
    }
}