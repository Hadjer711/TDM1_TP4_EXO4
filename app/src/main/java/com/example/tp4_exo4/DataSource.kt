package com.example.tp4_exo4



class DataSource{
    companion object{

        fun createDataSet(day:Int): ArrayList<Seance>{

            val enseignantList =ArrayList<Enseignant>()
            enseignantList.add(
                Enseignant(
                    "Batata Sofiane",
                    "prof",
                    "TDM1, TDM2"

                )
            )
            enseignantList.add(
                Enseignant(
                    "Tolba",
                    "prof",
                    "Alog, Compil"

                )
            )
            enseignantList.add(
                Enseignant(
                    "Benatchba ",
                    "prof",
                    "ML, Compil"

                )
            )

            enseignantList.add(
                Enseignant(
                    "Hadji",
                    "prof",
                    "HPC"

                )
            )

            enseignantList.add(
                Enseignant(
                    "Benkrid",
                    "prof",
                    "SGBD, BWEB"

                )
            )
            enseignantList.add(
                Enseignant(
                    "Batata Sofiane",
                    "prof",
                    "TDM1, TDM2"

                )
            )
            enseignantList.add(
                Enseignant(
                    "Zakaria",
                    "prof",
                    "QLOG"

                )
            )

            enseignantList.add(
                Enseignant(
                    "Hassini",
                    "prof",
                    "IHM"

                )
            )




            val list = ArrayList<Seance>()
            when(day){
                0->{
                    list.add(
                        Seance(
                            "TDM1",
                            "4H",
                            enseignantList[0],
                            1
                        )

                    )
                    list.add(
                        Seance(
                            "ALOG TP",
                            "2H",
                            enseignantList[1],
                            1
                        )

                    )
                    list.add(
                        Seance(
                            "ML TP",
                            "2H",
                            enseignantList[2],
                            1
                        )

                    )
                    list.add(
                        Seance(
                            "HPC cours",
                            "2H",
                            enseignantList[3],
                            2
                        )

                    )

                    list.add(
                        Seance(
                            "QLOG cours",
                            "2H",
                            enseignantList[5],
                            2
                        )

                    )
                    list.add(
                        Seance(
                            "QLOG TD",
                            "2H",
                            enseignantList[5],
                            2
                        )

                    )

                    list.add(
                        Seance(
                            "SGBD",
                            "4H",
                            enseignantList[4],
                            3
                        )

                    )

                    list.add(
                        Seance(
                            "HPC TP",
                            "2H",
                            enseignantList[0],
                            4
                        )

                    )
                    list.add(
                        Seance(
                            "ML Cours",
                            "2H",
                            enseignantList[7],
                            4
                        )

                    )
                    list.add(
                        Seance(
                            "ALOG cours",
                            "2H",
                            enseignantList[7],
                            4
                        )

                    )
                    list.add(
                        Seance(
                            "PROJET",
                            "2H",
                            enseignantList[0],
                            5
                        )

                    )
                    list.add(
                        Seance(
                            "IHM",
                            "2H",
                            enseignantList[7],
                            5
                        )

                    )

                }
                1->{
                    list.add(
                        Seance(
                            "TDM1",
                            "4H",
                            enseignantList[0],
                            1
                        )

                    )
                    list.add(
                        Seance(
                            "ALOG TP",
                            "2H",
                            enseignantList[1],
                            1
                        )

                    )
                }
                2->{

                    list.add(
                        Seance(
                            "HPC cours",
                            "2H",
                            enseignantList[3],
                            2
                        )

                    )

                    list.add(
                        Seance(
                            "QLOG cours",
                            "2H",
                            enseignantList[5],
                            2
                        )

                    )
                    list.add(
                        Seance(
                            "QLOG TD",
                            "2H",
                            enseignantList[5],
                            2
                        )

                    )

                }
                3->{

                    list.add(
                        Seance(
                            "SGBD",
                            "4H",
                            enseignantList[4],
                            3
                        )

                    )

                }
                4->{
                    list.add(
                        Seance(
                            "HPC TP",
                            "2H",
                            enseignantList[0],
                            4
                        )

                    )
                    list.add(
                        Seance(
                            "ML Cours",
                            "2H",
                            enseignantList[7],
                            4
                        )

                    )
                    list.add(
                        Seance(
                            "ALOG cours",
                            "2H",
                            enseignantList[7],
                            4
                        )

                    )


                }
                5->{

                    list.add(
                        Seance(
                            "PROJET",
                            "2H",
                            enseignantList[0],
                            5
                        )

                    )
                    list.add(
                        Seance(
                            "IHM",
                            "2H",
                            enseignantList[7],
                            5
                        )

                    )

                }

            }



            return list
        }




    }
}