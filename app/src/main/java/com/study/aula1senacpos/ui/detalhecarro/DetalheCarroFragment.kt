package com.study.aula1senacpos.ui.detalhecarro

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.study.aula1senacpos.R
import com.study.aula1senacpos.databinding.DetalheCarroFragmentBinding
import com.study.aula1senacpos.model.Car

class DetalheCarroFragment : Fragment() {

    companion object {
        fun newInstance(car: Car): DetalheCarroFragment {
            val f = DetalheCarroFragment()

            val args = Bundle()
            args.putSerializable("car", car)
            f.arguments = args

            return f
        }
    }

    private lateinit var viewModel: DetalheCarroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.detalhe_carro_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetalheCarroViewModel::class.java)

        val binding: DetalheCarroFragmentBinding =
            DataBindingUtil.setContentView(
                activity!!,
                R.layout.detalhe_carro_fragment)
        binding.viewModel = viewModel

        viewModel.car = arguments?.getSerializable("car") as Car
    }

}
