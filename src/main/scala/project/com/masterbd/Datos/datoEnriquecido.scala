package project.com.masterbd.Datos


/**
  * Enriched object with Redis data.
  */
object datoEnriquecido {
    case class enriquecido (
                        val destino: String,
                        val id_transaccion: Int,
                        val fecha : String,
                        val metodoPago: String,
                        val id_tienda:String,
                        val cadena : String,
                        val sexo: String,
                        val pais: String,
                        val region: String,
                        val zona: String,
                        val id_prenda: String,
                        val precio: Double,
                        val beneficio: Double,
                        val color: String,
                        val talla: String,
                        val nombre: String,
                        val modelo: String,
                        val clase: String
                        )

}
