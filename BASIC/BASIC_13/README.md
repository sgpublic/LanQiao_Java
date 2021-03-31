## 十六进制转八进制 BASIC-12

#### 问题描述

十六进制数是在程序设计时经常要使用到的一种整数的表示方式。它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，以此类推，十进制的30在十六进制中是1E。

给出一个非负整数，将它表示成十六进制的形式。

#### 输入格式

输入的第一行为一个正整数n （1<=n<=10）。

接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。

#### 输出格式

输出n行，每行为输入对应的八进制正整数。

**【注意**】

输入的十六进制数不会有前导0，比如012A。

输出的八进制数也不能有前导0。

#### 样例输入

```
2
39
123ABC
```

#### 样例输出

```
71
4435274
```

**【提示】**

先将十六进制数转换成某进制数，再由某进制数转换成八进制。