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
<c:set var="listDonThuoc" value="${applicationScope.listDonThuoc}"/>
				<% 
					bacSi model = (bacSi)session.getAttribute("modelBS");
					if(session!=null&model!=null){
					String name = model.getTenBacSi();
				%>
<body>
<div class = "w-1462px">
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
                <p>Thông tin chi tiết của bệnh nhân</p>
            </div>
            <div class="chi_tiet_ho_so-category-content">
                <div class="chi_tiet_ho_so-category-content-headline">
                    <p>Thông tin chi tiết của bệnh nhân</p>
                </div>
                <div class="chi_tiet_ho_so-category-content-first">
                    <div class="chi_tiet_ho_so-category-content-first-A">
                        <ul>
                            <li>Tên bệnh nhân</li>
                            <p>${model.tenBenhNhan}</p>
                            <li>Tuổi</li>
                            <p>${model.tuoi}</p>
                            <li>Nhóm máu</li>
                            <p>${model.nhomMau}</p>
                            <li>Số điện thoại liên lạc</li>
                            <p>${model.soDienThoai}</p>
                            <li>chuẩn đoán của bác sĩ</li>
                            <p>${model.benhLy}</p>
                        </ul>
                    </div>
                    <div class="chi_tiet_ho_so-category-content-first-B">
                        <ul>
                            <li>Giới tính</li>
                            <p>${model.gioiTinh}</p>
                            <li>Cân nặng</li>
                            <p>${model.canNang}kg</p>
                            <li>Địa chỉ</li>
                            <p>${model.diaChi}</p>
                            <li class="thuoc_hien_tai">Những đơn thuốc gần đây của bệnh nhân</li>
                            <div class="thuoc_hien_tai-contentt ">
                            <c:if test="${listDonThuoc.size()<=0}">
                             p>Bệnh nhân chưa được kê đơn thuốc</p>
                            <div class="thuoc_hien_tai-content">
                                <a href="">
                                    <p>Kê đơn cho bệnh nhân</p>
                                </a>
                            </div>
                            </c:if>
                            <c:if test="${listDonThuoc.size()>0}">
                            <c:set var="count" value="1"/>
                           	<c:forEach var="item" items="${listDonThuoc}">
                                <div class="thuoc_hien_tai-content-A">
                                    <p style = "width:168px;" >Đơn thuốc số : ${count} </p>
                                    <p style = "width:208px;" >Ngày kê đơn : ${item.ngayKeDon}</p>
                                    <a  href="<c:url value="/chi-tiet-don-thuoc?iddt="/>${item.idDonThuoc}&idbn=${model.idHoSoBenhNhan}">
                                        <p style = "width:116px; color : #0d6efd;" >Xem đơn thuốc</p>
                                    </a>
                                </div>
                                <c:set var="count" value="${count+1}"/>
                              </c:forEach>
                             </c:if>
                            </div>

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