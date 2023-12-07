<%@page import="model.bacSi"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@include file = "/util/taglib.jsp"%>
     <%@include file = "/util/libfont.jsp"%>
     <%@include file = "/util/libweb.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value ="/css/style.css"/>">
<link rel="stylesheet" href="<c:url value ="/css/ds.css"/>">
</head>
<c:set var="model" value="${applicationScope.model}"/>
<c:set var="listThuoc" value="${applicationScope.listThuoc}"/>
<c:set var="tenLoai" value="${applicationScope.tenLoai}"/>
				<% 
					bacSi model = (bacSi)session.getAttribute("modelBS");
					if(session!=null&model!=null){
					String name = model.getTenBacSi();
				%>
			<c:set var ="bs" value="${sessionScope.modelBS}"/>
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
        <div class="list">
            <div class="list-list">
                <div class="list-list-first">
                    <i class="fa-solid fa-bars"></i>
                    <p>Chức Năng</p>
                </div>
                <div class="list-list-second">
                    <ul>
                     						 <a class="list_second__flex" href="<c:url value="/dtb-hsbn?page=1&maxItemsPage=3" />">
                                                <i class="list_second__icon fa-regular fa-address-book"></i> 
                                                <p class="list_second__text">Hồ sơ bệnh nhân</p>
                                                </a>
                                            
												 <a class="list_second__flex" href="<c:url value="/donthuocmoi"/>?idBn=${model.idHoSoBenhNhan}">
                                                <i class="list_second__icon fa-solid fa-capsules"></i>
                                                <p class="list_second__text"> Tạo đơn thuốc mới</p>
                                                </a>
                                            
                                               <a class="list_second__flex" href="<c:url value="/danhmucthuoc"/>">
                                                <i class="list_second__icon fa-solid fa-clipboard-list"></i>
                                                <p class="list_second__text"> Danh mục thuốc</p>
                                                </a>

                    </ul>
                </div>
            </div>
            <div class="list-category">
                <div class="list-category-first">
                    <form class="form__search" action="" method="get">
                        <input type="hidden" name="page" value="1">
                        <input type="hidden" name="maxItemsPage" value="3">
                        <div class="tra_cuu">
                            <p>Tra cứu thuốc</p>
                            <input name="name" class="input-list" type="text" placeholder="Nhập tên thuốc để tìm kiếm " name="name">
                        </div>
                        <button style="    border: none;background: none;" type="submit" class="custom-button"><i class="fa-solid fa-magnifying-glass"></i></button>
                    </form>
                </div>
                <div class="list-category-content">
                    <div class="list-category-content-headline">
                        <div class="category-content-headline">
                        <c:if test="${listThuoc.size()>0}">
                        	<c:forEach var="item" items="${listThuoc}">
                            <a href="<c:url value="/taodonthuocdanhmuc?idt=${item.idThuoc}&idbn=${model.idHoSoBenhNhan}&idbs=${bs.idBacSi}"/>">
                                <div class="content-headline">
                                    <p>${item.tenThuoc}</p>
                                    <span>${item.moTaThuoc}</span>
                                  </div>
                              </a>
                              </c:forEach>
                         	</c:if>
                         	<c:if test="${listThuoc.size()<=0}">
                         	<h5>Chưa có thuốc nào thuộc hệ thuốc này</h5>
                         	</c:if>      
                               
                            </a>
                        </div>
                    </div>
                </div>
            </div>
</body>
   <% } else {
                    	response.sendRedirect("/modulethuoc/index.jsp");
                    }
                    %>
</html>