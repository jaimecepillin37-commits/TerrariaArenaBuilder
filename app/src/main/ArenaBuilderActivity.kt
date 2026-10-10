package com.terraria.arenabuilder

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class ArenaBuilderActivity : Activity() {

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val layout = LinearLayout(this)
    layout.orientation = LinearLayout.VERTICAL
    layout.gravity = Gravity.CENTER
    layout.setPadding(32, 32, 32, 32)
    layout.setBackgroundColor(Color.rgb(25, 28, 35))

    val title = TextView(this)
    title.text = "Terraria ArenaBuilder"
    title.textSize = 26f
    title.setTextColor(Color.WHITE)
    title.gravity = Gravity.CENTER

    val info = TextView(this)
    info.text = "¡Prepara tu próxima arena de combate!"
    info.textSize = 16f
    info.setTextColor(Color.LTGRAY)
    info.gravity = Gravity.CENTER

    val button = Button(this)
    button.text = "CONSTRUIR ARENA"
    button.setOnClickListener {
        info.text = "¡Arena seleccionada! Próximo paso: generar el diseño."
    }

    layout.addView(title)
    layout.addView(info)
    layout.addView(button)

    setContentView(layout)
}

}
