package com.study.aula1senacpos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.aula1senacpos.ui.detalhecarro.DetalheCarroFragment

class DetalheCarro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhe_carro_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DetalheCarroFragment.newInstance())
                .commitNow()
        }
    }

}
