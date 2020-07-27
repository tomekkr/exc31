INSERT INTO category (name, description) VALUES
('RTV', 'urządzenia RTV'), ('AGD', 'urządzenia AGD'), ('Meble', 'meble do domu'),
('Inne', 'inne produkty');

INSERT INTO offer (title, description, img_url, price, category_id) VALUES
('Telewizor', 'Super telewizor o przekątnej 55 cali', 'https://images.philips.com/is/image/PhilipsConsumer/55PUS6561_12-IMS-pl_PL?$jpglarge$&wid=960', 4790.0, 1),
('Kino domowe', 'Wypasione kino domowe firmy Sony, gra tak, że można robić festyn', '', 9890.0, 1),
('Stół drewniany', 'Idealny stół drewniany dla rodziny, 6 krzeseł gratis', '', 1249.0, 3);