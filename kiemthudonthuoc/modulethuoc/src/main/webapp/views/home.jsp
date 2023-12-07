<%@page import="model.bacSi"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@include file="/util/taglib.jsp" %>
        <%@include file="/util/libweb.jsp" %>
            <%@include file="/util/libpagination.jsp" %>
                <%@include file="/util/libfont.jsp" %>
                    <!DOCTYPE html>
                    <html>

                    <head>
                        <meta charset="UTF-8">
                        <title>Insert title here</title>
                    </head>
                    <c:set var="list" value="${listResult}" />
                    <c:set var="listSearch" value="${listResultSearch}"/>
				<%
					bacSi model = (bacSi)session.getAttribute("modelBS");
					if(session!=null&model!=null){
					String name = model.getTenBacSi();
				%>
                    <body>
                        <div class="w-1462px">
                            <div class="header">
                                <div class="header__logo">
                                    <img class="header__logo__item" src="<c:url value="/image/logo.jpg"/>" alt="">
                                </div>
                                <div style="width: 160px;"></div>
                                <ul class="header__list">
                                    <li class="header__item">Home</li>
                                    <li class="header__item">Contact</li>
                                    <div class="user__login">
                                        <li class="header__item">
                                        <% if(model.getGioiTinh().equals("Nam")){ %>
                                            <img class="header__item__img" src="<c:url value="/image/user.jpg"/>"
                                            alt="">
                                          <% } else { %>
                                           <img class="header__item__img" src="<c:url value="/image/womandoctor.png"/>"
                                            alt="">
                                           <% } %>
                                        </li>
                                        <li class="header__item"><%=name%></li>
                                        <a href="<c:url value ="/logout"/>">
                                            <li class="header__item"><i class="fa-solid fa-right-from-bracket"></i></li>
                                        </a>
                                    </div>
                                </ul>
                            </div>
                            <div class="function">
                                <div class="function-list">
                                    <div class="function-list-first">
                                        <i class="fa-solid fa-bars"></i>
                                        <p>Chức Năng</p>
                                    </div>
                                    <div class="function-list-second">
                                        <ul>
                                                <a class="list_second__flex" href="<c:url value="/dtb-hsbn?page=1&maxItemsPage=3" />">
                                                <i class="list_second__icon fa-regular fa-address-book"></i> 
                                                <p class="list_second__text">Hồ sơ bệnh nhân</p>
                                                </a>
                                            
                                     
                            
                                        </ul>
                                    </div>
                                </div>
                                <div class="function-category">
                                    <div class="function-category-first">
                                        <form class="form__search" action="<c:url value="/search-hsbn"/>" method="get">
                                        <input type = "hidden" name = "page" value ="1">
                                        <input type = "hidden" name = "maxItemsPage" value ="3">
                                        <input name = "name" class="input-function" type="text"
                                            placeholder="Nhập vào tên bệnh nhân để tìm kiếm " name="name">
                                        <button style="    border: none;background: none;" type="submit"
                                            class="custom-button"><i class="fa-solid fa-magnifying-glass"></i></button>
                                        </form>
                                        <div class="function-category-first-title">
                                            <a style="display: flex; justify-content: center;
   	 				align-items: center; color : #ffff;" href="<c:url value =" /views/themhosobenhnhan.jsp" />">
                                            <i class="fa-solid fa-plus"></i>
                                            <p>Thêm hồ sơ bệnh nhân</p>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="function-category-content">
                                        <div class="function-category-content-headline">
                                            <p>Danh sách các bệnh nhân hiện có trong phòng khám</p>
                                        </div>
                                        <form action="<c:url value="/dtb-hsbn"/>" id = "myForm">
                                        <c:if test="${list.size()<=0}">
                                        </c:if>
                                        <c:if test="${list.size()>0}">
                                            <c:forEach var="item" items="${list}">
                                                <div class="function-category-content-first">
                                                    <div class="function-category-content-first-A">
                                                        <ul class="title">
                                                            <li class="title--item">
                                                                <p class="row"><span class="row-title">Mã bệnh nhân:
                                                                        BNS${item.idHoSoBenhNhan} </span><span>SĐT:
                                                                        ${item.soDienThoai}</span> </p>
                                                                <p class="row"><span class="row-title">Tên bệnh nhân:
                                                                        ${item.tenBenhNhan}</span><span>Giới tính:
                                                                        ${item.gioiTinh} </span> </p>
                                                                <p class="row"><span class="row-title">Địa chỉ:
                                                                        ${item.diaChi}</span></p>

                                                            </li>
                                                        </ul>
                                                    </div>

                                                    <div class="function-category-content-first-B">
                                                        <div class="function-category-content-first-B-b">
                                                            <p>
                                                                <a style="color: #0d6efd;" href="<c:url value="/cths?id=${item.idHoSoBenhNhan}"/>"
                                                                class="query-button">
                                                                <i class="fa-solid fa-eye"></i>
                                                                View
                                                                </a>
                                                            </p>
                                                        </div>
                                                        <div class="function-category-content-first-B-b">
                                                            <p>
                                                                <a style="color: #0d6efd;" href="#"
                                                                    class="query-button">
                                                                    <i class="fa-solid fa-pencil"></i>
                                                                    Sửa
                                                                </a>
                                                            </p>
                                                        </div>
                                                        <div class="function-category-content-first-B-b">
                                                            <p>
                                                                <a style="color: #0d6efd;" href="#"
                                                                    class="query-button">
                                                                    <i class="fa-solid fa-trash"></i>
                                                                    Xóa
                                                                </a>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:forEach>
                                        </c:if>
                                        <input type="hidden" id="page" name="page" value="">
                                        <input type="hidden" id="maxItemsPage" name="maxItemsPage" value="">
                                        <div class="m-l-30">
                                            <ul class="pagination" id="pagination"></ul>
                                        </div>
                                        </form>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <script>
                            var currentPage = ${ currentPage };
                            var totalPagez = ${ totalPage };
                            var limit = 3;
                            $(function () {
                                window.pagObj = $('#pagination').twbsPagination({
                                    totalPages: totalPagez,
                                    visiblePages: 5,
                                    startPage: currentPage,
                                    onPageClick: function (event, page) {
                                        if (currentPage != page) {
                                            $('#page').val(page);
                                            $('#maxItemsPage').val(limit);
                                            $('#myForm').submit();
                                        }
                                    }
                                });
                            });
                        </script>
                    </body>
                    <% } else {
                    	response.sendRedirect("/modulethuoc/index.jsp");
                    }
                    %>
                    </html>