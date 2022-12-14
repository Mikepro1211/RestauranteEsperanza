class Menu {
    var user: String = ""
    var password: String = ""

    // --- Administradores
    var adm1  =  "Admin"
    var adm2  =  "admin"
    var admpsw: String = "admin123"

    // --- Vendedores
    var vdr1 = "Vendedor"
    var vdr2 = "vendedor"
    var vdrpsw = "vendedor123"

    // --- Invitados
    var inv1 = "Invitado"
    var inv2 = "invitado"
    var invpsw = "invitado123"

    var intento = 1
    var variable1: Int = 0
    var variable2: Int = 0

    fun bienvenida(){
        println(" *****  Bienvenido al sistema Restaurante Esperanza  *****")
        println("                Favor Ingrese credenciales\n              ")
    }
    fun ingresoUsuario(){
        //Ingresar usuario
        print("--> Ingrese Usuario: ")
        user = readln().toString()

        //Imgresar contraseña
        print("--> Ingrese contraseña: ")
        password = readln().toString()
    }

    fun imprimirAdmin(){
        println(" ---------- Menu ----------")
        println("1- Venta Nueva")
        println("2- Consultar Inventario")
        println("3- Cambiar contraseña")
        println("4- Salir del sistema")
        print("\n-> Ingrese digito: ")
    }
    fun imprimirventas(){
        println(" ---------- Menu ----------")
        println("1- Venta Nueva")
        println("2- Consultar Inventario")
        println("3- Salir del sistema")
        print("\n-> Ingrese digito: ")
    }
    fun imprimirinvitado(){
        println(" ---------- Menu ----------")
        println("1- Consultar Inventario")
        println("2- Salir del sistema")
        print("\n-> Ingrese digito: ")
    }

    fun cambioContrasenia(){
        print("\nIntroduce ID de empleado: ")
        val id = readln().toInt()
        print("Introduce contraseña actual: ")
        admpsw = readln().toString()
        print("Introduce nueva contraseña: ")
        admpsw = readln().toString()

        println("\n******* Su contraseña fue actualizada con exito *******\n")
        usuariosMenu()
    }

    fun usuariosMenu(){
        do{
            bienvenida()
            ingresoUsuario()

            if (user == adm1 && admpsw == password || user == adm2 && admpsw == password) {

                println("\n ***** Bienvenido Administrador *****\n")

                //Menu para admin
                imprimirAdmin()
                fun opcionAdmin(){

                    val seleccion = readln().toInt()

                    when {

                        seleccion == 1 -> {
                            do {
                                println("\nIngrese Nueva Venta")
                                val produucto = Producto()
                                produucto.calculo()
                                println("¿Desea continuar con otra compra? 1.si 2.no")
                                val continuar = readln()!!.toInt()
                            } while (continuar == 1)
                            mensaje("Hasta Luego Gracias por utilizar sistema de ventas de Restaurante")

                        }
                        seleccion == 2 -> {
                            println("\nBienvenido al inventario")
                            val inventario1 = Inventario()
                            inventario1.mostrarProducto()
                            inventario1.mostrarmensaje()
                        }
                        seleccion == 3 -> {
                            println("\nCambia tu Contraseña")
                            cambioContrasenia()
                        }
                        seleccion == 4 -> {
                            println("\n-> Hasta Luego\n")
                            usuariosMenu()
                        }
                        else -> {
                            println("Ingrese una Opcion Valida")
                        }
                }
                }
                //manda a llamar la funcion opcionAdmin
                opcionAdmin()
            } else {
                if (user == vdr1 && vdrpsw == password || user == vdr2 && vdrpsw == password) {

                    println("\n ***** Bienvenido Vendedor *****\n")

                    //Menu para Vendedor
                    imprimirventas()
                    fun opcionVendedor(){
                        val seleccion = readln().toInt()

                        when {
                            seleccion == 1 -> {
                                do {
                                    println("Ingrese Nueva Venta")
                                    val vendedor = Producto()
                                    vendedor.calculo()
                                    println("¿Desea continuar con otra compra? 1.si 2.no")
                                    val continuar = readln()!!.toInt()
                                }while(continuar==1)
                                mensaje("Hasta Luego Gracias por utilizar sistema de ventas de Restaurante Esperanza")
                            }
                            seleccion == 2 -> {
                                println("Bienvenido al Inventario")
                                val inventario1 = Inventario()
                                inventario1.mostrarProducto()
                                inventario1.mostrarmensaje()

                            }
                            seleccion == 3 -> {
                                println("\n-> Hasta Luego\n")
                                usuariosMenu()
                            }
                            else -> {
                                println("Ingrese una Opcion Valida")
                            }
                    }
                    }
                    //llama la funcion opcionVendedor
                    opcionVendedor()
                } else {
                    if (user == inv1 && invpsw == password || user == inv2 && invpsw == password) {

                        println("\n ***** Bienvenido Invitado *****\n")

                        //Menu para Invitado
                        imprimirinvitado()
                        fun opcionsInvitado(){
                            val seleccion = readln().toInt()

                            when {
                                seleccion == 1 -> {
                                    println("Consulta tu Inventario")
                                    val inventario1 = Inventario()
                                    inventario1.mostrarProducto()
                                    inventario1.mostrarmensaje()

                                }
                                seleccion == 2 -> {
                                    println("\n-> Hasta Luego\n")
                                    usuariosMenu()
                                }
                                else -> {
                                    println("Ingrese una Opcion Valida")
                                }
                            }
                        }
                        //llama la funcion opcionInvitado
                        opcionsInvitado()
                    }
                    else {
                        intento ++
                        println("\n¡Usuario no registrado!")
                        println("Intento No. $intento \n\n")
                    }
                }
            }
        }while (intento <= 3) //Cantidad de intentos de ingreso de usuario

        println("!El sistema está desactivado!")
        println("Intertar de nuevo")
    }

    fun mensaje(mensaje:String){
        println("*****************************************************************************")
        println(mensaje)
        println("*****************************************************************************")
    }
}