INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '205', 'AA-205-AA', '3KX9YLH2K980HNYYS1YZ');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '206', 'AA-206-AA', 'VST52ASAH145TIZGJ3LC');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '207', 'AA-207-AA', 'JI0BNW8D1HYGPFAECEPJ');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '208', 'AA-208-AA', 'LN97FF02UWRJYRAEGFL5');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '106', 'AA-106-AA', 'R94DJ8P5PT7M6PB5DP5B');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '107', 'AA-107-AA', 'OJHHEW2SP2KJDU3CZLFO');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '108', 'AA-108-AA', '49LUMOTWMOQSNHK09MR3');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '306', 'AA-306-AA', '0KBBBHVTZN9P66I8TVGT');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '307', 'AA-307-AA', 'TK0GX92MY29AR0H9ZYIB');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '308', 'AA-308-AA', 'EKNPA002KCQXYAUX04AV');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '309', 'AA-309-AA', 'D1788D08RU0AU3O5BVXR');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '405', 'AA-405-AA', 'PHU0M7NKZ799D64VBVJ8');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '406', 'AA-406-AA', 'NAD3F2ULL5TY4QCECLAO');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '407', 'AA-407-AA', 'C842THXCOBFFZ0O5U0YK');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '508', 'AA-508-AA', 'F0T2ELSQ0VPRF1NBY8XH');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '407', 'AA-407-AA', 'WEBVP95ON3HDX0TGPFXB');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '508', 'AA-508-AA', 'TEZ3D70UDBY8UKHRKSYY');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '605', 'AA-605-AA', 'WIGYNFTWH0Q6E85Z2HA2');

INSERT INTO vehicle (brand, model, registration_plate, serial_number)
VALUES ('PEUGEOT', '607', 'AA-607-AA', 'OLI3JCTF82WUQK14Z295');


UPDATE hibernate_sequence SET next_val = (SELECT MAX(id) FROM vehicle) + 1;


