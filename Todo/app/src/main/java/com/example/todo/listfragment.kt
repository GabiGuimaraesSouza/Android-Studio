package com.example.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todo.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class listfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_listfragment, container, false)


        val floatingAdd = view.findViewById<FloatingActionButton>(R.id.floatingAdd)

        val ListTarefa = listOf(

            Tarefa(
                "Lavar a Louça",
                "Lavar a louça do dia todo",
                "Gabi",
                "2022-10-10",
                false,
                "Dia a Dia"
            ),

            Tarefa(
                "Shopping",
                "Comprar Roupas",
                "Gabi",
                "2022-09-10",
                false,
                "Lazer"
            ),

            Tarefa(
                "Caminhar no Parque",
                "Caminhar para se exercitar",
                "Gabi",
                "2022-28-10",
                false,
                "Saúde"
            ),

            )

        floatingAdd.setOnClickListener{
        findNavController().navigate(R.id.action_listfragment_to_formFragment)
        }
           return view
    }

}