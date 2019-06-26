package com.studio.suku.submission2;

import java.util.ArrayList;
import java.util.Locale;

public class Data {

    public static String[][] engData = new String[][]{
            {"Bumblebee",
                    "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg"},
            {"Avengers Infinity War",
                    "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"},
            {"Aquaman",
                    "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"},
    };

    public static String[][] indData = new String[][]{
            {"Bumblebee",
                    "Dalam pelarian pada tahun 1987, Bumblebee menemukan tempat perlindungan di tempat barang rongsokan di kota pantai kecil California. Charlie, di puncak usia 18 dan berusaha menemukan tempatnya di dunia, menemukan Bumblebee, bekas luka pertempuran dan patah. Ketika Charlie menghidupkannya, dia dengan cepat mengetahui bahwa ini bukan bug VW kuning biasa.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg"},
            {"Avengers Infinity War",
                    "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"},
            {"Aquaman",
                    "Dulunya merupakan rumah bagi peradaban paling maju di Bumi, Atlantis sekarang merupakan kerajaan bawah laut yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan yang sangat besar, Orm berencana untuk menaklukkan orang-orang samudera yang tersisa dan kemudian ke permukaan dunia. Yang menghalangi jalannya adalah Arthur Curry, saudara tiri manusia setengah manusia Orm dan pewaris sejati takhta.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"},
    };

    public static ArrayList<Item> getListData(){
        ArrayList<Item> list = new ArrayList<>();
        //Kita Deteksi Source Language Nya dulu
        if (Locale.getDefault().getDisplayLanguage() == "en_US" ||  Locale.getDefault().getDisplayLanguage() == "en_GB") {
            for (String[] aData : engData){
                Item item = new Item();
                item.setName(aData[0]);
                item.setDecs(aData[1]);
                item.setPhoto(aData[2]);
                //Janga Kelupaan Ini
                list.add(item);
            }
        }
        else {
            for (String[] aData : indData){
                Item item = new Item();
                item.setName(aData[0]);
                item.setDecs(aData[1]);
                item.setPhoto(aData[2]);
                //Janga Kelupaan Ini
                list.add(item);
            }
        }
        return list;
    }

}
