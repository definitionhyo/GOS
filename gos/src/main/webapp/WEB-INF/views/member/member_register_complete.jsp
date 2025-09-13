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
            <a class="navbar-brand" href="${pageContext.request.contextPath}/">GOS</a> <!-- main으로 가는 프로젝트 루트 -->
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="loginForm">Login</a></li>
                    <li class="nav-item"><a class="nav-link" href="register">Sign Up</a></li>
                    <li class="nav-item"><a class="nav-link" href="BoardList">Board</a></li>
                    <li class="nav-item"><a class="nav-link" href="BoardWriteForm">Write</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- 메인 컨텐츠 -->
    <div class="container d-flex justify-content-center align-items-center" style="min-height: 80vh;">
        <div class="card shadow-lg p-4" style="width: 400px;">
            <h3 class="text-center mb-4">회원가입완료 로그인해주세요</h3>
			<a href="loginForm" class="btn btn-dark w-100">로그인</a>
        </div>
    </div>
	
	
	
    <!-- 푸터 -->
    <footer class="bg-dark text-white text-center py-3 mt-5">
        &copy; 2025 My Portfolio | <a href="https://github.com/username" class="text-white">GitHub</a>
    </footer>

    <!-- 부트스트랩 JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>