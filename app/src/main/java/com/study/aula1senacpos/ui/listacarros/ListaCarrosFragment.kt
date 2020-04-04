package com.study.aula1senacpos.ui.listacarros

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.study.aula1senacpos.R
import com.study.aula1senacpos.adapter.CarsAdapter
import kotlinx.android.synthetic.main.lista_carros_fragment.*

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

    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ListaCarrosViewModel::class.java)

        viewManager = LinearLayoutManager(activity)

        rv_cars.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
        }

        viewModel.cars.observe(viewLifecycleOwner, Observer {
            viewModel.cars.value?.let {
                viewAdapter = CarsAdapter(it)
                rv_cars.adapter = viewAdapter;
            }
        })
        viewModel.getCars();
    }


}
