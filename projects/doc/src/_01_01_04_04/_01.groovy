package _01_01_04_04

// 1.1.4.4 double-quoted string
// special case of interpolating closure expressions
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_special_case_of_interpolating_closure_expressions


{
    // 当 ${} 中包含 -> 时, 表示它里面是一个 closure expression, 闭包表达式,

    def x = 9
    def str01 = "${-> x}"
    assert str01 == '9'

    println '\n--------------------------------------------------\n'
}

{
    // 闭包表达式和普通表达式的区别是,
    //     普通表达式, 在定义字符串的时候就会求值, 值就确定了,
    //     闭包表达式, 在每次使用字符串的时候才会求值, 每次的值都可能不一样,

    def x = 6
    def str01 = "${x}" // 此时 ${x} 的值就确定了, 会始终是 6,
    def str02 = "${-> println 'x: ' + x; x}" // 此时 ${} 中的闭包不会执行, 因此它的值没确定,

    assert str01 == '6'
    assert str02 == '6' // 此时 str02 被使用了, 此时 ${} 中的闭包就会执行, 得到结果 6,

    x = 9

    assert str01 == '6'
    assert str02 == '9' // 此时 str02 被使用了, 此时 ${} 中的闭包就会执行, 得到结果 9,

    println '\n--------------------------------------------------\n'
}

{
    // 字符串中的闭包, 必须是零个参数的, 或者是一个参数的,
    def str01 = "${x -> x << 'A'}"
    assert str01 == 'A'

    println '\n--------------------------------------------------\n'
}