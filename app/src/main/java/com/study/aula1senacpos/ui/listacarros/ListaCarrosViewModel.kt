package com.study.aula1senacpos.ui.listacarros

import android.util.Log
import androidx.lifecycle.ViewModel
import com.study.aula1senacpos.model.Car

class ListaCarrosViewModel : ViewModel() {

    var cars: MutableList<Car> = ArrayList<Car>();

    init {
        val ecosport = Car("Ford", "EcoSport", 59000.0f, "https://www...");
        val i30 = Car("Hiunday", "i30", 27000.0f, "https://cdn….");

        cars.add(ecosport);
        cars.add(i30);
    }


}
