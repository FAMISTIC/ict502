
CREATE TABLE Customer (
    customer_id SERIAL PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    phone INT NOT NULL,
    email VARCHAR(20) NOT NULL,
    vehicle_id VARCHAR(20) NOT NULL,
    service_id DATE NOT NULL
);

--
-- Table structure for table `Dry_Ingredients`
--

CREATE TABLE Employee (
    employee_id INT NOT NULL,
    employee_name VARCHAR(50) NOT NULL,
    
);

--
-- Table structure for table `Furniture`
--

CREATE TABLE Receipt (
    receipt_id INT NOT NULL,
    receipt_date DATE NOT NULL,
    receipt_totalprice VARCHAR(50) NOT NULL,
    
);

--
-- Table structure for table `Staff`
--

CREATE TABLE Service (
    service_id SERIAL PRIMARY KEY,
    duration VARCHAR(50) NOT NULL,
    price VARCHAR(50) NOT NULL,
    vehicle_id VARCHAR(50) NOT NULL,
    employee_id VARCHAR(50) NOT NULL,
    receipt_id INT,
    FOREIGN KEY (vehicle_id) REFERENCES Vehicle(vehicle_id),
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id),
    FOREIGN KEY (receipt_id) REFERENCES Receipt(receipt_id),
);

--
-- Table structure for table `Stock_Movement`
--

CREATE TABLE Vehicle (
    vehicle_id INT NOT NULL,
    model INT NOT NULL,
    colour INT NOT NULL,
    plate_no VARCHAR(20) NOT NULL,
    InvDate DATE NOT NULL,
    
);


--
-- SEQUENCE for items
--

CREATE SEQUENCE seq_items
START 1000
INCREMENT 1;