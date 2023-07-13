package jp.ac.it_college.std.s22020.listviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        lvMenu.onItemClickListener = ListItemClickListener()
    }
    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val item = parent.getItemAtPosition(position) as String
            val show = "あなたが選んだ定食: $item "
            Toast.makeText(this@MainActivity, show, Toast.LENGTH_LONG).show()
        }
    }
}