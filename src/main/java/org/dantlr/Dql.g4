

/**



*/
grammar Dql;
binding : Suffix Id Midl Endexpr;
Suffix: 'select'|'insert';
Id : [a-z]+ ;
Midl: 'from';
Endexpr:[a-z]+;