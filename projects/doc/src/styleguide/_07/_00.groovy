package styleguide._07

// 7 getters and setters
// https://groovy-lang.org/style-guide.html#_getters_and_setters


class C01 {
    String name
}

// 默认, groovy 会帮我们生成 getter 和 setter,
{
    def c = new C01(name: 'LUOTAO')

    assert c.getName() == 'LUOTAO'

    c.setName('OWEN')
    assert c.getName() == 'OWEN'

    println '\n--------------------------------------------------\n'
}

// 可以通过 obj.key 的形式, 来调用 getter 和 setter,
{

    def c = new C01(name: 'LUOTAO')

    // 下面两行等价,
    assert c.getName() == 'LUOTAO'
    assert c.name == 'LUOTAO'

    // 下面两行等价,
    c.setName('OWEN')
    c.name = 'OWEN'

    assert c.name == 'OWEN'

    println '\n--------------------------------------------------\n'
}