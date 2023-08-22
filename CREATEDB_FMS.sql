
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
	Price float DEFAULT 0,
	ByTime datetime DEFAULT GETDATE(),
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
	ByTime datetime DEFAULT GETDATE(),
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

select ID, DeparturePlace,Destination,DepartureDate from Flights order by ID desc 

insert into Customers([Name],[PhoneNumber],[IdentifyNumber])
values ('Tester01',0123456789,012345678910)

insert into Tickets ([FlightID],[PassengerID],[Code])
	values (01,01,'ab7c'),
	(02,01,'azc'),(03,01,'as'),(04,01,'asc'),(05,01,'aaac'),(06,01,'asdc'),(07,01,'abcsadf'),(08,01,'abca')

	SELECT SUM(r.RevenueTicket) AS RevenueTicket, SUM(r.RevenueCargo) AS RevenueCargo 
	FROM ( 
		SELECT ID, QuanlityTicket*Flights.Price AS RevenueTicket, RevenueCargo
		FROM Flights left join(
			SELECT FlightID, COUNT(*) AS QuanlityTicket
			FROM Tickets 
			GROUP BY FlightID) AS t on t.FlightID = Flights.ID left join(
				SELECT FlightID, SUM(FlightCargo.Price) AS RevenueCargo
				FROM FlightCargo
				GROUP BY FlightID HAVING COUNT(*) > 0) AS c on c.FlightID = Flights.ID) AS r

select count(*) from Tickets where FlightID = 1
