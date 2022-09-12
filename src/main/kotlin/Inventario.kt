class Inventario {
    var Hotdog: Int=50
    var Hamburguesa :Int=300
    var Pizza: Int=60
    var Donna: Int=20
    var Lasana: Int=10
    var Ensalda: Int=5000
    var Sopa : Int=5012
    var Helado: Int=150
    var Jugos : Int=1250
    var Pupusas: Int=150

     fun restaProducto( v1:Int ,  v2: Int){

          when(v1){

              1-> Hotdog-v2
              2-> Hamburguesa-v2
              3-> Pizza-v2
              4-> Donna-v2
              5-> Lasana-v2
              6-> Ensalda-v2
              7->Sopa-v2
              8->Helado-v2
              9->Jugos-v2
              10->Pupusas-v2
          }

     }


    fun mostrarProducto(){
        println("1. HotDog")
        println ("2.Hamburguesa")
        println("3. Pizza")
        println("4. Dona ")
        println("5. lasaña")
        println("6. Ensalada")
        println("7. Sopa")
        println("8. Helado")
        println("9. Jugos")
        println("10. Pupusas")
    }
    fun mostrarmensaje(){
        do {
            println("1. Desea ver un producto en especifico   2.Todos los productos")
            val opcion = readln()!!.toInt()
            if (opcion == 1) {

                println("Ingrese codido de producto")
                var codigo = readln()!!.toInt()
                when (codigo) {
                    1 -> println("Hotdog        cantidad =$Hotdog")
                    2 -> println("Hamburguesa   cantidad =$Hamburguesa")
                    3 -> println("Pizza         cantidad =$Pizza")
                    4 -> println("Dona          cantidad =$Donna")
                    5 -> println("lasaña        cantidad =$Lasana")
                    6 -> println("Ensalada      cantidad =$Ensalda")
                    7 -> println("Sopa          cantidad =$Sopa")
                    8 -> println("Helado        cantidad =$Helado")
                    9 -> println("Jugos         cantidad =$Jugos")
                    10 -> println("Pupusas      cantidad =$Pupusas")


                }
            } else {
                println("1. HotDog      cantidad =$Hotdog")
                println("2.Hamburguesa  cantidad =$Hamburguesa ")
                println("3. Piza        cantidad =$Pizza ")
                println("4. Dona        cantidad =$Donna ")
                println("5. lasaña      cantidad =$Lasana ")
                println("6. Ensalada    cantidad =$Ensalda")
                println("7. Sopa        cantidad =$Sopa")
                println("8. Helado      cantidad =$Helado")
                println("9. Jugos       cantidad =$Jugos")
                println("10. Pupusas    cantidad =$Pupusas")
            }
            println("Desea continuar 1. si  2.no")
            var con = readln()!!.toInt()
        }while (con==1)
        println("Hasta luego")
    }
}