

grammar Dql;
binding : suffix id  midl endexpr;
suffix: 'select'|'insert';
id: '[a-z]+';
midl: 'from';
endexpr:'[a-z]+';