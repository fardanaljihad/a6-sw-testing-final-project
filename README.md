# Pengujian API User Controller dan Aplikasi Swag Labs

## Deskripsi Proyek

Proyek ini bertujuan untuk menguji API User Controller dan aplikasi Swag Labs menggunakan alat-alat pengujian otomatis. Pengujian dilakukan menggunakan Rest Assured untuk API User Controller dan Cucumber dengan Selenium untuk aplikasi Swag Labs. Proyek ini menggunakan Maven sebagai build tool dan ditulis dalam bahasa pemrograman Java.

### Daftar Fitur SUT Swag Labs

1. Login
2. Dashboard
3. Cart
4. Detail Product
5. Checkout
6. Menu

### Daftar Fitur SUT API User Controller

1. Create User
2. Get User
3. Update User
4. Delete User

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

3. **Jalankan Pengujian API User Controller dan Aplikasi Swag Labs**

   - Buka terminal dengan menekan `Ctrl + Shift + ~`.
   - Perintah untuk menjalankan semua test case API User Controller:
     ```bash
     mvn test -Dtest=com.a6.finalproject.apiusercontroller.runners.ApiUserControllerRunCucumberTest
     ```
   - Perintah untuk menjalankan semua test case aplikasi Swag Labs:

     ```bash
     mvn test -Dtest=com.a6.finalproject.swaglabs.runners.SwaglabsRunCucumberTest
     ```

   - Perintah untuk menjalankan test case per fitur:
     ```bash
     mvn test -Dcucumber.filter.tags="@[feature_name]"
     ```
   - Perintah untuk menjalankan test case spesifik:
     ```bash
     mvn test -Dcucumber.filter.name="[scenario]"
     ```

4. **Report yang digenerate oleh tools dapat ditemukan pada folder test-report**

## Struktur Proyek

```
a6-sw-testing-final-project/
│
├── src/
│   └── test/
│       ├── java/com/a6/finalproject/
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
│       └── resources/com/a6/finalproject/
│           ├── apiusercontroller/
│           │   ├── features/
│           │   └── data/
│           └── swaglabs/
│               └── features/
│
├── test-report/
│   ├── api-user-controller-report.html
│   └── swaglabs-report.html/
├── .gitignore
├── pom.xml
└── README.md

```

- **src/test :** Direktori tempat source code proyek disimpan. Terbagi menjadi dua sub-direktori:

  - **java/com/a6/finalproject/ :** Source code (script test) proyek disimpan di direktori ini.
  - **resource/com/a6/finalproject/ :** Direktori ini berisi resource yang diperlukan untuk pengujian API User Controller dan aplikasi Swag Labs.

- **java/com/a6/finalproject/apiusercontroller :** Direktori ini berisi script test untuk pengujian API User Controller.

  - **config/ :** Direktori ini berisi file APIConfig.java untuk mendefinisikan spesifikasi request, yaitu header dan content-type.

- **java/com/a6/finalproject/swaglabs :** Direktori ini berisi script test untuk pengujian aplikasi Swag Labs.

- **runners/ :** Folder runners berisi file konfigurasi untuk menjalankan script test dan meng-generate report secara otomatis.

- **steps/ :** Folder steps berisi file untuk mengimplementasikan steps-steps pada file .feature sesuai dengan konteks bisnis yang diperlukan.

- **utils/ :** Folder utils berisi file HelperClass untuk memanggil driver yang akan digunakan untuk pengujian.

- **actions/ :** Folder actions berisi file untuk mendefinisikan action-action yang bisa dilakukan di suatu halaman website dan dibutuhkan untuk pengujian.

- **locators/ :** Folder locators berisi file untuk mendefinisikan elemen-elemen yang ada di suatu halaman dan diperlukan untuk pengujian.

- **features/ :** Folder feature berisi file untuk membuat Gherkin scenario dari setiap fitur yang akan diuji.

- **data/ :** Folder data berisi file json untuk mendefinisikan data yang akan dikirim pada request body.

- **target/ :** Direktori ini dihasilkan oleh Maven saat proyek dikompilasi. Berisi file-file hasil kompilasi seperti file bytecode, file JAR, dan hasil pembuatan lainnya.

- **.gitignore :** File ini berisi daftar file dan direktori yang diabaikan oleh Git saat proses pelacakan perubahan (version control), berguna untuk menyimpan file-file sementara atau hasil kompilasi.

- **pom.xml :** Ini adalah file konfigurasi utama untuk proyek Maven. Di dalamnya, ditentukan dependensi proyek, pengaturan pembuatan, konfigurasi plugin, dan informasi proyek lainnya seperti nama, versi, dan deskripsi.

## Penulis

Ditulis oleh Kelompok A6:

- Fardan Al Jihad
- M. Naufal Al Ghani
- Yayang Setia Budi
