class Producto {

    val precionHamburguesa : Float = 1.25f
    val precioHotdog: Float =1.25f
    val precioPizza: Float =4.25f
    val precioDonna: Float  = 0.75f
    val precioLasana: Float = 3.25f
    val precioEnsalda: Float = 6.00f
    val precioSopa : Float = 2.25f
    val precioHelado: Float= 1.25f
    val precioJugos : Float= 0.75f
    val precioPupusas: Float= 0.60f
    var total :Float  =0f
    var sumatotal:Float=0f

    fun mostrarProducto(){
        println("1. HotDog     c/u  $precioHotdog")
        println("2.Hamburguesa c/u  $precionHamburguesa")
        println("3. Piza       c/u  $precioPizza")
        println("4. Dona       c/u  $precioDonna")
        println("5. lasaña     c/u  $precioLasana" )
        println("6. Ensalada   c/u  $precioEnsalda" )
        println("7. Sopa       c/u  $precioSopa" )
        println("8. Helado     c/u  $precioHelado" )
        println("9. Jugos      c/u  $precioJugos" )
        println("10. Pupusas   c/u  $precioPupusas" )
    }
     var totales = FloatArray(10)

    fun calculo(){
        do {

        println("articulos")
            mostrarProducto()
          println("¿Que articulos desea agregar?")
         var articulos :Int = 0
         articulos = readLine()!!.toInt()
        println("¿Cuanta cantidad?")
        var cantidad:Int =0
        cantidad =readLine()!!.toInt()
         when(articulos){
             1-> totales[0] =(total(cantidad, precioHotdog))
             2-> totales[1] =(total(cantidad,precionHamburguesa))
             3-> totales[2] =(total(cantidad,precioPizza))
             4-> totales[3] =(total(cantidad,precioDonna))
             5-> totales[4] =(total(cantidad,precioLasana))
             6-> totales[5] =(total(cantidad,precioEnsalda))
             7-> totales[6] =(total(cantidad,precioSopa))
             8-> totales[7] =(total(cantidad,precioHelado))
             9-> totales[8] =(total(cantidad,precioJugos))
             10-> totales[9] =(total(cantidad,precioPupusas))
         }
            println("Dese agregar otro producto? (1.Si) (2.no)")
            val continuar: Int = readLine()!!.toInt()
        }while (continuar==1)
         println("Total de la factura")
         for (i in 0..9){
             when(i){
                 0-> println("HotDog ${totales[i]}")
                 1-> println("Hamburguesa ${totales[i]}")
                 2-> println("Pizza ${totales[i]}")
                 3-> println("Donna ${totales[i]}")
                 4-> println("lasaña ${totales[i]}")
                 5-> println("Ensalada ${totales[i]}")
                 6-> println("Sopa ${totales[i]}")
                 7-> println("helados ${totales[i]}")
                 8-> println("Jugos ${totales[i]}")
                 9-> println("pupusota ${totales[i]}")
             }
             sumatotal+=totales[i]
         }
        println("El total es $sumatotal")
    }
     fun total( cantidad:Int ,  precio:Float): Float {
         total = cantidad*precio
         return total
     }
}