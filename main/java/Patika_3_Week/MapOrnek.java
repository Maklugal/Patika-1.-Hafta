package Patika_3_Week;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapOrnek {
    public static void main(String[] args) {

        // LinledHashMap tanımlanıyor (ekleme sırasını korur)
        Map<String, Integer> scores = new LinkedHashMap<>();

        // Map'e veriler ekleniyor

        scores.put(" Ali ", 85);
        scores.put(" Ayşe ", 92);
        scores.put(" Mehmet ", 78);
        scores.put(" Zeynep ", 90);
        scores.put(" Burak ", 88);

        // Her bir entry satır satır yazdırılıyor
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
