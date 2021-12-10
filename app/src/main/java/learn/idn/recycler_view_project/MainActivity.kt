package learn.idn.recycler_view_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = ArrayList<SlideModel>() // Create image list

        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://bit.ly/2YoJ77H", "The animal population decreased by 58 percent in 42 years."))
        imageList.add(SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct."))
        imageList.add(SlideModel("https://bit.ly/3fLJf72", "And people do that."))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList
        )

        val recyclerView: RecyclerView = findViewById(R.id.recycleView)

        val dataGambar = arrayListOf(getDrawable((R.drawable.news)), getDrawable(R.drawable.dark), getDrawable(R.drawable.nature))

        val dataJudul = arrayListOf(
            "Breaking News!",
            "Mountain info",
            "What is android?")

        val dataDeskripsi = arrayListOf(
            "Lorem ipsum dolor sit amet consectetur adipisicing elit. Iste voluptate quo esse repellendus! Aperiam ratione, quo possimus eum aliquid numquam veritatis consequatur autem libero aut nulla tempora! Saepe, expedita totam!",
            "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Voluptas hic obcaecati tempore voluptate voluptatibus mollitia placeat sunt. Nemo ut est id optio, at exercitationem debitis amet. Hic totam dolorem placeat.",
            "Lorem ipsum, dolor sit amet consectetur adipisicing elit. A ut perspiciatis dolore consequuntur saepe quam, quos voluptas natus aspernatur sint fugiat eius nulla, incidunt doloribus, similique sapiente error voluptates debitis!")

        val dataTanggal = arrayListOf(
            "10/20/2020",
            "18/9/2020",
            "12/1/2021")

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = rv_news(this,dataGambar, dataJudul, dataDeskripsi,dataTanggal)
        recyclerView.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }
}