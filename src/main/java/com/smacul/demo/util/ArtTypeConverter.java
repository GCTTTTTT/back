package com.smacul.demo.util;

/**
 * @projectName: back
 * @package: com.smacul.demo.util
 * @className: ArtTypeConverter
 * @author: GCT
 * @description: TODO
 * @date: 2024/3/15 22:19
 * @version: 1.0
 */
public class ArtTypeConverter {
    public static String convertArtType(String artType) {
        switch (artType) {
            case "মতামত":
                return "news_society";
            case "দেশ":
                return "news_tech";
            case "অন্যান্য":
                return "news_military";
            case "উপসম্পাদকীয়":
                return "news_fashion";
            case "আন্তর্জাতিক":
                return "news_regimen";
            case "সংবাদ":
                return "news_story";
            case "দজাতীয়":
                return "news_essay";
            case "খেলা":
                return "news_game";
            case "আজকের পত্রিকা":
                return "news_history";
            case "লাইফস্টাইল":
                return "news_food";
            case "জাতীয়":
                return "news_entertainment";
            default:
                return artType;
        }
    }
}
