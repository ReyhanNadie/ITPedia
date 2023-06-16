package com.example.itpedia;

public class BankSoal {
    public String pertanyaan[] = {
            "Apa pengertian dari komputer? ", "Siapakah orang yang menciptakan mesin analitik pada tahun 1837?","Apa yang membedakan komputer transistor dengan komputer tabung vakum? ","Apa yang memungkinkan pembuatan komputer yang lebih kecil dan lebih cepat pada tahun 1960-an?","Teknologi seperti apa yang terus mengubah cara kita menggunakan komputer pada tahun 2000-an? ",
            "Komponen pada komputer yang digunakan untuk melakukan pengolahan data dan instruksi-instruksi yang diberikan kepadanya adalah… ", "Komponen pada komputer yang digunakan untuk menyimpan data dan program-program secara permanen adalah… ", "Komponen pada komputer yang menghubungkan semua komponen lainnya adalah… ", "Komponen pada komputer yang menyediakan listrik untuk semua komponen lainnya adalah… ","Komponen pada komputer yang bertanggung jawab untuk menghasilkan tampilan grafis pada layar monitor adalah… ",
            "Jenis komputer yang menggunakan sinyal analog untuk memproses informasi adalah... ", "Jenis komputer yang menggabungkan teknologi analog dan digital adalah... ", "Jenis komputer yang menggunakan prinsip fisika kuantum untuk memproses informasi adalah... ", "Jenis komputer yang menggunakan prinsip biologi untuk memproses informasi adalah... ", "Jenis komputer yang menggunakan sinar cahaya untuk memproses informasi adalah... ",
            "Siapakah ilmuwan yang dianggap sebagai 'Bapak Komputer' dan merancang mesin analitik pertama?",
            "Pada tahun berapakah ENIAC, komputer elektronik pertama yang beroperasi, dinyalakan?",
            "Komputer pertama yang menggunakan transistor sebagai pengganti tabung hampa adalah:",
            "Kapan World Wide Web (WWW) ditemukan?",
            "Komputer generasi ketiga ditandai dengan penggunaan komponen apa?"
    };
    private String pilihanJawaban[][]={
            {"Suatu alat elektronik yang dapat memproses data dengan cepat dan efisien", "Suatu alat mekanik yang dapat digunakan untuk memproses data matematika","Suatu alat yang digunakan untuk bermain game", "Suatu alat yang digunakan untuk membuat makanan"},
            {"John Atanasoff", "Charles Babbage", "Thomas Edison", "Alexander Graham Bell"},
            {"Ukuran yang lebih kecil", "Lebih lambat", "Lebih besar", "Harganya lebih mahal"},
            {"Komputer chip terintegrasi", "Komputer personal", "Koneksi internet", "Kecepatan dan kapasitas yang semakin tinggi"},
            {"Kecepatan dan kapasitas yang semakin tinggi", "Blockchain", "Kecerdasan buatan", "Koneksi internet"},
            {"Memori", "Hard Disk Drive", "Motherboard", "Central Processing Unit"},
            {"Memori", "Hard Disk Drive", "Motherboard", "Central Processing Unit"},
            {"Memori", "Hard Disk Drive", "Motherboard", "Central Processing Unit"},
            {"Memori", "Hard Disk Drive", "Motherboard", "Power Suplay Unit"},
            {"Input/Output Devices", "Kartu Grafis", "Central Processing Unit", "Memori"},
            {"Komputer digital", "Komputer hybrid", "Komputer quantum", "Komputer analog"},
            {"Komputer digital", "Komputer hybrid", "Komputer quantum", "Komputer biologis"},
            {"Komputer digital", "Komputer digital", "Komputer quantum", "Komputer sinar cahaya"},
            {"Komputer digital", "Komputer hybrid", "Komputer quantum", "Komputer biologis"},
            {"Komputer digital", "Komputer digital", "Komputer quantum", "komputer sinar cahaya"},
            {"Charles Babbage", "Alan Turing", "John von Neumann", "Tim Berners-Lee"},
            {"1936", "1942", "1945", "1951"},
            {"UNIVAC I", "IBM 360", "ENIAC", "EDSAC"},
            {"1969", "1974", "1989", "1995"},
            {"Transistor", "Tabung hampa", "Integrated Circuit (IC)", "Magnetic Core Memory"}
    };
    private String jawabanBenar[]={
            "Suatu alat elektronik yang dapat memproses data dengan cepat dan efisien",
            "Charles Babbage",
            "Ukuran yang lebih kecil",
            "Komputer chip terintegrasi",
            "Kecerdasan buatan",
            "Central Processing Unit",
            "Hard Disk Drive",
            "Motherboard",
            "Power Supply Unit",
            "Kartu Grafis",
            "Komputer analog",
            "Komputer hybrid",
            "Komputer quantum",
            "Komputer biologis",
            "Komputer sinar cahaya",
            "Charles Babbage",
            "1945",
            "UNIVAC I",
            "1989",
            "Integrated Circuit (IC)"
    };
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }
    public String getPilihanJawaban4(int x){
        String jawaban4 = pilihanJawaban[x][3];
        return jawaban4;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
