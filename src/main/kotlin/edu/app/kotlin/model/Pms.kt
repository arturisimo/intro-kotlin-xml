package edu.app.kotlin.model

data class Pms(val fechaHora: String, val pm: List<Pm>)

data class Pm(
     val idelem: String,
     var descripcion: String? = null,
     var accesoAsociado: String? = null,
     var intensidad: String,
     var ocupacion: String,
     var carga: String,
     var nivelServicio: String? = null,
     var intensidadSat: String? = null,
     var velocidad: String? = null,
     var error: String,
     var subarea: String? = null,
     var stX: String,
     var stY: String
)

