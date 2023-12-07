create database dtb_project_cnpm
go
use dtb_project_cnpm
create table hosobenhnhan(
idHoSoBenhNhan int identity(1,1) not null,
tenBenhNhan nvarchar(255) not null,
tuoi int not null,
gioiTinh nvarchar(20) not null,
diaChi nvarchar(255) not null,
soDienThoai varchar(11) not null,
nhomMau varchar(10),
canNang float,
benhLy nvarchar(525) not null,
ngayKham date,
daTungDenKham int default 0,
primary key(idHoSoBenhNhan)
)
create table loaithuoc(
idLoaiThuoc int identity(1,1) not null,
tenLoaiThuoc nvarchar(255) not null,
primary key(idLoaiThuoc)
)
create table thuoc(
idThuoc int identity(1,1) not null,
idLoaiThuoc int not null,
tenThuoc nvarchar(525) not null,
soLuongTrongKho int not null,
doseMin float not null,
doseMax float not null,
frequency int not null,
ngayHetHan date not null,
moTaThuoc nvarchar(525),
donVi nvarchar(20) not null,
foreign key(idLoaiThuoc) references loaithuoc(idLoaiThuoc),
primary key(idThuoc)
)
create table bacSi(
idBacSi int identity(1,1) not null,
tenBacSi nvarchar(255) not null,
gioiTinh nvarchar(50) not null,
tuoi int ,
taiKhoan varchar(50) not null,
matKhau varchar(255) not null,
trangthai int not null default 1
primary key(idBacSi)
)
create table donthuoc(
idDonThuoc int identity(1,1) not null,
idHoSoBenhNhan int not null,
idBacSi int not null,
ngayKeDon date not null,
foreign key(idBacSi) references bacSi(idBacSi),
foreign key(idHoSoBenhNhan) references hoSoBenhNhan(idHoSoBenhNhan),
primary key(idDonThuoc)
)
create table chitietdonthuoc(
idDonThuoc int not null,
idThuoc int not null,
dose float not null,
frequency float not null,
soLuong int not null,
danDoCuaBacSi nvarchar(255) not null,
foreign key(idDonThuoc) references donThuoc(idDonThuoc),
foreign key(idThuoc) references thuoc(idThuoc),
primary key(idDonThuoc,idThuoc)
)
select * from bacSi  
insert into bacSi values (N'Trần Văn Nam',N'Nam',28,'bsnam1',123,1) , (N'Phạm Thị Nhung',N'Nữ',38,'bsnhung',123,1)
insert into hosobenhnhan values (N'Nguyễn Đăng Mãn',20,N'Nam',N'Lý Thái Tổ,Đà Nẵng','0901142098',N'O+'
,47,N'Sốt siêu vi','2023-4-10',1) , 
(N'Trương Công Non',39,N'Nam',N'Hòa Khánh Bắc,Đà Nẵng','0901142092',N'A',
56,N'Đau dạ dày','2023-4-12',0) ,
(N'Phạm Thị Nhung',40,N'Nữ',N'Điện Bàn,Quảng Nam','0905142098',N'B',
45,N'Đau bụng','2023-4-14',1) ,
(N'Trương Khắc Bắc',17,N'Nam',N'Hòa Khánh Nam,Đà Nẵng','0905142091',N'O+',
60,N'Đau chân','2023-4-16',1),
(N'Nguyễn Gia Lâm',64,N'Nam',N'Hòa Vang,Đà Nẵng','0905142018',N'O+',
78,N'Viêm phổi','2023-4-18',0),
(N'Lê Thị Vân',29,N'Nam',N'Điện Dương,Điện Bàn','0905142086',N'A',
47,N'Đau dạ dày','2023-4-23',0)
select * from hosobenhnhan
select * from hoSoBenhNhan where idHoSoBenhNhan = 5
update hosobenhnhan set gioiTinh = N'Nữ' where idHoSoBenhNhan = 6
select * from loaithuoc
insert into loaithuoc values (N'Hệ cơ xương') , (N'Hệ da liễu') , 
 (N'Tai miệng họng'), (N'Hệ tim mạch & tạo máu'), (N'Hệ tiêu hóa')
 ,(N'Vitamin & khoáng chất') , (N'Thuốc giảm đau') , (N'Thuốc đau đầu')
 select * from thuoc
 insert into thuoc values 
(4,N'Thuốc Digoxine Qualy',500,1,2,2,'2025-4-2',N'Điều trị suy tim sung huyết',N'Viên'),
(4,N'Thuốc Procoralan',500,1,3,2,'2025-4-2',N'Điều trị triệu chứng đau thắt ngực ổn định mạn tính',N'Viên'),
(4,N'Thuốc Cordarone',500,1,1,2,'2025-4-2',N'Điều trị một số dạng rối loạn nhịp tim',N'Viên'),
(1,N'Thuốc Glucosamine Stada',300,1,1,1,'2025-4-2',N'Giảm triệu chứng của thoái hóa khớp gối nhẹ và trung bình',N'Gói'),
(1,N'Thuốc Febuxoti',300,1,1,1,'2025-4-2',N'Điều trị tăng acid uric máu mãn tính ở bệnh nhân gout',N'Viên'),
(1,N'Thuốc Katrypsin Fort',200,1,2,2,'2025-4-2',N'Điều trị phù nề sau chấn thương, phẫu thuật, bỏng',N'Viên'),
 (7,N'Thuốc Tovalgan EF',500,1,2,2,'2025-4-2',N'Giảm đau và hạ sốt',N'Viên'),
 (7,N'Thuốc Panactol Extra',600,1,2,2,'2025-4-2',N'Thuốc giảm đau đầu và hạ sốt',N'Viên'),
 (7,N'Thuốc Acefalgan',500,1,2,3,'2025-4-2',N'Thuốc hạ sốt từ vừa đến nhẹ',N'Viên'),
(2,N'Thuốc LCystine',100,1,2,2,'2025-4-2',N'Hỗ trợ điều trị sạm da , tàn nhang , viêm da',N'Gói'),
(2,N'Thuốc Cystine B6',300,1,2,2,'2025-4-2',N'Mọi vấn đề bệnh lý liên quan đến tóc',N'Viên'),
(3,N'Viên Ngậm Tyrotab',200,1,2,2,'2025-4-2',N'Điều trị các bệnh ở họng,ở miệng',N'Viên'),
(3,N'Thuốc Ngậm Strepsils',200,1,2,2,'2025-4-2',N'Điều trị kháng viên ở họng',N'Viên'),
(5,N'Thuốc Drotaverine Stada',200,1,2,2,'2025-4-2',N'Điều trị loét tá tràng,loét dạ dày',N'Viên'),
(5,N'Thuốc Emanera KRKA',200,1,2,2,'2025-4-2',N'Điều trị trào ngược dạ dày,viêm loét dạ dày',N'Viên'),
(6,N'Thuốc Magnesiun B6',200,1,3,2,'2025-4-2',N'Giảm các triệu chứng thiếu hụt magnesi như nôn mửa,khó chịu,mệt mỏi',N'Viên'),
(6,N'Thuốc Vitatrum C',200,1,1,1,'2025-4-2',N'Bổ sung vitamin',N'Viên')
insert into donthuoc values (1,3,'2023-04-10'),(1,3,'2023-04-10'),(2,3,'2023-04-11')
,(3,4,'2023-04-15'),(4,4,'2023-04-18'),(5,3,'2023-04-15'),(6,4,'2023-04-19')
,(3,4,'2023-04-29'),(4,4,'2023-05-20')
insert into chitietdonthuoc values (1,7,2,2,30,N'Uống thuốc ngay sau khi ăn') , 
(1,9,1,2,30,N'Uống thuốc ngay sau khi ăn'), (3,5,1,2,30,N'Uống thuốc ngay sau khi ăn và sử dụng đúng liều lượng chỉ định'),
 (4,4,1,1,20,N'Uống thuốc ngay sau khi ăn và sử dụng đúng liều lượng chỉ định') ,(11,3,1,2,35,N'Uống vào bữa sáng và trưa'),
(11,4,1,1,30,N'Uống sau khi ăn'),(5,4,1,1,30,N'Uống sau khi ăn'),
(5,10,1,2,20,N'Nên uống vào bữa sáng hoặc trưa'),(6,11,1,2,60,N'Uống vào sau bữa ăn')