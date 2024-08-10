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
}
