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
<script src="<c:url value = "/js/search.js"/>"></script>
<link rel="stylesheet" href="<c:url value ="/css/style.css"/>">
<link >
</head>
		
				<c:set var = "hsbn" value = "${applicationScope.hsbn}"/>
				<c:set var = "listThuoc" value = "${applicationScope.listThuoc}"/>
				<c:set var = "ListOfIddt" value = "${applicationScope.listOfId}"/>
				<c:set var = "listName" value = "${applicationScope.listName}"/>
				<% 
					bacSi model = (bacSi)session.getAttribute("modelBS");
					if(session!=null&model!=null){
					String nofication = (String)request.getAttribute("notifi");
					String name = model.getTenBacSi();
				%>
				<c:set var ="bs" value="${sessionScope.modelBS}"/>
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
            <div class="them_thuoc_moi-category-first">
                <p>Tạo đơn thuốc mới cho bệnh nhân</p>
            </div>
            <div class="them_thuoc_moi-category-content">
                <div class="them_thuoc_moi-category-content-table">
                    <div class="them_thuoc_moi-category-content-table-A">
                        <ul style = "padding: 0 10px;" class="first">
                            <div class="table-A1">
                                <div class="table-A1-a">
                                    <p>Tên bệnh nhân</p>
                                    <p>${hsbn.tenBenhNhan}</p>
                                </div>
                                <div class="table-A1-b">
                                    <p>Giới tính</p>
                                    <p>${hsbn.gioiTinh}</p>
                                </div>
                            </div>
                            <li>Địa chỉ</li>
                            <p>${hsbn.diaChi}</p>
                            <li>Chuẩn đoán của bác sĩ</li>
                            <p>${hsbn.benhLy}</p>
                        </ul>
                        <h4>Thuốc kê cho bệnh nhân</h4>
                        <c:if test="${ListOfIddt.size()>0}" >
                        <table class="table">
                            <thead>
                              <tr>
                                <th scope="col">#</th>
                                <th scope="col">Tên Thuốc</th>
                                <th scope="col">Liều đơn</th>
                                <th scope="col">Tần suất</th>
                                <th scope="col">Dặn dò của bác sĩ</th>
                              </tr>
                            </thead>
                            <tbody>
                            <c:set var ="count" value="0"/>
                            <c:forEach var="item" items="${ListOfIddt}" >
                
                              <tr>
                                <td>1</td>
                                <td  >
                                    <p style="width: 200px;" class = "column_w">
                                        ${listName[count]}
                                    </p>
                                </td>
                                <td  >
                                    <p style="width: 60px;" class = "column_w">
                                        ${item.soLuongDungTrenMotLan}
                                    </p>
                                </td>
                                <td  >
                                    <p style="width: 60px;" class = "column_w">
                                        ${item.soLanUongTrenMotNgay}
                                    </p>
                                </td>
                                <td  >
                                    <p style="width: 130px;" class = "column_w">
                                        ${item.danDoCuaBacSy}
                                    </p>
                                </td>
                              </tr>
                              </c:forEach>
                            </tbody>
                          </table>
                          </c:if>
                    </div>
                    <div class="them_thuoc_moi-category-content-form">
                        <form action="<c:url value="/taodonthuoc"/>">
                     		<input type="hidden" name="idbn" value ="${hsbn.idHoSoBenhNhan}"/>
                     		<input type="hidden" name="idbs" value="${bs.idBacSi}"/>
                            <p style="margin-top: 10px;">Tên thuốc</p>
                            <div class="input-form">
       				 		<input name="name" type="text" placeholder="Nhập vào tên thuốc để tìm kiếm" list ="thuocList" >
       				 		<c:if test="${listThuoc.size()>0}">
       				 			<datalist   id="thuocList">
       				 			<c:forEach var="item" items="${listThuoc}">
    							<option value="${item.tenThuoc}"></option>
    							</c:forEach>
  								</datalist>
       				 		</c:if>
    					</div>
                            <div class="querry-form">
                                <p>Mỗi lần uống:</p>
                                <input type="number" placeholder="1" name="dose">
                                <p> viên</p>
                            </div>
                            <div class="querry-form-A">
                                <p>Số lần uống:</p>
                                <input type="number" placeholder="1" name="frequency">
                                <p> lần/ngày</p>
                            </div>
                             <div style="margin-top: 10px;" class="querry-form-A">
                                <p>Số lượng:</p>
                                <input type="number" placeholder="1" name="amount">
                                <p> viên</p>
                            </div>
                            <div>
                                <p>Dặn dò từ bác sĩ:</p>
                                <textarea id="myTextarea" name="comments" ></textarea>
                            </div>
                            <button class="btn_send_form"  type="submit">
                                    <p style ="color:#ffff;">Thêm thuốc</p>
                            </button>
                        </form>
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