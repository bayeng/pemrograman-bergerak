fun main() {


    //matkul Web
    print("sks matkul Web Dasar : ")
    var sks = Integer.valueOf(readLine())
    print("total kelas : ")
    var kelasWeb = Integer.valueOf(readLine())
    var web = sks * kelasWeb

    //Matkul Matematika
    print("sks matkul Matematika : ")
    var sks1 = Integer.valueOf(readLine())
    print("total kelas : ")
    var kelasMatematika = Integer.valueOf(readLine())
    var matematika = sks1 * kelasMatematika

    //Perhitungan
    var semuaKelas = kelasMatematika + kelasWeb
    var skswajib = 6
    var totalSks =  web + matematika - skswajib

    //soal 1
    var gaji1 = totalSks * 28000

    //soal 2
    print("total pertemuan : ")
    var absen = Integer.valueOf(readLine())
    var gaji2 = absen * (totalSks.toFloat()/semuaKelas) * 16000f


    //soal 3
    print("total mahasiswa  : ")
    var dpa = Integer.valueOf(readLine())
    var gaji3 = dpa *5000

    //soal 4
    var totalKotor = gaji1 + gaji2 + gaji3

    //soal5
    var totalbersih : Int = (totalKotor - (totalKotor*0.05)).toInt()

    //nota gaji
    printGaji(totalSks,absen,gaji1,gaji2,gaji3,totalKotor,totalbersih)
}

fun printGaji(sks : Int,absen : Int, gajisks : Int,gajiAbsen : Float, gajiDpa : Int,gaji1 : Float , gaji2 : Int){

    println("========= NOTA GAJI ===========")
    println("Nama : Bayu Krisna")
    println("total pertemuan : $absen")
    println("total sks : $sks")
    println("Gaji dari sks : $gajisks")
    println("gaji dari pertemuan : $gajiAbsen")
    println("gaji DPA : $gajiDpa")
    println("Gaji Kotor : $gaji1")
    println("Gaji Bersih : $gaji2")
}
