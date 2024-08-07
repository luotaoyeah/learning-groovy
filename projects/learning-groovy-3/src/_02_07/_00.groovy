package _02_07

// 2.7 easy properties

//region
//----------------------------------------------------------------------------------------------------
// groovy 中所有的数据全都是 public 的,
// groovy 会自动创建 getter/setter,

class Person {
    String name = "LUOTAO"
    Integer age = 18
}

def person = new Person()

// 如下等价
assert person.name == 'LUOTAO'
assert person.getName() == 'LUOTAO'

// 如下等价
person.name = 'luotao'
person.setName('luotao')

assert person.name == 'luotao'

//----------------------------------------------------------------------------------------------------
//endregion