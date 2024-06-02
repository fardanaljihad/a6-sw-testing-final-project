# Pengujian API User Controller dan Aplikasi Swag Labs

## Deskripsi Proyek
Proyek ini bertujuan untuk menguji API User Controller dan aplikasi Swag Labs menggunakan alat-alat pengujian otomatis. Pengujian dilakukan menggunakan Rest Assured untuk API User Controller dan Cucumber dengan Selenium untuk aplikasi Swag Labs. Proyek ini menggunakan Maven sebagai build tool dan ditulis dalam bahasa pemrograman Java.

## Persyaratan
Sebelum menjalankan atau berkontribusi pada proyek ini, pastikan sistem Anda memenuhi persyaratan berikut:
- Java JDK 8+
- Maven
- Editor kode seperti IntelliJ IDEA atau Visual Studio Code (opsional)

## Instalasi dan Penggunaan
1. **Unduh atau Salin Proyek**: Unduh atau salin repositori ini ke dalam sistem Anda.
   ```bash
   git clone https://github.com/fardanaljihad/a6-sw-testing-final-project.git
   ```

2. **Buka Proyek**: Buka proyek menggunakan editor kode pilihan Anda.

3. **Jalankan Uji API User Controller**:
   - Buka terminal dengan menekan `Ctrl + Shift + ~`.
   - Perintah untuk menjalankan test case spesifik:
     ```bash
     mvn test -Dtest=[Test Class name]#[Test case name].
     ```

4. **Jalankan Uji Aplikasi Swag Labs**:
   - Buka terminal dengan menekan `Ctrl + Shift + ~`.
   - Perintah untuk menjalankan test case spesifik:
     ```bash
     mvn test -Dcucumber.filter.name="[scenario]"
     ```

## Struktur Proyek
```
a6-sw-testing-final-project/
│
├── src/
│   └── test/
│       ├── java/com/a6/finalproject
│       │   ├── apiusercontroller/
│       │   │   ├── config/
│       │   │   ├── runners/
│       │   │   ├── steps/
│       │   │   └── utils/
│       │   └── swaglabs/
│       │       ├── actions/
│       │       ├── locators/
│       │       ├── runners/
│       │       ├── steps/
│       │       └── utils/
│       └── resources/com/a6/finalproject
│           ├── apiusercontroller/
│           │   ├── features/
│           │   └── data/
│           └── swaglabs/
│               └── features/
│
├── .gitignore
├── pom.xml
└── README.md

```

## Penulis
Ditulis oleh Kelompok A6:
- Fardan Al Jihad
- M. Naufal Al Ghani
- Yayang Setia Budi
