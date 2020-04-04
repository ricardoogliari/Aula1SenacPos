package com.study.aula1senacpos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.aula1senacpos.ui.listacarros.ListaCarrosFragment

class ListaCarros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_carros_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListaCarrosFragment.newInstance())
                .commitNow()
        }
    }

}
