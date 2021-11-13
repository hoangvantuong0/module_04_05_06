package codegym.repository;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryRepository implements Dictionary{
    private static Map<String,String> listMap = new HashMap<>();

    static {
        listMap.put("book","cuốn sách");
        listMap.put("teacher","giáo viên");
        listMap.put("name","tên");
        listMap.put("love","yêu");
        listMap.put("human","con người");
        listMap.put("chicken","con gà");
        listMap.put("girl","con gái");
        listMap.put("boy","con trai");
    }

    @Override
    public String search(String word) {
        if (listMap.containsKey(word)){
            return listMap.get(word);
        }else {
            return null;
        }
    }
    }