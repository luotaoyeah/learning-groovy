package _01_01_01_03

// 1.1.1.3 groovydoc comment
// https://docs.groovy-lang.org/docs/groovy-4.0.22/html/documentation/#_groovydoc_comment


// 当前文件需要通过执行配置 「syntax._01_03._00」,

//region
//----------------------------------------------------------------------------------------------------

// runtime groovydoc 指的是, 在运行时可以访问的文档注释,
// 默认禁用, 通过参数启用: -Dgroovy.attach.runtime.groovydoc=true
// runtime groovydoc 以 /**@ 开头,


/**@
 * 我是 runtime groovydoc.
 */
class C01 {}

assert C01.class.groovydoc.content.contains('我是 runtime groovydoc.')

//----------------------------------------------------------------------------------------------------
//endregion