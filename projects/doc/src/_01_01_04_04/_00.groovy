package _01_01_04_04

// 1.1.4.4 double-quoted string
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_double_quoted_string


{
    // 双引号包裹的字符串, 如果里面不包含表达式, 则类型为 java.lang.String,
    def str01 = "AAA"
    assert str01 instanceof String

    // 双引号包裹的字符串, 如果里面包含了表达式, 则类型为 groovy.lang.GString,
    def str02 = "$str01 BBB"
    assert str02 instanceof GString

    println '\n--------------------------------------------------\n'
}

{
    // ${} 中不仅可以包含表达式, 还可以包含语句, 整个 ${} 的值为里面最后一个表达式(或者语句)的值,
    def str01 = "1 + 2 = ${println 'HAHA'; 1 + 2}"
    assert str01 == '1 + 2 = 3'


    // 任何语句的值都为 null,
    def str02 = "${println "HAHA"}"
    assert str02 == 'null'

    println '\n--------------------------------------------------\n'
}