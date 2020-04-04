package com.study.aula1senacpos.ui.listacarros

import android.util.Log
import androidx.lifecycle.ViewModel
import com.study.aula1senacpos.model.Car
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ListaCarrosViewModel : ViewModel() {

    var cars: MutableList<Car> = ArrayList<Car>();

    fun getCars(){
        GlobalScope.launch {
            Thread.sleep(10000)
            val ecosport = Car("Ford", "EcoSport", 59000.0f, "https://ww...");
            val i30 = Car("Hiunday", "i30", 27000.0f, "https://cd...");

            cars.add(ecosport);
            cars.add(i30);
        }
    }


}
