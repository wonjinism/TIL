drop table admin_info;
drop sequence menu_seq;
drop table menu_info;
drop sequence customer_seq;
drop table order_list;
drop sequence order_seq;
drop table order_info;

CREATE TABLE admin_info (
account VARCHAR2(20)
, password VARCHAR2(20)
, admin_level NUMBER(1)
);

INSERT INTO admin_info (
account
, password
, admin_level
) VALUES (
'admin'
, 'admin'
, 1
);

CREATE SEQUENCE menu_seq
NOCACHE;

CREATE TABLE menu_info (
menu_seq NUMBER
, menu_type NUMBER(2)
, menu_name VARCHAR2(100)
, menu_description VARCHAR2(1000)
, original_price NUMBER
, promotion_price NUMBER
, promotion_type NUMBER(1)
, release_date DATE
, image VARCHAR2(1000)
);

CREATE SEQUENCE customer_seq
NOCACHE;

CREATE TABLE order_list (
customer_seq NUMBER
, menu_seq NUMBER
, quantity NUMBER
);

CREATE SEQUENCE order_seq
NOCACHE;

CREATE TABLE order_info (
order_seq NUMBER
, order_type NUMBER(1)
, order_date DATE
, order_number NUMBER
, consumer_seq NUMBER
, order_status NUMBER
, phone VARCHAR2(15)
, address VARCHAR2(200)
);

INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'[행사]점보스틱크리스피치킨팩', '더 크게! 오로지 다리살만 구운 오븐치킨, 바삭한 크리스피 치킨을 담았다!', 23900, 23900, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172974_20181218161525458.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'[신제품]점보스틱오븐치킨8조각', '더 크게! 오로지 다리살만 구웠다! *치킨나이트 1+1에서 제외됨', 21200, 21200, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172945_20181206111947076.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'[신제품]점보스틱오븐치킨6조각', '더 크게! 오로지 다리살만 구웠다! *치킨나이트 1+1에서 제외됨', 16200, 16200, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172944_20181206111820922.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'[신제품]점보스틱오븐치킨4조각', '더 크게! 오로지 다리살만 구웠다! *치킨나이트 1+1에서 제외됨', 11000, 11000, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172943_20181206111700159.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'[신제품]점보스틱오븐치킨1조각', '더 크게! 오로지 다리살만 구웠다! ★치킨나이트는 밤9시 이후 적용...', 3000, 3000, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_1171233_20190122090828431.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'블랙라벨치킨8조각', '닭다리 통살, 최고급 프리미엄치킨 *스위트칠리소스 별매(400원) ...', 21200, 21200, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172941_20181206104216742.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'블랙라벨치킨6조각', '닭다리 통살, 최고급 프리미엄치킨 *스위트칠리소스 별매(400원) ...', 16200, 16200, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172940_20181206104053211.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'블랙라벨치킨4조각', '닭다리 통살, 최고급 프리미엄치킨 *스위트칠리소스 별매(400원) ...', 11000, 11000, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172939_20181206103917227.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'블랙라벨치킨1조각', '★치킨나이트는 밤9시 이후 적용가능(장바구니담기기준) 닭다리 통살,...', 3000, 3000, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_1171232_20181206103653253.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'빨간맛치킨8조각', '매콤한 고추와 달콤한 빨간맛 소스의 절묘한 만남! *치킨나이트 1+...', 20700, 20700, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172937_20181206103448565.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'빨간맛치킨6조각', '매콤한 고추와 달콤한 빨간맛 소스의 절묘한 만남! *치킨나이트 1+...', 15700, 15700, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172936_20181206103316733.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'빨간맛치킨4조각', '매콤한 고추와 달콤한 빨간맛 소스의 절묘한 만남! *치킨나이트 1+...', 10600, 10600, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172935_20181206103026973.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'빨간맛치킨1조각', '★치킨나이트는 밤9시 이후 적용가능(장바구니담기기준) 매콤한 고추와...', 2900, 2900, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_1171231_20181206102819464.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'파티버켓세트', '푸짐한 구성으로 치킨파티! 구성: 핫크리스피치킨6+오리지널치킨6+올...', 27900, 27900, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172973_20181218161803513.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'핫크리스피버켓세트', 'KFC 핫크리스피치킨 한마리를 온전히 담았다! 구성 : 핫크리스피...', 22800, 22800, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172971_20181218162337422.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'핫크리스피버켓9조각', '매콤바삭 모두가 좋아하는 KFC 대표 치킨! *스위트칠리소스 별매(...', 20600, 20600, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172966_20181218163949222.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'핫크리스피치킨6조각', '매콤바삭 모두가 좋아하는 KFC 대표 치킨! *스위트칠리소스 별매(...', 14300, 14300, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172965_20181218164144426.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'핫크리스피치킨4조각', '매콤바삭 모두가 좋아하는 KFC 대표 치킨! *스위트칠리소스 별매(...', 9600, 9600, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172964_20181218164342743.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'핫크리스피치킨1조각', '★치킨나이트는 밤9시 이후 적용가능(장바구니담기기준) *스위트칠리소...', 2700, 2700, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_1171237_20181218165458777.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'오리지널버켓세트', 'KFC 오리지널치킨 한마리를 온전히 담았다! 구성 : 오리지널치킨9...', 22800, 22800, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172972_20181218162036881.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'오리지널버켓9조각', 'KFC 오리지널치킨 한마리를 온전히 담았다! *스위트칠리소스 별매(...', 20600, 20600, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172970_20181218163009243.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'오리지널치킨6조각', 'KFC만의 11가지 비밀양념, 고압쿠킹 방식으로 육즙이 살아있어 촉촉...', 14300, 14300, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172969_20181218163308931.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'오리지널치킨4조각', 'KFC만의 11가지 비밀양념, 고압쿠킹 방식으로 육즙이 살아있어 촉촉...', 9600, 9600, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2172967_20181218163507121.png');
INSERT INTO menu_info (menu_seq, menu_type, menu_name, menu_description, original_price, promotion_price, promotion_type, release_date, image) VALUES (menu_seq.NEXTVAL, 1,'오리지널치킨1조각', '★치킨나이트는 밤9시 이후 적용가능(장바구니담기기준) *스위트칠리소...', 2700, 2700, 7, sysdate, 'https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_1171238_20181218164601526.png');

commit;