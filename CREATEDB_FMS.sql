--DROP DATABASE
USE [master]
DROP DATABASE FMS_FlightManagementSystem
--CREATE DATABASE
USE [master]
CREATE DATABASE FMS_FlightManagementSystem

USE [FMS_FlightManagementSystem]
GO

--CREATE TABLE
CREATE TABLE [Admin]
(
	ID int IDENTITY(1,1) PRIMARY KEY,
	UserName varchar(50) UNIQUE not null,
	[Password] varchar(50) not null
) 
GO

CREATE TABLE Flights
(
	ID int IDENTITY(1,1) PRIMARY KEY,
	DeparturePlace varchar(50) not null,
	DepartureDate datetime DEFAULT GETDATE(),
	Destination varchar(50) not null,
	NumberOfSeats int DEFAULT 300,
	MaxCargoWeight int DEFAULT 20,
	Price float DEFAULT 0,
	CreatedBy int FOREIGN KEY REFERENCES [Admin](ID),
	CreatedTime datetime DEFAULT GETDATE(),
	ModifiedBy int FOREIGN KEY REFERENCES [Admin](ID) ,
	LastModifiedTime datetime DEFAULT GETDATE(),
	IsActivity bit DEFAULT 1 ,

)
GO

CREATE TABLE Crews
(
	ID int IDENTITY(1,1) PRIMARY KEY,
	[Name] nvarchar(50) not null,
	PhoneNumber varchar(10) not null,
	Position varchar(30) not null,
)
GO

CREATE TABLE FlightCrew
(
	ID int IDENTITY(1,1) PRIMARY KEY,
	FlightID int FOREIGN KEY REFERENCES Flights(ID),
	CrewID int FOREIGN KEY REFERENCES Crews(ID),
	CreatedBy int FOREIGN KEY REFERENCES [Admin](ID),
	CreatedTime datetime DEFAULT GETDATE(),
	ModifiedBy int FOREIGN KEY REFERENCES [Admin](ID) ,
	LastModifiedTime datetime DEFAULT GETDATE(),
	IsActivity bit DEFAULT 1 ,
)
GO

CREATE TABLE Customers
(
	ID int IDENTITY(1,1) PRIMARY KEY ,
	[Name] nvarchar(50) not null,
	PhoneNumber varchar(10) not null,
	IdentifyNumber varchar(12) UNIQUE not null,
)
GO

CREATE TABLE Tickets
(
	ID int IDENTITY(1,1) PRIMARY KEY ,
	FlightID int FOREIGN KEY REFERENCES Flights(ID),
	PassengerID int FOREIGN KEY REFERENCES Customers(ID),
	Code varchar(30) UNIQUE not null,
	BuyTime datetime DEFAULT GETDATE(),
	ModifiedTime datetime DEFAULT GETDATE(),
	IsCancelled bit DEFAULT 0,
)
GO

CREATE TABLE FlightCargo
(
	ID int IDENTITY(1,1) PRIMARY KEY ,
	FlightID int FOREIGN KEY REFERENCES Flights(ID),
	PassengerID int FOREIGN KEY REFERENCES Customers(ID),
	Category varchar(20),
	Code varchar(30) UNIQUE not null,
	[Weight] float DEFAULT 20, 
	Price float DEFAULT 0,
	BuyTime datetime DEFAULT GETDATE(),
	ModifiedTime datetime DEFAULT GETDATE(),
	IsCancelled bit DEFAULT 0,
)
GO


--INSERT DATA
USE [FMS_FlightManagementSystem]
GO

INSERT INTO [dbo].[Admin]
           ([UserName] ,[Password])
     VALUES
           ('canh.truongthe','12345'),
		   ('quyen.phamngoc','12345'),
		   ('dung.nguyentrung','12345'),
		   ('hung.dangngoc','12345'),
		   ('trong.lecanh','12345')
GO

INSERT INTO [dbo].[Crews]
           ([Name],[PhoneNumber],[Position])
     VALUES
           (N'Phạm Ngọc Quyền', '0367718301', 'Copilot'),
		   (N'Lê Cảnh Trọng', '0365123478', 'Copilot'),
		   (N'Nguyễn Ngô Chiến', '0365417795', 'Copilot'),
		   (N'Trương Thế Cảnh', '0325545454', 'Pilot'),
		   (N'Nguyễn Trung Dũng', '0365756455', 'Pilot'),
		   (N'Đặng Ngọc Hưng', '0364555659', 'Pilot'),
		   (N'Nguyễn Tấn Kiệt', '0326868498', 'Flight Attendant'),
		   (N'Bùi Ngọc Bảo Trân', '0365147895', 'Flight Attendant'),
		   (N'Nguyễn Anh Tuấn', '0354865546', 'Flight Attendant'),
		   (N'Lê Thị Chí Thương', '0325684588', 'Flight Attendant'),
		   (N'Ngô Gia Huy', '0326868498', 'Flight Attendant'),
		   (N'Phan Mai Sơn', '0356265665', 'Flight Attendant'),
		   (N'Trần Thu Ngân', '0325646845', 'Flight Attendant'),
		   (N'Vũ Ngọc Ánh', '0325479568', 'Flight Attendant'),
		   (N'Ngô Dương', '0325535455', 'Flight Attendant')

GO

Insert into [dbo].[Flights]([DeparturePlace],[Destination],[DepartureDate],[Price])
values ('Ha Noi', 'Ho Chi Minh','2023-08-20 10:00',1400000),
('Ha Noi', 'Ho Chi Minh','2023-08-20 10:00',1400000),
('An Giang', 'Bac Kan','2023-08-22 14:00',1700000),
('Da Nang', 'Ha Noi','2023-08-20 8:00',888888),
('Thua Thien Hue', 'Hai Duong','2023-08-19 16:00',950000),
('Hai Duong', 'Can Tho','2023-08-20 14:00',1150000),
('Gia Lai', 'Ho Chi Minh','2023-08-27 10:00',900000),
('Ha Noi', 'Ho Chi Minh','2023-08-22 17:00',1350000),
('Hau Giang', 'Bac Lieu','2023-08-20 10:00',700000),
('Binh Phuoc', 'Ca Mau','2023-08-22 14:00',650000),
('Dak Lak', 'Cao Bang','2023-08-20 8:00',1000000),
('Dak Nong', 'Dien Bien','2023-08-19 16:00',9500000),
('Dong Nai', 'Ha Giang','2023-08-20 14:00',1200000),
('Dong Thap', 'Ha Nam','2023-08-27 10:00',1150000),
('Hau Giang', 'Ha Tinh','2023-08-22 17:00',990000),
('Hoa Binh', 'Kien Giang','2023-08-20 10:00',1350000),
('Khanh Hoa', 'Lang Son','2023-08-22 14:00',800000),
('Nam Dinh', 'Lai Chau','2023-08-20 8:00',770000),
('Nghe An', 'Lao Cai','2023-08-19 16:00',900000),
('Ninh Binh', 'Long An','2023-08-20 14:00',1000000),
('Phu Tho', 'Nam Dinh','2023-08-27 10:00',800000),
('Quang Binh', 'Nghe An','2023-08-22 17:00',850000),
('Quang Nam', 'Ninh Binh','2023-08-20 10:00',900000),
('Quang Ngai', 'Phu Tho','2023-08-22 14:00',800000),
('Quang Ninh', 'Quang Binh','2023-08-20 8:00',700000),
('Quang Tri', 'Quang Nam','2023-08-19 16:00',7200000);

INSERT INTO Customers([Name],[PhoneNumber],[IdentifyNumber])
VALUES (N'PHAM NGOC QUYEN','0367718301','392846597719'),
(N'NGUYEN HOANG VIET','0905606537','382088439320'),
(N'TRAN LE VI BAO','0356754087','389457759767'),
(N'BUI NGOC BAO TRAN','0859478679','522329072093'),
(N'LE HONG HA','0355487008','036139288213'),
(N'TANG THI KIM Y','0356577273','062077260856'),
(N'NGUYEN PHAM HONG GIAO','0354034063','960878476225'),
(N'LE THI CHI THUONG','0984254577','001159184316'),
(N'DIEP MINH HUNG','0911334709','211824321895'),
(N'DINH NGUYEN HOANG ANH','0903560177','062434320494'),
(N'NGUYEN NGO CHIEN','0978177739','860066621023'),
(N'DO PHI HUNG','0365149482','182324291125'),
(N'NGUYEN KHANH NGOC','0762761660','821121531105'),
(N'HUYNH GIA BAO','0336165644','821122531105'),
(N'NGO GIA HUY','0869601204','162603825159'),
(N'NGUYEN TRUNG DUNG','0862247403','212601384381'),
(N'VU NGOC ANH','0358250148','212601284381'),
(N'NGUYEN THU NGAN','0362452906','043638628971'),
(N'BUI NHAT TAN','0327452442','017606448624'),
(N'LE HUY HOAN','0935359107','072446737384'),
(N'NGUYEN BAO THIEN','0385045284','224822440793'),
(N'NGUYEN HAI DANG','0866942857','881604165297'),
(N'TRINH XUAN SANG','0359016225','039303095327'),
(N'NGUYEN LE QUYNH HUONG','0966943562','946288756551'),
(N'HOANG GIA HAI','0933203279','162493407703'),
(N'VO PHUC TRUONG','0795680482','007084935011'),
(N'TRAN NGOC CUON','0355819231','536143186265'),
(N'QUANG THANH DO','0899992156','218211917601'),
(N'NGUYEN MINH HANG','0779581688','509603900392'),
(N'TRAN VAN LOC','0961700296','517656982997'),
(N'LE QUOC VIET','0333908576','489742531996'),
(N'PHAM NGUYET MINH','0915620526','355662360773'),
(N'TRAN THU NGAN','0395355302','275470958099'),
(N'NGUYEN SON HUY HOA','0862024246','591908212447')


INSERT INTO Tickets ([FlightID],[PassengerID],[Code])
VALUES (1,1,'BZH05H'),
(1,2,'tED2Xp'),
(1,3,'pBD0Lb'),
(1,4,'hiH6Tb'),
(1,5,'veBG0I'),
(1,6,'h7IUMA'),
(1,7,'3JFcMQ'),
(1,8,'e5BCso'),
(1,9,'NFswLh'),
(1,10,'UKNvjx'),
(1,11,'O1d6KK'),
(1,12,'0uREtm'),
(1,13,'n5ArBZ'),
(1,14,'G7H10q'),
(1,15,'YNVlTd'),
(1,16,'gPtKEe'),
(1,17,'USTzk8'),
(2,18,'YT1Sd9'),
(2,19,'GilgzO'),
(2,20,'WCCVZs'),
(2,21,'H8l9OM'),
(2,22,'XozeQx'),
(2,23,'rrBKeo'),
(2,24,'Fpyn4H'),
(2,25,'Uv5U24'),
(2,26,'T1DnlH'),
(2,27,'Ux4MHT'),
(2,28,'61V6y7'),
(2,29,'9XGDOq'),
(2,30,'UWU2cg'),
(2,31,'Eb9GPu'),
(2,32,'hprlAj')

