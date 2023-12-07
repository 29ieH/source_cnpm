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
<body>
<div class = "w-1462px">
  <div class="dang_su_dung">
        <div class="dang_su_dung-list">
            <div class="dang_su_dung-list-first">
                <i class="fa-solid fa-bars"></i>
                <p>Chức Năng</p>
            </div>
            <div class="function-list-second">
                <ul>
                    	<a href="<c:url value="/views/home.jsp"/>">
                	  <li>Hồ sơ bệnh nhân</li>
                	</a>
                	<a href="<c:url value="/views/themthuocmoi.jsp"/>">
                	 <li>Tạo đơn thuốc mới</li>
                	</a>
                	<a href="<c:url value="/views/danhmucthuoc.jsp"/>">
                    <li>Danh mục thuốc</li>
                    </a>
                </ul>
            </div>
        </div>
        <div class="dang_su_dung-category">
            <div class="dang_su_dung-category-first">
                <p>Thông tin chi tiết của bệnh nhân</p>
            </div>
            <div class="dang_su_dung-category-content">
                <div class="dang_su_dung-category-content-headline">
                    <p>Thông tin chi tiết của bệnh nhân</p>
                </div>
                <div class="dang_su_dung-category-content-first">
                    <div class="dang_su_dung-category-content-first-A">
                        <ul>
                            <li>Tên bệnh nhân</li>
                            <p>Trần thái Hiền</p>
                            <li>Tuổi</li>
                            <p>18</p>
                            <li>Nhóm máu</li>
                            <p>AB</p>
                            <li>Số điện thoại liên lạc</li>
                            <p>0769609***</p>
                            <li>chuẩn đoán của bác sĩ</li>
                            <p>Viêm đường ruột cấp tính , abbcdxyz lalala</p>
                        </ul>
                    </div>
                    <div class="dang_su_dung-category-content-first-B">
                        <p >Thuốc đang sử dụng</p>
                       <form style = "padding: 4px 10px;" class="content-form" action="" method="get">
                        	<div class = "tbnds-content" >
                            <div class="form-A">
                                <p>Tên thuốc: abcd</p>
                      		
                            </div>
                            <div class="form-B">
                                <p>Số lượng dùng:</p>
                                <input type="text" placeholder="1">
                                <p>Viên/Lần</p>
                                <p>Số lần dùng:</p>
                                <input type="text" placeholder="1">
                                <p>Lần/Ngày</p>
                            </div>
                            <div class="form-C">
                                <p>Số lượng:</p>
                                <input type="text" placeholder="1">
                                <p>Viên</p>

                            </div>
                            <div class="form-D">
                                <p>Dặn dò bác sĩ:</p>
                                <textarea id="Textarea" name="comments"></textarea>
                            </div>
                          </div>
                       </div>
                    </div>
                           <div class="btn-ke_don">
                                <a href=""><p>Kê đơn</p></a>
                            </div>
                        </form>

                    </div>
                </div>

            </div>
        </div>
    </div>
   </div>
</body>
</html>