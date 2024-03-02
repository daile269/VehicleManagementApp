USE vehicleappdb;
INSERT INTO vehicle (acquisition_date, description, fuel_capacity, name, net_weight, power, registration_date, remarks, vehicle_number, employee_id, location_id, vehicle_make_id, vehicle_model_id, vehicle_status_id, vehicle_type_id)
VALUES
    ('2023-05-15', 'Sedan', 60, 'Toyota Camry', 1500, 200, '2023-05-20', 'Regular maintenance required', 'ABC123', 1, 6, 2, 1, 2, 3),
    ('2022-11-10', 'SUV', 80, 'Ford Explorer', 1800, 250, '2022-11-15', 'Good condition, low mileage', 'XYZ456', 3, 3, 1, 3, 2, 1),
    ('2023-03-25', 'Truck', 100, 'Chevrolet Silverado', 2500, 300, '2023-03-30', 'Recently serviced, ready for heavy-duty use', 'DEF789', 2, 4, 3, 1, 3, 1),
    ('2024-01-05', 'Compact car', 50, 'Honda Civic', 1200, 150, '2024-01-10', 'Fuel-efficient, ideal for city driving', 'GHI012', 4, 7, 3, 1, 3, 1),
    ('2022-08-20', 'Van', 70, 'Mercedes Sprinter', 2000, 180, '2022-08-25', 'Spacious interior, suitable for cargo transportation', 'JKL345', 5, 9, 2, 2, 1, 3);

