package _01_04_03_01_01

// 1.4.3.1.1 positional parameters
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_positional_parameters


class Person {
    String name
    Integer age

    Person(name, age) {
        println "构造函数被调用了, name: ${name}, age: ${age}"
        this.name = name
        this.age = age
    }
}

{
    // 调用构造函数的方式有三种:

    // 1. 使用 new 关键字,
    def person01 = new Person("LUOTAO", 18)
    assert person01.name == 'LUOTAO'

    // 2. 将一个 list 强制转换为该类,
    def person02 = ["OWEN", 18] as Person
    assert person02.name == 'OWEN'

    // 3. 将一个 list 赋值给该类型的变量,
    Person person03 = ["罗韬", 18]
    assert person03.name == '罗韬'


    println '\n--------------------------------------------------\n'
}
