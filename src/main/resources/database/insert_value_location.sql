
USE vehicleappdb;
INSERT INTO location (id, address, city, description, details, countryid, stateid)
VALUES
    (1, '123 ABC Street', 'New York', 'Headquarters', 'Large office building', 1, 3),
    (2, '456 XYZ Avenue', 'Los Angeles', 'Branch Office', 'Small office', 5, 6),
    (3, '789 MNO Road', 'Chicago', 'Regional Office', 'Medium-sized office', 1, 4),
    (4, '101 Main Street', 'Houston', 'Branch Office', 'Small office space', 3, 6),
    (5, '555 Elm Street', 'San Francisco', 'Branch Office', 'Co-working space', 6, 5),
    (6, '777 Oak Avenue', 'Miami', 'Regional Office', 'Large office building', 5, 3),
    (7, '888 Pine Street', 'Seattle', 'Branch Office', 'Medium-sized office', 14, 4),
    (8, '999 Maple Drive', 'Boston', 'Headquarters', 'Corporate campus', 3, 6);