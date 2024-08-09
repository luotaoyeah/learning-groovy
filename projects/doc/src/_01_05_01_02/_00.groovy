package _01_05_01_02

// 1.5.1.2 closure-as-object
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#closure-as-object


{
    // 闭包本质上是 Closure 类的一个实例对象,
    def closure01 = {}
    assert closure01 instanceof Closure

    println '\n--------------------------------------------------\n'
}

{
    // 显式声明类型,
    Closure closure = { 9 }
    assert closure() == 9

    println '\n--------------------------------------------------\n'
}