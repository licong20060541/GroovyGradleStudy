println "hello groovy"

def var1 = 1
def var2 = "hehe"
def int x = 1

println var2
println x
println x.getClass().getCanonicalName() // java.lang.Integer

// x = "dd" -- 错误

def getValue() {
    "line 111111"
    "line 12222" // return this 
}

println(getValue())
println getValue() // 等价


def singleQuote='I am $ dolloar'

println singleQuote


// def mQuoteQuote="I am $1 dolloar" 
//println mQuoteQuote // 报错 $1

def mQuoteQuote="I am $x dolloar"
println mQuoteQuote // I am 1 dolloar

def multieLines = ''' begin
11
222
333'''
println multieLines
/* begin
11
222
333*/

def mList = [1, 2]
assert mList[5] == null
// assert mList[5] == 3 // error


def mMap = ["key1":'value1',]
// below three line are same result!!!
println mMap.key1
println mMap['key1']
println mMap["key1"]


def mRange = 1..<5
println mRange //[1, 2, 3, 4]

