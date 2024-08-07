package _01_01_03_02

// 1.1.3.2 quoted identifiers
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_quoted_identifiers


//region
//----------------------------------------------------------------------------------------------------

// 点(.)后面的标识符可以用双引号(或者单引号)括起来, 通常当标识符包含特殊字符时, 必须括起来,

// 定义一个空的 map,
def map01 = [:]

map01.name = "LUOTAO"
map01."name 01" = "LUOTAO"
map01.'name 02' = "LUOTAO"

assert map01.name == "LUOTAO"
assert map01."name 01" == "LUOTAO"
assert map01.'name 02' == "LUOTAO"

//----------------------------------------------------------------------------------------------------
//endregion