package com.study.aula1senacpos.ui.listacarros

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.study.aula1senacpos.R

class ListaCarrosFragment : Fragment() {

    companion object {
        fun newInstance() = ListaCarrosFragment()
    }

    private lateinit var viewModel: ListaCarrosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.lista_carros_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)
            .get(ListaCarrosViewModel::class.java)

        Log.e("teste", "viewModel ${viewModel.toString()}")
    }

}
