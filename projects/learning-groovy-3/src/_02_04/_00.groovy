package _02_04

// 2.4 List and Map definitions

//region list
//----------------------------------------------------------------------------------------------------
def list01 = ["A", "B", "C"]
assert list01.size() == 3
assert list01 instanceof ArrayList

// 支持运算符重载,
list01 += 'D'
assert list01.size() == 4
//----------------------------------------------------------------------------------------------------
//endregion

//region map
//----------------------------------------------------------------------------------------------------
def map01 = [x: 1, y: 2]
assert map01 instanceof LinkedHashMap

// 直接通过 obj.key 获取某个 value,
assert map01.x == 1

// 直接通过 obj.key 赋值某个 value,
map01.x = 2

assert map01.x == 2

assert map01.x instanceof Integer
//----------------------------------------------------------------------------------------------------
//endregion
