package com.study.aula1senacpos.ui.listacarros

import android.util.Log
import androidx.lifecycle.ViewModel

class ListaCarrosViewModel : ViewModel() {

    init {
        Log.e("teste", "init viewmodel ${this.toString()}");
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("teste", "init onCleared");
    }

}
