бот с определенной периодичностью (задать рандом в каком-то диапазоне во избежание капч) ходит на https://www.wildberries.ru/catalog по заданным товарам. Вытаскивает текущую, макс и мин стоимость, определяет среднюю стоимость. Если текущая стоимость товара ниже его средней стоимости, бот шлёт артикул/ссылку на товар в телеграм.

1. Забить в БД артикулы товаров.
2. Как запрограммировать бота в телеге, чтоб из него запускать приложение, когда мне удобно?

Скрипт для создания таблиц в БД:

CREATE TABLE yagodki.products (
article int(15),
name varchar (200),
current_price int(15),
average_price int(15),
max_price int(15),
min_price int(15)
);

SELECT * FROM yagodki.products;

insert yagodki.products(article, name, current_price, average_price, max_price, min_price)
values (116691881, 'Джинсы женские скинни', 2445, 2089 , 2609, 1569);

alter table yagodki.products add primary key (article);