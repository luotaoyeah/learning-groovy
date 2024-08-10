package _03_21_01

// 3.21.1 domain-specific languages / command chains
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_command_chains


class C01 {

    C01 fn01(String x) {
        println 'fn01()'
        this
    }

    C01 fn02(String y) {
        println 'fn02()'
        this
    }

    def fn03(String z) {
        println 'fn03()'

        z
    }
}

{
    def c = new C01()

    def result01 = c.fn01('A').fn02('B').fn03('C')
    assert result01 == 'C'

    // 多个方法的链式调用, 可以简写成下面这种形式,
    def result02 = c.fn01 'A' fn02 'B' fn03 'C'
    assert result02 == 'C'

    println '\n--------------------------------------------------\n'
}
