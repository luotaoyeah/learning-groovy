package _01_04_03_01_02

// 1.4.3.1.2 named parameters
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_named_parameters


class C01 {
    String name
    Integer age
}

{
    // 如果一个类有一个无参构造函数, 则可以使用 named parameters 方式调用构造函数,
    // 即参数是一个 map 的形式, 其中的每一个 key 对应的是该类的一个属性,
    C01 c01a = new C01(name: 'LUOTAO', age: 18)
    assert c01a.name == 'LUOTAO'

    println '\n--------------------------------------------------\n'
}

class C02 {
    String name
    Integer age

    C02(Map<String, Object> param) {
        this.name = param.name
        this.age = param.age
    }
}

{
    // 如果一个类有一个构造函数, 它的第一个参数类型为 Map, 则也可以使用 named parameters 方式调用构造函数,
    C02 c02a = new C02(name: 'LUOTAO', age: 18)
    assert c02a.name == 'LUOTAO'

    println '\n--------------------------------------------------\n'
}