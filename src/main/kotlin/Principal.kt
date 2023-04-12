
class Personaje(
    private var nombre : String,
    private var vida : Int,
    private var defensa : Int,
    private var ataque : Int,
    private var raza : String,
    private var oficio : String
){
    fun getNombre():String{
        return nombre
    }
    fun setNombre(nombre: String){
        this.nombre = nombre
    }


    fun getVida():Int{
        return vida
    }
    fun setVida(vida: Int){
        this.vida = vida
    }


    fun getDefensa():Int{
        return defensa
    }
    fun setDefensa(defensa: Int){
        this.defensa = defensa
    }


    fun getAtaque():Int{
        return ataque
    }
    fun setAtaque(ataque: Int){
        this.ataque = ataque
    }


    fun getRaza():String{
        return raza
    }
    fun setRaza(raza: String){
        this.raza = raza
    }


    fun getOficio():String{
        return oficio
    }
    fun setOficio(nombre: String){
        this.oficio = oficio
    }


    fun setAumentarVida(){
        this.vida = vida + 10
    }

    fun setAumentarDefensa(){
        this.defensa = defensa +10
    }
}


class Articulo(
    private var nombre : String,
    private var peso : Int,
    private var valor : Int
    ){

    fun getNombre():String{
        return nombre
    }
    fun setNombre(nombre: String){
        this.nombre = nombre
    }

    fun getPeso():Int{
        return peso
    }
}