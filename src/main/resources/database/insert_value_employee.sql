USE vehicleappdb;
INSERT INTO employee (address, city, date_of_birth, email, firstname, gender, initials, lastname, marital_status, phone, photo, social_security_number, title, hire_date, username, country_id, state_id, employee_type_id, job_title_id)
VALUES
    ('123 Main St', 'New York', '1990-05-15', 'john@example.com', 'John', 'Male', 'J.D.', 'Doe', 'Single', '+1234567890', NULL, '123-45-6789', 'Manager', '2020-01-15', 'john_doe', 1, 3, 1, 3),
    ('456 Elm St', 'Los Angeles', '1988-08-20', 'jane@example.com', 'Jane', 'Female', 'J.L.', 'Smith', 'Married', '+0987654321', NULL, '987-65-4321', 'Supervisor', '2018-05-10', 'jane_smith', 5, 5, 1, 1),
    ('789 Oak St', 'Chicago', '1995-03-25', 'mike@example.com', 'Mike', 'Male', 'M.A.', 'Johnson', 'Single', '+1122334455', NULL, '456-78-9123', 'Assistant', '2021-09-20', 'mike_johnson', 3, 3, 2, 3),
    ('101 Pine St', 'Houston', '1987-11-10', 'sara@example.com', 'Sara', 'Female', 'S.M.', 'Williams', 'Married', '+9988776655', NULL, '789-12-3456', 'Clerk', '2017-03-05', 'sara_williams', 1, 4, 2, 1),
    ('202 Maple St', 'Miami', '1992-07-01', 'david@example.com', 'David', 'Male', 'D.P.', 'Brown', 'Single', '+1122334455', NULL, '345-67-8901', 'Technician', '2019-11-15', 'david_brown', 14, 9, 1, 3);
