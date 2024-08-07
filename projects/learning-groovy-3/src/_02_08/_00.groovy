package _02_08

// 2.8 GString

//region
//----------------------------------------------------------------------------------------------------

// GString 是 groovy 特有的一个特殊的字符串类, 用双引号包裹,
def gstring = "HELLO"

// 如果用单引号包裹, 表示是 java 中的 String 类型,
def string = 'HELLO'

assert gstring == string

assert gstring instanceof String
assert string instanceof String

// GString 中可以通过 $xxx 引用某个变量, 或者 ${xxx} 执行某个表达式,
assert "gstring: $gstring, string: ${string}" == "gstring: HELLO, string: HELLO"

//----------------------------------------------------------------------------------------------------
//endregion