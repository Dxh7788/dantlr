
/**
*语法Assign的命名
*/
grammar Assign;
/**
*assign代表一个完整的句子;比如 mnt = 1*3+7;或者mnt :=1*3+7;
*使用 ID '=' expr '或者ID ':=' expr '抽象出来;
* ID代表左侧,expr代表右侧.
* ID的规则是 任意个a到z的字符组成的短句phrase
* 标签expr的规则是 NUMBER
* NUMBER的意思是 最多两位数字乘以0或者小数,如 11*1.9,8*0.9等
*/
assign : ID '=' expr ';'
         | ID ':=' expr ';' ;
ID : [a-z]+ ;
expr : NUMBER ;
NUMBER : [1-9][0-9]*|[0]|([0-9]+[.][0-9]+) ;