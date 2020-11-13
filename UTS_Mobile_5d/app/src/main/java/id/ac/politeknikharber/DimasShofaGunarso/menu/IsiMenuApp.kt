package id.ac.politeknikharber.DimasShofaGunarso.menu

import id.ac.politeknikharber.DimasShofaGunarso.R

object IsiMenuApp {
    private val foto = intArrayOf(
        R.drawable.news,
        R.drawable.calculator1,
        R.drawable.information1,
        R.drawable.exit
    )
    private val nama = arrayOf(
        "Pendidikan",
        "Calculator",
        "information",
        "Close"
    )

    val data:ArrayList<MenuApp>
        get() {
            val listGambar:ArrayList<MenuApp> = arrayListOf()
            for(i in foto.indices){
                val menuApp = MenuApp()
                menuApp.foto = foto[i]
                menuApp.nama = nama[i]
                listGambar.add(menuApp)
            }
            return listGambar
        }
}