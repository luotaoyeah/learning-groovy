package _01_01_04_03

// 1.1.4.3 triple-single-quoted string
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_triple_single_quoted_string


//region runtime groovydoc
//----------------------------------------------------------------------------------------------------

// 三个单引号包括的字符串可以跨越多行,

def str01 = '''[
A
B
C]'''

println str01

println '--------------------------------------------------'

// 如果在行尾加上 \, 表示将该换行符从最终的字符串中删除,
def str02 = '''[\
A
B\
C]'''

println str02

//----------------------------------------------------------------------------------------------------
//endregion