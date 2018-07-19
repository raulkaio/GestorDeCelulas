package br.com.raulkaio.gestordecelulas

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_criar_conta = findViewById(R.id.buttonCriarConta) as Button
        btn_criar_conta.setOnClickListener {
            val intent = Intent(this,CriaConta::class.java)
            startActivity(intent)
            finish()
        }

        val btn_tela_principal = findViewById(R.id.buttonLogarComFacebook) as Button
        btn_tela_principal.setOnClickListener {
            val intent = Intent(this,TelaPrincipal::class.java)
            startActivity(intent)
            finish()
        }
    }
}
