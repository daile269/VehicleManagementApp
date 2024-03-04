USE vehicleappdb;
    INSERT INTO client (id, address, city, details, email, name, phone, website, countryid, stateid)
    VALUES
    (1, '123 Main Street', 'Anytown', 'Some details about the client', 'client@example.com', 'Client Name', '123-456-7890', 'www.clientwebsite.com', 1, 3),
    (2, '456 Elm Street', 'Othertown', 'Other details about the client', 'anotherclient@example.com', 'Another Client', '987-654-3210', 'www.anotherclientwebsite.com', 4, 6),
    (3, '789 Oak Avenue', 'Sometown', 'Details for the third client', 'thirdclient@example.com', 'Third Client', '555-555-5555', 'www.thirdclientwebsite.com', 3, 5),
    (4, '321 Pine Road', 'Anothertown', 'Additional details for the fourth client', 'fourthclient@example.com', 'Fourth Client', '999-999-9999', 'www.fourthclientwebsite.com', 1, 9);