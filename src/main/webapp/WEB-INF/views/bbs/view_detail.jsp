<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${article.articleId}번 글이 조회되었습니다.</h1>
<ul>
    <li>${article.articleId}</li>
    <li>${article.title}</li>
    <li>${article.author}</li>
    <li>${article.content}</li>
</ul>
<a href="/bbs">전체보기</a>
<a href="/bbs/write">글쓰기</a>
</body>
</html>
