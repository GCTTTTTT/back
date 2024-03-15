package com.smacul.demo.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param null:
 * @return null
 * @author 86139
 * update: 3.15 将中文-英文 改为孟加拉语-英文
 * @description TODO
 * @date 2024/3/15 22:34
 */

public class TypeHandler {

    private static final String[] ch = {"综合", "社会", "娱乐", "科技", "军事", "体育", "汽车", "财经", "国际", "时尚", "旅游", "探索",
            "育儿", "养生", "故事", "美文", "游戏", "历史", "美食"};
    private static final String[] mango = {"মতামত", "দেশ", "অন্যান্য", "উপসম্পাদকীয়", "আন্তর্জাতিক", "সংবাদ", "দজাতীয়", "খেলা", "আজকের পত্রিকা", "লাইফস্টাইল", "জাতীয়"};
    private static final String[] en = {"news_global", "news_society", "news_entertainment", "news_tech", "news_military", "news_sports",
            "news_car", "news_finance", "news_world", "news_fashion", "news_travel",
            "news_discovery", "news_baby", "news_regimen", "news_story", "news_essay",
            "news_game", "news_history", "news_food"};
//    private static final String[] mango_en = {"cfc_news_society","cfc_news_tech","cfc_news_military","cfc_news_fashion","cfc_news_regimen","cfc_news_story","cfc_news_essay","cfc_news_game","cfc_news_history","cfc_news_food","cfc_news_entertainment"};
    private static final String[] mango_en = {"news_society","news_tech","news_military","news_fashion","news_regimen","news_story","news_essay","news_game","news_history","news_food","news_entertainment"};

    //public static List<String> sortTypeEn(List<Integer> nums) {
    //    Map<String, Integer> dictionary = new HashMap<>();
    //    for (int i = 0; i < nums.size(); i++) {
    //        dictionary.put(en[i+1], nums.get(i));
    //    }
    //
    //}

    //public static List<String> sortTypeCh(List<Integer> nums) {
    //
    //}

    public static List<String> typeTransAllEnToCh(List<String> enTypes) {
        for (int i = 0; i < enTypes.size(); i++) {
            for (int j = 0; j < en.length; j++) {
                if (enTypes.get(i).equals(en[j])) {
                    enTypes.set(i, ch[j]);
                }
            }
        }
        enTypes.add(0, "综合");
        return enTypes;
    }

    /**
     * 不出意外的话, 这个方法应该用不到.
     *
     * @param chTypes
     * @return
     */
    public static List<String> typeTransAllChToEn(List<String> chTypes) {
        for (int i = 0; i < chTypes.size(); i++) {
            for (int j = 0; j < ch.length; j++) {
                if (chTypes.get(i).equals(ch[j])) {
                    chTypes.set(i, en[j]);
                }
            }
        }
        chTypes.add(0, "news_global");
        return chTypes;
    }
    
    public static String typeTransSingleEnToCh(String enType) {
//        update: 3.15 en - mango
//        for (int i = 0; i < en.length; i++) {
//            if (enType.equals(en[i])) {
//                return ch[i];
//            }
//        }
        for (int i = 0; i < mango_en.length; i++) {
            if (enType.equals(mango_en[i])) {
                return mango[i];
            }
        }
        return null;
    }
    
    public static String typeTransSingleChToEn(String chType) {
//        for (int i = 0; i < ch.length; i++) {
//            if (chType.equals(ch[i])) {
//                return en[i];
//            }
//        }
//        update:3.15 mango-en
        for (int i = 0; i < mango.length; i++) {
            if (chType.equals(mango[i])) {
                return mango_en[i];
            }
        }
        return null;
    }
    
}
