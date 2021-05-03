CREATE DATABASE `penjualan`;
USE `penjualan`;

CREATE TABLE `produk` (
`IDProduk` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
`KodeProduk` varchar(32) UNIQUE KEY,
`NamaProduk` varchar(255),
`Satuan` varchar(255),
`Harga` int(11),
`Stok` int(11) ,
`CreateDate` datetime 
);
