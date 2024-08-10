package _01_04_03_02_02

// 1.4.3.2.2 class members / methods / named parameters
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_named_parameters_2


/**
 * 如果方法的第一个参数类型为 Map, 则可以使用 named parameters 方式调用该方法,
 */
def fn01(Map param) {
    "${param.name}: ${param.age}"
}

{
    assert fn01(name: 'LUOTAO', age: 18) == 'LUOTAO: 18'

    println '\n--------------------------------------------------\n'
}