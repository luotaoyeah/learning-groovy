package _01_05_02_02

// 1.5.2.2 implicit parameter
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#implicit-it


{
    // 如果闭包的参数列表为空, 并且没有 ->, 则它有一个隐式的参数, 名字叫 it,

    def closure01 = { it + 1 }
    assert closure01.call(1) == 2

    // 等价于
    def closure02 = { it -> it + 1 }
    assert closure02.call(1) == 2

    println '\n--------------------------------------------------\n'
}

{
    // 如果闭包的参数列表为空, 但是加上了 ->, 则它不会有隐式的参数 it,

    def closure01 = { -> 1 }
    assert closure01() == 1

    println '\n--------------------------------------------------\n'
}