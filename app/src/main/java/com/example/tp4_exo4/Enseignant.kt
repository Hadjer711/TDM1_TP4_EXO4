package com.example.tp4_exo4

data class Enseignant(
    var nom: String,

    var grade: String,

    var module: String

){
    override fun toString(): String {
        return "Livre(nom='$nom', grade='$grade', module='$module')"
    }
}