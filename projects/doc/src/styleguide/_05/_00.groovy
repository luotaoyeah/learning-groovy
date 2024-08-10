package styleguide._05

// 5 omitting parentheses
// https://groovy-lang.org/style-guide.html#_omitting_parentheses

// 在不产生歧义的情况下, 调用方法时, 圆括号可以省略不写,

def fn01(Map param) {
    "${param.x}, ${param.y}"
}

{
    println('HELLO')
    println 'HELLO'


    // 有圆括号, 使用 positional parameters 方式
    def result01 = fn01([x: 1, y: 2])

    // 有圆括号, 使用 named parameters 方式
    def result02 = fn01(x: 1, y: 2)

    // 无圆括号, 使用 named parameters 方式
    def result03 = fn01 x: 1, y: 2

    assert result01 == '1, 2'
    assert result02 == '1, 2'
    assert result03 == '1, 2'

    println '\n--------------------------------------------------\n'
}


// 如果方法的最后一个参数是一个闭包, 则调用该方法时, 闭包可以放在圆括号的外面,

def fn02(Integer x, Closure c) {
    "${x}, ${c()}"
}

{
    // 正常调用,
    def result01 = fn02(1, { 2 })
    assert result01 == '1, 2'

    // 闭包放在圆括号的外面,
    def result02 = fn02(1) { 2 }
    assert result02 == '1, 2'

    // 闭包放在圆括号的外面, 并且省略方法的圆括号,
    def result03 = fn02 1, { 2 }
    assert result03 == '1, 2'

    println '\n--------------------------------------------------\n'
}