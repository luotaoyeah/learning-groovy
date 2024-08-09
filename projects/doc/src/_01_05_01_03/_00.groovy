package _01_05_01_03

// 1.5.1.3 calling a closure
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_calling_a_closure


{
    // 调用闭包有下面两种方式,

    def closure = { it + 1 }

    assert closure(1) == 2
    assert closure.call(1) == 2

    println '\n--------------------------------------------------\n'
}