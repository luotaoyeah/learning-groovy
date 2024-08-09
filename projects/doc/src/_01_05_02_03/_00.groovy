package _01_05_02_03

// 1.5.2.3 varargs
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_varargs_2


{
    // 最后一个参数, 前面如果加上三个点 ..., 表示它是一个可变参数,
    def closure01 = { x, ... y -> y.join(",") }
    assert closure01('X', 'A', 'B', 'C') == 'A,B,C'

    // 指定参数类型,
    def closure02 = { x, String... y -> y.join(",") }
    assert closure02('X', 'A', 'B', 'C') == 'A,B,C'

    println '\n--------------------------------------------------\n'
}

{

    // 最后一个参数, 如果它是一个数组类型, 则它也是一个可变参数,
    def closure = { x, String[] y -> y.join(",") }
    assert closure('X', 'A', 'B', 'C') == 'A,B,C'

    println '\n--------------------------------------------------\n'
}
