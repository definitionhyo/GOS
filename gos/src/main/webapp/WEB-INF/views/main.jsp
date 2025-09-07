<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>GOS</title>
    <!-- 부트스트랩 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
</head>
<body>
    <!-- 헤더 / 네비게이션 바 -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="/">MyPortfolio</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="login">Login</a></li>
                    <li class="nav-item"><a class="nav-link" href="register">Sign Up</a></li>
                    <li class="nav-item"><a class="nav-link" href="BoardList">Board</a></li>
                    <li class="nav-item"><a class="nav-link" href="BoardWriteForm">Write</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- 메인 컨텐츠 -->
    <div class="container mt-4">
        <h2>최근 게시물</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="board" items="${boardList}">
                    <tr>
                        <td><a href="BoardDetail?board_num=${board.board_num}">${board.board_subject}</a></td>
                        <td>${board.board_name}</td>
                        <td><fmt:formatDate value="${board.board_date}" pattern="yyyy-MM-dd"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- 푸터 -->
    <footer class="bg-dark text-white text-center py-3 mt-5">
        &copy; 2025 My Portfolio | <a href="https://github.com/username" class="text-white">GitHub</a>
    </footer>

    <!-- 부트스트랩 JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>