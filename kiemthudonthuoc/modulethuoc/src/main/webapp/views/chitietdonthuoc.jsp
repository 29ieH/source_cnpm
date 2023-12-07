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
</head>
<c:set var="model" value="${applicationScope.model}"/>
<c:set var="listName" value="${applicationScope.listName}"/>
<c:set var="listCtdt" value="${applicationScope.listCtdt}"/>
<c:set var="bacsikedon" value="${applicationScope.bacSi}"/>
				<% 
					String error = (String)request.getAttribute("error");
					session = request.getSession(false);
					bacSi model = (bacSi)session.getAttribute("modelBS");
					String nofication = (String)request.getAttribute("notifi");
					if(session!=null&model!=null){
					String name = model.getTenBacSi();
				%>
				<% if(nofication!=null) {%>
				<script src="<c:url value = "/js/notification.js"/>"></script>
				<%}%>
<body>
<div class = "w-1462px">
      <div class="header">
                                <div class="header__logo">
                                    <img class="header__logo__item" src="<c:url value="/image/logo.jpg"/>" alt="">
                                </div>
                                <div style="width: 160px;"></div>
                                     <div  id ="div__error-mess" class="error__edit-mess">
              			  <button id = "div__error-close" class="error__edit-mess--close">
                    	<i class="fa-regular fa-circle-xmark"></i>
                			</button>
                			<h5 class="error__edit-mess--heading">
                    		Thông Báo !
                			</h5>
                		<p class="error__edit-mess--text"> 
                   				<%=nofication%>
               				 </p>
            					</div>
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
    <div class="chi_tiet_ho_so">
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
        <div class="function-category">
            <div class="chi_tiet_ho_so-category-first">
                <p>Chi tiết đơn thuốc</p>
            </div>
            <div class="chi_tiet_ho_so-category-content">
                <div class="chi_tiet_ho_so-category-content-headline">
                    <p>Thông tin chi đơn thuốc</p>
                </div>
                <div class="chi_tiet_ho_so-category-content-first">
                    <div class="chi_tiet_ho_so-category-content-first-A">
                        <ul>
                        
                            <li>Tên bệnh nhân</li>
                            <p>${model.tenBenhNhan}</p>
                            <li>Tuổi</li>
                            <p>${model.tuoi}</p>
                            <li>Số điện thoại liên lạc</li>
                            <p>${model.soDienThoai}</p>
                            <li>Chuẩn đoán của bác sĩ</li>
                            <p>${model.benhLy}</p>
                            <c:if test="${bacsikedon!=null}">
                            <p>Bác sĩ kê đơn : ${bacsikedon.getTenBacSi()}</p>
                            </c:if>
                        </ul>
                    </div>
                    <div class="chi_tiet_ho_so-category-content-first-B">
                    <%if(error!=null){%>
                    <p><%=error%></p>
                    <% }%>
                        <ul>
                            <form action="<c:url value="/kedonthuoc"/>" method="get">
                            <c:if test="${listCtdt.size()<=0}">
                            </c:if>
                            <c:if test="${listCtdt.size()>0}">
                            <c:set var = "count" value ="0"/>
                            <c:forEach var="item" items="${listCtdt}">
                                <li class="input_ctdt_item">
                                <c:if test="${listName!=null}">
                                    <p style="margin: 5px 0px 4px 5px;" class="ctdt_text">Tên thuốc : ${listName[count]}</p>
                                    <input type="hidden" name="tenThuoc${count}" value="${listName.get($count)}">
                                 </c:if>
                                    <p style="margin: 5px 0px 4px 5px;" class="ctdt_text  ">${item.danDoCuaBacSy}</p>
                                    <input type="hidden" name="danDoCuaBacSi${count}" value="${item.danDoCuaBacSy}">
                                    <div style="display: flex;">
                                        <p class="ctdt_text">Liều dùng<input  class="input_ctdt" style="width: 50px;" value="${item.soLuongDungTrenMotLan}" type="number" name="dose${count}" id="" min="1">/ lần</p>
                                        <p class="ctdt_text b-left">Số lần dùng : <input class="input_ctdt" style="width: 50px;" value="${item.soLanUongTrenMotNgay}" type="number" name="frequency${count}" min="1">/ ngày</p>
                                        <p class="ctdt_text b-left">Số lượng : <input class="input_ctdt" style="width: 50px;" value ="${item.soLuongMua}" type="number" name="amount${count}" min="1"></p>
                                    </div>
                                </li>
                                <input type="hidden" name="idThuoc${count}" value ="${item.idThuoc}">
                                <c:set var ="count" value="${count+1}"/>
                               </c:forEach>
                             </c:if>
                            	 <input type="hidden" name="idbn" value="${model.getIdHoSoBenhNhan()}">
                             	<input type="hidden" name="iddt"value="${listCtdt.get(0).getIdDonThuoc()}"> 
                             	<input type="hidden" name="idbs" value="${bacSi.getIdBacSi()}">
                                <button class="ctdt__button">Kê lại đơn</button>
                            </form>
                            
                        </ul>
                    </div>
                </div>

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