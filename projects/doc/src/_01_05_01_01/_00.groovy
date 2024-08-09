package _01_05_01_01

// 1.5.1.1 defining a closure
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_defining_a_closure


{
    // 闭包体中可以没有语句, 此时该闭包的返回值为 null,
    def closure01 = { x -> }
    assert closure01() == null


    println '\n--------------------------------------------------\n'
}

{
    def item = 1
    def closure01 = {
        // 在闭包中, 引用外面的变量,
        item++
    }
    assert closure01() == 1

    println '\n--------------------------------------------------\n'
}

{
    // 闭包中的 -> 用来分隔参数列表和闭包语句, 如下参数列表为空,
    def closure01 = { -> 1 }
    assert closure01() == 1

    println '\n--------------------------------------------------\n'
}

{
    // 隐式参数 it 表示该闭包的唯一参数,
    def closure01 = { it + 1 }
    assert closure01(1) == 2

    // 如下的闭包跟上面的闭包等价,
    def closure02 = { i -> i + 1 }
    assert closure02(1) == 2

    println '\n--------------------------------------------------\n'
}

{
    // 如下的闭包定义了两个参数, 并且指定了它们的类型,
    def closure01 = { String x, int y -> "param01: ${x}, param02: ${y}" }
    assert closure01('A', 9) == "param01: A, param02: 9"

    println '\n--------------------------------------------------\n'
}