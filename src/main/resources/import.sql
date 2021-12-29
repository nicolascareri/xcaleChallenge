-- DATA INITIALIZATION
INSERT INTO `WGROUP` (id, name) VALUES (1, 'Friends & Family');

INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (1, 'John', 'Doe', '406-520-5073');
INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (2, 'Lana', 'Lynn', '409-252-4509');
INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (3, 'Nayeli' ,'Clarke', '202-555-0192');
INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (4, 'Gracie', 'Haas', '202-555-0138');
INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (5, 'Ben' ,'Weaver', '202-555-0148');

INSERT INTO `WGROUP_MEMBERS` (group_id, members_id) VALUES (1, 1);
INSERT INTO `WGROUP_MEMBERS` (group_id, members_id) VALUES (1, 2);
INSERT INTO `WGROUP_MEMBERS` (group_id, members_id) VALUES (1, 3);
INSERT INTO `WGROUP_MEMBERS` (group_id, members_id) VALUES (1, 4);
INSERT INTO `WGROUP_MEMBERS` (group_id, members_id) VALUES (1, 5);


-- John has Lana and Ben in his contact list
INSERT INTO `CONTACT_CONTACTS` (contact_id, contacts_id) VALUES (1, 2);
INSERT INTO `CONTACT_CONTACTS` (contact_id, contacts_id) VALUES (1, 5);
