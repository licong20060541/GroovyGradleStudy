
// 闭包, 不定义参数时，有个默认参数it接收输入
def mList = [1, 2, 3]
mList.each {
    println it // 默认参数
}
// 上面对应的完整格式参数
mList.each( {
    it -> println it
})



def mDemo(int a1, String b2, Closure closure) {
    closure()
}

mDemo(4, "test", {
		println 'I am in closure'
    }
)
// 上下功能一致
mDemo 4, "test", {
	println 'I am in closure'
}


