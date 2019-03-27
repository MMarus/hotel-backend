INSERT INTO fruit(id, name) VALUES (nextval('hibernate_sequence'), 'Cherry')
INSERT INTO fruit(id, name) VALUES (nextval('hibernate_sequence'), 'Apple')
INSERT INTO fruit(id, name) VALUES (nextval('hibernate_sequence'), 'Banana')


INSERT INTO userr(id, firstname, surname, personalId, email, birthDate, role, password, phone, active, authToken) VALUES	(1,'Jan','Novotny','9108098191','admin@example.com','2015-11-24', 'ADMIN', 'admin', '+44444444444', TRUE, 'admin');
INSERT INTO userr(id, firstname, surname, personalId, email, birthDate, role, password, phone, active, authToken) VALUES	(2,'Bill','Gates','9908098192','employee@example.com','2015-11-24', 'EMPLOYEE','employee','+44444444444', TRUE, 'employee');
INSERT INTO userr(id, firstname, surname, personalId, email, birthDate, role, password, phone, active, authToken) VALUES	(3,'Jeff','Bezos','9208098191','customer@example.com','2015-11-24', 'CUSTOMER','customer', '+44444444444', TRUE, 'customer');
INSERT INTO userr(id, firstname, surname, personalId, email, birthDate, role, password, phone, active, authToken) VALUES	(4,'Elon','Musk','9208098191','customer2@example.com','2015-11-24', 'CUSTOMER','customer', '+44444444444', TRUE, 'customer');


INSERT INTO ROOM (id, size, capacity, description, name, price, type, image) VALUES (1, 20, 1, 'Single room', 'Single room', 100, 'SINGLE', '/single-room.jpg');
INSERT INTO ROOM (id, size, capacity, description, name, price, type, image) VALUES (2, 30, 2, 'Twin room', 'Twin room', 200, 'DOUBLE', '/double-room.jpg');
INSERT INTO ROOM (id, size, capacity, description, name, price, type, image) VALUES (3, 40, 4, 'Apartman', 'Apartman', 400, 'APARTMENT', '/apartman.jpg');

INSERT INTO ROOM (id, size, capacity, description, name, price, type, image) VALUES (4, 10, 1, 'Single room', 'Single room', 90, 'SINGLE', '/single-room.jpg');
INSERT INTO ROOM (id, size, capacity, description, name, price, type, image) VALUES (5, 20, 2, 'Twin room', 'Twin room', 150, 'DOUBLE', '/double-room.jpg');
INSERT INTO ROOM (id, size, capacity, description, name, price, type, image) VALUES (6, 30, 4, 'Apartman', 'Apartman', 350, 'APARTMENT', '/apartman.jpg');

INSERT INTO RESERVATION (id, dateFrom, dateTO, dateCreated, paid, paymentType, RESERVEDROOM_ID, creator_id, customer_id) VALUES (1, '2015-1-1', '2015-1-2', '2015-1-2', TRUE , 'CASH', 1, 2, 3);
INSERT INTO RESERVATION (id, dateFrom, dateTO, dateCreated, paid, paymentType, RESERVEDROOM_ID, creator_id, customer_id) VALUES (2, '2015-1-8', '2015-1-9', '2015-1-2', FALSE , 'CASH', 1, 2, 4);
INSERT INTO RESERVATION (id, dateFrom, dateTO, dateCreated, paid, paymentType, RESERVEDROOM_ID, creator_id, customer_id) VALUES (3, '2015-1-1', '2015-1-2', '2015-1-2', FALSE , 'CARD', 2, 2, 3);
INSERT INTO RESERVATION (id, dateFrom, dateTO, dateCreated, paid, paymentType, RESERVEDROOM_ID, creator_id, customer_id) VALUES (4, '2015-1-9', '2015-1-11', '2015-1-2', TRUE , 'CASH', 2, 1, 4);
INSERT INTO RESERVATION (id, dateFrom, dateTO, dateCreated, paid, paymentType, RESERVEDROOM_ID, creator_id, customer_id) VALUES (5, '2015-1-1', '2015-1-2', '2015-1-2', FALSE , 'CASH', 3, 2, 3);
INSERT INTO RESERVATION (id, dateFrom, dateTO, dateCreated, paid, paymentType, RESERVEDROOM_ID, creator_id, customer_id) VALUES (6, '2015-10-1', '2015-11-2', '2015-2-2', TRUE, 'CARD', 4, 2, 4);
INSERT INTO RESERVATION (id, dateFrom, dateTO, dateCreated, paid, paymentType, RESERVEDROOM_ID, creator_id, customer_id) VALUES (7, '2016-1-1', '2016-1-2', '2015-3-2', FALSE, 'CARD', 3, 1, 3);

INSERT INTO SERVICE (id, name, description, price) VALUES (1, 'Pool', 'Deep poll', 150);
INSERT INTO SERVICE (id, name, description, price) VALUES (2, 'Sauna', 'Hot air', 200);
INSERT INTO SERVICE (id, name, description, price) VALUES (3, 'Massage', 'Thai massage', 500);

INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (1, 1);

INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (2, 1);
INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (1, 2);
INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (3, 2);
INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (2, 3);
INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (3, 3);

INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (2, 4);
INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (1, 5);
INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (3, 6);
INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (2, 7);
INSERT INTO SERVICE_RESERVATION (service_id, reservation_id) VALUES (3, 6);