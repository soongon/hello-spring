<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오전 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
                <li role="presentation"><a href="#">Contact</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">글쓰기 화면입니다.</h3>
    </div>

    <div class="jumbotron">
        <form action="/bbs/write" method="post">
            <div class="input-group input-group-lg">
                <span class="input-group-addon">
                    <i class="glyphicon glyphicon-ok-sign"></i>
                </span>
                <input type="text" name="articleId" class="form-control" placeholder="글번호">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon">제목</span>
                <input type="text" name="title" class="form-control" placeholder="제목">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon">작성자</span>
                <input type="text" name="author" class="form-control" placeholder="작성자">
            </div>
            <div class="input-group input-group-lg">
                <span class="input-group-addon">내용</span>
                <textarea name="content" class="form-control" placeholder="내용">
                </textarea>
            </div>
            <p><input type="submit" value="글 등록하기" class="btn btn-lg btn-success" ></p>
        </form>
    </div>

    <div class="row marketing">
        <div class="col-lg-6">
            <h4>Subheading</h4>
            <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

            <h4>Subheading</h4>
            <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum.</p>

            <h4>Subheading</h4>
            <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
        </div>

        <div class="col-lg-6">
            <h4>Subheading</h4>
            <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

            <h4>Subheading</h4>
            <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum.</p>

            <h4>Subheading</h4>
            <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
        </div>
    </div>

    <footer class="footer">
        <p>&copy; 2016 Company, Inc.</p>
    </footer>

</div> <!-- /container -->
</body>
</html>
