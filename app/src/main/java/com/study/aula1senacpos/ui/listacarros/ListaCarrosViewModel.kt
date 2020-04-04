package com.study.aula1senacpos.ui.listacarros

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.study.aula1senacpos.model.Car
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ListaCarrosViewModel : ViewModel() {

    var cars: MutableLiveData<List<Car>> = MutableLiveData<List<Car>>();

    fun getCars(){
        val ecosport = Car("Ford", "EcoSport", 59000.0f, "https://www.slavie...");
        val i30 = Car("Hiunday", "i30", 27000.0f, "https://cdn.salaodo...");

        val tempCars: MutableList<Car> = ArrayList();
        tempCars.add(ecosport);
        tempCars.add(i30);

        cars.value = tempCars;
    }


}
