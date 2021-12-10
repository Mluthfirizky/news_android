package learn.idn.recycler_view_project

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class rv_news(var context: Context,
              var dataGambar: ArrayList<Drawable?>,
              var dataJudul: ArrayList<String>,
              var dataDeskripsi: ArrayList<String>,
              var dataTanggal: ArrayList<String>
              ) :
    RecyclerView.Adapter<rv_news.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var desc: TextView
        var judul: TextView
        var gambar: ImageView
        var tanggal: TextView
        var layout: LinearLayout

        init {
            // Define click listener for the ViewHolder's View.
            judul = view.findViewById(R.id.judul)
            desc = view.findViewById(R.id.deskripsi)
            gambar = view.findViewById(R.id.image)
            tanggal = view.findViewById(R.id.tanggal)
            layout = view.findViewById(R.id.linear)

        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.rv_model, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Glide
            .with(context)
            .load(dataGambar[position])
            .centerCrop()
            .into(viewHolder.gambar);
        viewHolder.judul.text = dataJudul[position]
        viewHolder.desc.text = dataDeskripsi[position]
        viewHolder.tanggal.text = dataTanggal[position]
        viewHolder.layout.setOnClickListener{

        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataDeskripsi.size;

}
