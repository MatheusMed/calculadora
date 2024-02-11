package com.mmdevs.calculadoraproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mmdevs.calculadoraproject.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val calculo = binding.calculo;

        val resultado = binding.resultado;

        // numeros
        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }
        binding.dois.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }
        binding.tres.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }

        binding.quatro.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }
        binding.cinco.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }
        binding.seis.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }
        binding.sete.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }
        binding.oito.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }
        binding.nove.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }
        binding.ponto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }


        // operacoes
        binding.parenteseAbrindo.setOnClickListener {
            calculo.text = "${calculo.text}("
        }
        binding.parenteseFechando.setOnClickListener {
            calculo.text = "${calculo.text})"
        }
        binding.multiplicacao.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }
        binding.menos.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }
        binding.mais.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }
        binding.divisao.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }
        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }

        binding.apagar.setOnClickListener {
            calculo.text = calculo.text.dropLast(1)
        }

        binding.ce.setOnClickListener {
            calculo.text = ""
            resultado.text = ""
        }

        binding.igual.setOnClickListener {
            val resultadoCalculado = Expression(calculo.text.toString()).calculate()

            if(resultadoCalculado.isNaN()){
                calculo.text = "Expressao Invalida"
            }

            resultado.text = resultadoCalculado.toString()
        }




    }
}