class Fraccion constructor(var numerador: Int, var denominador: Int){
    fun imprimir() = ("$numerador/$denominador")
}
/*operaciones*/
fun suma(f1: Fraccion,f2: Fraccion): Fraccion{
    var num: Int
    var den: Int
    var res: Fraccion
    if(f1.denominador != f2.denominador){
        den = f1.denominador * f2.denominador
        num = (f1.numerador*f2.denominador)+(f2.numerador*f1.denominador)
        res=Fraccion(num, den)
        return res
    }else{
        num = f1.denominador
        den = f1.numerador + f2.numerador
        res=Fraccion(num, den)
        return res
    }
}
fun resta(f1: Fraccion,f2: Fraccion): Fraccion{
    var num: Int
    var den: Int
    var res: Fraccion
    if(f1.denominador != f2.denominador){
        den = f1.denominador * f2.denominador
        num = (f1.numerador*f2.denominador)-(f2.numerador*f1.denominador)
        res=Fraccion(num, den)
        return res
    }else{
        num = f1.denominador
        den = f1.numerador - f2.numerador
        res=Fraccion(num, den)
        return res
    }
}
fun mul(f1: Fraccion,f2: Fraccion): Fraccion{
    var num: Int
    var den: Int
    var res: Fraccion
    den = f1.denominador * f2.denominador
    num = f1.numerador * f2.numerador
    res=Fraccion(num, den)
    return res
}
fun div(f1: Fraccion,f2: Fraccion): Fraccion{
    var num: Int
    var den: Int
    var res: Fraccion
    den = f1.denominador * f2.numerador
    num = f1.numerador * f2.denominador
    res=Fraccion(num, den)
    return res
}
//funcion principal
fun main(){
    var fraccion1 : Fraccion = Fraccion(1,2)
    var fraccion2 : Fraccion = Fraccion(2,3)
    var sum = suma(fraccion1, fraccion2)
    var res = resta(fraccion1, fraccion2)
    var mult = mul(fraccion1, fraccion2)
    var division = div(fraccion1, fraccion2)

    print("***********Calculadora de Fracciones***********")
    print("""
    Fraccion 1: ${fraccion1.imprimir()}
    Fraccion 2: ${fraccion2.imprimir()}
    -------------Resultados-------------
    Suma = ${sum.imprimir()}
    Resta = ${res.imprimir()}
    Multiplicacion = ${mult.imprimir()}
    Division =${division.imprimir()}
    """)
}
