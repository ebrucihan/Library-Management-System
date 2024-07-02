# Library Management System

Bu proje, Java ve PostgreSQL kullanılarak geliştirilmiş bir kütüphane yönetim sistemi örneğidir.

## Proje Amaçları

- Kütüphane sistemlerindeki kitap, yazar, yayınevi ve kategori yönetimini sağlamak.
- Kitap ödünç alma işlemlerini takip etmek ve yönetmek.
- Veritabanı işlemleri için Hibernate ve Jakarta Persistence API (JPA) kullanımını öğrenmek ve uygulamak.

## Teknolojiler ve Kütüphaneler

- Java 11
- PostgreSQL 12
- Hibernate 6.3.0.Final
- Jakarta Persistence API (JPA)
- Maven

## Kullanılan Entity Sınıfları

### Book (Kitap)

- Kitapların özelliklerini tutar.
- Yazar ve yayınevi ilişkileri bulunur.
- Kategorilere çoktan çoklu ilişki vardır.

### Author (Yazar)

- Yazarların özelliklerini tutar.
- Kitaplarla birçoktan bir ilişkisi bulunur.

### Publisher (Yayınevi)

- Yayınevlerinin özelliklerini tutar.
- Kitaplarla birçoktan bir ilişkisi bulunur.

### Category (Kategori)

- Kitap kategorilerini tutar.
- Kitaplarla çoktan çoklu ilişkisi bulunur.

### BookBorrowing (Kitap Ödünç Alma)

- Kitap ödünç alma işlemlerini takip eder.
- Kitaplarla birçoktan bir ilişkisi bulunur.

## Veritabanı Yapılandırması

- PostgreSQL veritabanı kullanılmıştır.
- `persistence.xml` dosyasında veritabanı bağlantı bilgileri ve Hibernate ayarları yapılandırılmıştır.

## Kurulum

### Gereksinimler

- Java JDK 11 veya üzeri
- PostgreSQL veritabanı

## Veritabanı Tabloları

### Book Tablosu

![Book](https://github.com/ebrucihan/Library-Management-System/assets/164398353/8cb978a0-813e-4491-baa7-de3fa4be0aeb)

### Author Tablosu

![Author](https://github.com/ebrucihan/Library-Management-System/assets/164398353/bac3fe72-59d4-4af5-b673-b714ea8ff5b4)

### Category Tablosu

![Category](https://github.com/ebrucihan/Library-Management-System/assets/164398353/85604f10-cd8b-44a8-bee1-56c3ab9e2c05)

### Publisher Tablosu

![Publisher](https://github.com/ebrucihan/Library-Management-System/assets/164398353/0e79c53d-f6b1-402f-89f7-b74601e35b4e)

### BookBorrowing Tablosu

![bookborrowing](https://github.com/ebrucihan/Library-Management-System/assets/164398353/9b3b8f87-71bd-4be3-b263-07705c76cd4e)

### BookCategory Tablosu

![bookcategory](https://github.com/ebrucihan/Library-Management-System/assets/164398353/b3c41ab6-5276-48c3-87c5-2491b258b4d6)

