package _02_06

// 2.6 everything is an object

//region groovy 中没有原始类型(int,double,...), 所有的字面量都是其包装类型(Integer,Double,...),
//----------------------------------------------------------------------------------------------------
assert 99 instanceof Integer

// 直接在数字字面量上调用方法, 这在 java 中是不允许的,
assert 99.equals(99)
//----------------------------------------------------------------------------------------------------
//endregion